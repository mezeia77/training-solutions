package introinheritance.employee;

import introinheritance.employee.BigBoss;
import introinheritance.employee.Boss;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BossTest {

    @Test
    public void testCreateBoss() {
        Boss boss = new Boss("John Doe", "1117 Budapest, Budafoki út 56.", 500_000, 3);

        assertEquals(boss.getName(), "John Doe");
        assertEquals(boss.getAddress(), "1117 Budapest, Budafoki út 56.");
        assertEquals(boss.getSalary(), 650_000.0);
        assertEquals(boss.getNumberOfEmployees(), 3);
    }

    @Test
    public void testCreateBigBoss() {
        BigBoss boss = new BigBoss("John Doe", "1117 Budapest, Budafoki út 56.", 1_000_000, 6, 200_000);

        assertEquals(boss.getName(), "John Doe");
        assertEquals(boss.getAddress(), "1117 Budapest, Budafoki út 56.");
        assertEquals(boss.getSalary(), 1_800_000.0);
        assertEquals(boss.getNumberOfEmployees(), 6);
    }
}
