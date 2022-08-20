package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElectronicsShopTest {

    @Test
    public void testGetMoneySpentMethod(){
        ElectronicsShop shop = new ElectronicsShop();
        int[] keyboards = {40, 50, 60};
        int[] drives = {5, 8, 12};

        int result = shop.getMoneySpent(keyboards, drives, 60);
        assertEquals(58, result);
    }

}