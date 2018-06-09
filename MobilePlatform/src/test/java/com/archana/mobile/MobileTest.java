package com.archana.mobile;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MobileTest {
    private Mobile mobile;

    @Before
    public void setUp() {
        mobile = new Mobile("123", "Iphone6", 34000.0, "ios", 10.0, 10.0,
                Arrays.asList("Black", "Grey"), "Apple", 4, 250, 10000,
                new Camera(12, true, true), 28, true, new Dimension(10, 6, 4));
    }

    @Test
    public void returnTrueIfMobileHasRearCamera() {
        assertTrue(mobile.hasRearCamera());
    }

    @Test
    public void returnTrueIfMobileHasPriceInTheGivenPriceRange() {
        assertTrue(mobile.getByPriceRange(15000, 40000));
    }

    @Test
    public void returnTrueIfMobileHasWidthLessThanGivenWidth() {
        assertTrue(mobile.hasWidthLessThan(5));
    }

    @Test
    public void returnTrueIfMobileHasResolutionMoreThanGivenResolution() {
        assertTrue(mobile.hasResolutionMoreThan(10));
    }

}