package junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class JunitTest {

    @Test

    public void test0() {
        int a = 11;
        int b = 15;
        int actualtotal;
        int expectedtotal = 26;
        actualtotal = a + b;
        Assert.assertEquals(expectedtotal, actualtotal);
        System.out.println("test 0 passed");
    }

    @Test

    public void test1() {
        int a = 11;
        int b = 15;
        int actualtotal;
        int expectedtotal = -4;
        actualtotal = a - b;
        Assert.assertEquals(expectedtotal, actualtotal);
        System.out.println("test 1 passed");
    }

    @Test

    public void test2() {
        int a = 11;
        int b = 15;
        int actualtotal;
        int expectedtotal = 165;
        actualtotal = a * b;
        Assert.assertEquals(expectedtotal, actualtotal);
        System.out.println("test 2 passed");
    }

    @Test
    public void test3() {
        int a = 25;
        int b = 5;
        int actualtotal;
        int expectedtotal = 5;
        actualtotal = a / b;
        Assert.assertEquals(expectedtotal, actualtotal);
        System.out.println("test 3 passed");
    }

    @Test
    public void test4() {
        String txt = "This is Programming java ";
        String sub1 = "Programming";
        boolean result = txt.contains(sub1);
        boolean actualresult = true;
        boolean expectedresult = true;
        Assert.assertEquals(expectedresult, actualresult);
        System.out.println("test 4 passed");
    }

    @Test
    public void test5() {
        String txt = "never give up";
        String sub2 = "winner";

        Assert.assertTrue(txt.contains(sub2));
        System.out.println("test 5 passed");

    }

    @Test
    public void test6() {
        char[] data1 = {'c', 'h', 'r', 'o', 'm', 'e'};
        char[] data = "chrome".toCharArray();

        Assert.assertArrayEquals(data1, data);
        System.out.println("test 6 passed");

    }

    @Test
    public void test7() {
        char[] succer = {'b', 'a', 'l', 'l'};
        char[] data = "foot".toCharArray();

        Assert.assertArrayEquals(succer, data);
        System.out.println("test 7 passed");

    }

    @Test
    public void test8() {
        Map<String, String> vehicle = new HashMap<>();

        vehicle.put("nissan", "elantra");
        vehicle.put("toyota", "camry");
        vehicle.put("honda", "civic");
        vehicle.put("chevrolet", "malibu");
        Assert.assertTrue(vehicle.containsKey("honda"));
        System.out.println("test 8 passed");

    }

    @Test
    public void test9() {
        Map<String, Integer> fruit = new HashMap<>();

        fruit.put("apple", 5);
        fruit.put("peach", 4);
        fruit.put("banana", 3);
        fruit.put("walermelon",1);
        Assert.assertTrue(fruit.containsValue(6));
        System.out.println("test 9 passed");
    }
}

