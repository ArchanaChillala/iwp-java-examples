package com.archana.mobile;

import java.util.ArrayList;
import java.util.Arrays;

public class Entry {

    public static void main(String[] args) {
        ArrayList mobiles = new ArrayList() {{

            add(new Mobile("123", "Iphone6", 34000.0, "ios", 10.0, 10.0,
                    Arrays.asList("Black", "Grey"), "Apple", 4, 250, 10000,
                    new Camera(12, true, true), 28, true, new Dimension(10, 6, 4)));
            add(new Mobile("145", "Galaxy", 20000, "android", 10.0, 10.0,
                    Arrays.asList("Black", "Gold"), "Samsung", 4, 250, 10000,
                    new Camera(12, true, false), 28, true, new Dimension(12, 8, 5)));
            add(new Mobile("222", "Iphone5", 44000.0, "ios", 10.0, 10.0,
                    Arrays.asList("Black", "Grey"), "Apple", 4, 250, 10000,
                    new Camera(10, true, true), 28, true, new Dimension(10, 6, 1)));
            add(new Mobile("111", "Galaxy", 15000, "android", 10.0, 10.0,
                    Arrays.asList("Black", "Gold"), "Samsung", 4, 250, 10000,
                    new Camera(12, true, false), 28, true, new Dimension(12, 8, 2)));
        }};

        MobileApplication app = new MobileApplication(mobiles);

        System.out.println(app.filterByRearCamera());
        System.out.println(app.filterByBrandAndDimensionWidth("Apple"));
        System.out.println(app.filterByOSAndPriceRange("ios", 10000, 50000));
        System.out.println(app.getDevicesCountByBrand());
        System.out.println(app.sortByPrice());
    }
}
