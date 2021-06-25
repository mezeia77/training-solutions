package lambdaintermediate;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Cafe {

    List<CoffeeOrder> orders = new ArrayList<>();

    public Cafe(List<CoffeeOrder> orders) {
        this.orders = orders;
    }

    public Cafe() {
    }

    public void addOrder(CoffeeOrder order){
        orders.add(order);
    }

    public BigDecimal getTotalIncome() {
//        return orders.stream()
//                .flatMap(x->x.getCoffees().stream())
//                .map(Coffee::getPrice)
//                .reduce(BigDecimal.ZERO, BigDecimal::add, BigDecimal::add)
//                .setScale(2, RoundingMode.HALF_UP);

        return orders.stream()
                .flatMap(x->x.getCoffees().stream())
                .map(c->c.getPrice())
                .reduce(BigDecimal.ZERO, (a,b)->a.add(b), (x,y)->x.add(y))
                .setScale(2, RoundingMode.HALF_UP);
    }

    public BigDecimal getTotalIncome(LocalDate date){
        return orders.stream()
                .filter(e->e.getDateTime().toLocalDate().equals(date))
                .flatMap(x->x.getCoffees().stream())
                .map(c->c.getPrice())
                .reduce(BigDecimal.ZERO, BigDecimal::add, BigDecimal::add)
                .setScale(2, RoundingMode.HALF_UP);
    }

    public long getNumberOfCoffee(CoffeeType coffeeType) {
//        return orders.stream()
//                .flatMap(x->x.getCoffees().stream())
//                .map(a->a.getType())
//                .filter(e->e.equals(coffeeType))
//                .count();

        return orders.stream()
                .flatMap(x->x.getCoffees().stream())
                .map(Coffee::getType)
                .filter(coffeeType::equals)
                .count();
    }

    public Collection<CoffeeOrder> getOrdersAfter(LocalDateTime time) {
        return orders.stream()
                .filter(e->e.getDateTime().isAfter(time))
                .collect(Collectors.toList());
    }

    public List<CoffeeOrder> getFirstFiveOrder(LocalDate date) {
        return orders.stream()
                .filter(e->e.getDateTime().toLocalDate().equals(date))
                .sorted(Comparator.comparing(CoffeeOrder::getDateTime))
                .limit(5)
                .collect(Collectors.toList());

//        return orders.stream()
//                .filter(e->e.getDateTime().toLocalDate().equals(date))
//                .sorted((a,b)->a.getDateTime().compareTo(b.getDateTime()))
//                .limit(5)
//                .collect(Collectors.toList());
    }
}
