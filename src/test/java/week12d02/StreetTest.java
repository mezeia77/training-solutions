package week12d02;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StreetTest {

    Site site = new Site(0, 10, Fence.PERFECT);
    Site site2 = new Site(0, 7, Fence.NEED_UPGRADE);
    Site site3 = new Site(1, 12, Fence.NEED_UPGRADE);
    Site site4 = new Site(0, 9, Fence.PERFECT);
    Site site5 = new Site(0, 11, Fence.NO_FENCE);
    Site site6 = new Site(1, 13, Fence.PERFECT);
    Street street = new Street();

    @Test
    void sellSiteTest() {
        assertEquals(0, site.getSide());
        assertEquals(10, site.getLength());
        assertEquals(0, site2.getSide());
        assertEquals(7, site2.getLength());
        assertEquals(Fence.NEED_UPGRADE, site2.getFence());

        street.sellSite(site);
        street.sellSite(site2);
        assertEquals(2, street.getSites().size());
    }

    @Test
    void lastSoldTest(){
        assertThrows(IllegalArgumentException.class, ()-> street.lastSold());
        street.sellSite(site);
        assertEquals(2, street.lastSold());
        street.sellSite(site2);
        assertEquals(4, street.lastSold());
        street.sellSite(site3);
        assertEquals(1, street.lastSold());
        street.sellSite(site4);
        assertEquals(6, street.lastSold());
        street.sellSite(site5);
        assertEquals(8, street.lastSold());
        street.sellSite(site6);
        assertEquals(3, street.lastSold());
    }

    @Test
    void fenceStatListTest(){
        street.sellSite(site);
        street.sellSite(site2);
        street.sellSite(site3);
        street.sellSite(site4);
        street.sellSite(site5);
        street.sellSite(site6);
        assertEquals(Fence.NO_FENCE, street.fenceStatList().get(2).getFence());
        assertEquals(1, street.fenceStatList().get(2).getQty());
        assertEquals(Fence.NEED_UPGRADE, street.fenceStatList().get(1).getFence());
        assertEquals(2, street.fenceStatList().get(1).getQty());
        assertEquals(Fence.PERFECT, street.fenceStatList().get(0).getFence());
        assertEquals(3, street.fenceStatList().get(0).getQty());
    }
}