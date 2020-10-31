package classsctructureconstructors;

public class StoreMain {
    public static void main(String[] args) {

        Store computerStore = new Store("Computer");
        computerStore.in(10);
        System.out.println(computerStore.getProduct() + ": " + computerStore.getStock());

        Store tvStore = new Store("TV");
        tvStore.in(20);
        System.out.println(tvStore.getProduct() + ": " + tvStore.getStock());

        computerStore.out(5);
        tvStore.out(9);
        computerStore.in(21);
        tvStore.in(8);

        System.out.println(computerStore.getProduct() + ": " + computerStore.getStock());
        System.out.println(tvStore.getProduct() + ": " + tvStore.getStock());
    }
}

