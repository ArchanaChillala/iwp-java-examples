package com.archana.mobile;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class MobileApplicationTest {
    private static final String SAMSUNG = "Samsung";
    private static final String APPLE = "Apple";

    private MobileApplication mobileApp;
    private Mobile iPhone6;
    private Mobile galaxy;
    private Mobile iPhone5;
    private Mobile galaxy2;

    @Before
    public void setUp() {
        iPhone6 = new Mobile("123", "Iphone6", 34000.0, "ios", 10.0, 10.0,
                Arrays.asList("Black", "Grey"), APPLE, 4, 250, 10000,
                new Camera(12, true, true), 28, true, new Dimension(10, 6, 4));
        galaxy = new Mobile("145", "Galaxy", 20000, "android", 10.0, 10.0,
                Arrays.asList("Grey", "Gold"), SAMSUNG, 4, 250, 10000,
                new Camera(12, true, false), 28, true, new Dimension(12, 8, 5));
        iPhone5 = new Mobile("222", "Iphone5", 44000.0, "ios", 10.0, 10.0,
                Arrays.asList("RoseGold", "Grey"), APPLE, 4, 250, 10000,
                new Camera(10, true, true), 28, true, new Dimension(10, 6, 1));
        galaxy2 = new Mobile("111", "Galaxy2", 15000, "android", 10.0, 10.0,
                Arrays.asList("Black", "Gold"), SAMSUNG, 4, 250, 10000,
                new Camera(12, true, false), 28, true, new Dimension(12, 8, 2));

        List<Mobile> mobiles = Arrays.asList(iPhone6, galaxy, iPhone5, galaxy2);
        mobileApp = new MobileApplication(mobiles);
    }

    @Test
    public void shouldFilterByRearCameraResolution() {
        List<Mobile> expectedList = Arrays.asList(iPhone6);

        assertEquals(expectedList, mobileApp.filterByRearCameraResolution(10));
    }

    @Test
    public void shouldFilterByOSAndPriceRange() {
        List<Mobile> expectedList = Arrays.asList(iPhone6, iPhone5);

        assertEquals(expectedList, mobileApp.filterByOSAndPriceRange("ios", 10000, 50000));
    }

    @Test
    public void shouldFilterByBrandAndWidth() {
        List<Mobile> expectedList = Arrays.asList(iPhone5);

        assertEquals(expectedList, mobileApp.filterByBrandAndWidth(APPLE, 2));
    }

    @Ignore
    @Test
    public void shouldCountDevicesByBrand() {
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put(APPLE, 2);
        expectedMap.put(SAMSUNG, 2);

        assertEquals(expectedMap, mobileApp.countMobilesByBrand());
    }

    @Test
    public void shouldSortMobilesByPrice() {
        List<Mobile> expectedList = Arrays.asList(galaxy2, galaxy, iPhone6, iPhone5);

        assertEquals(expectedList, mobileApp.sortByPrice());
    }
}
