import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class MobileApplication {
    private List<Mobile> mobiles;

    MobileApplication(List<Mobile> mobiles) {
        this.mobiles = mobiles;
    }

    Map getDevicesCountByBrand() {
        return mobiles.stream()
                .collect(Collectors.groupingBy(Mobile::getBrand, Collectors.counting()));
    }

    List<Mobile> filterByRearCamera() {
        return mobiles.stream()
                .filter(mobile -> mobile.getCamera().isRearCamera())
                .filter(mobile -> mobile.getCamera().getResolution() > 10)
                .collect(Collectors.toList());
    }

    List<Mobile> filterByOSAndPriceRange(String OS, double startPrice, double endPrice) {
        return mobiles.stream()
                .filter(mobile -> OS.equalsIgnoreCase(mobile.getOS()))
                .filter(mobile -> mobile.getPrice() > startPrice && mobile.getPrice() < endPrice)
                .collect(Collectors.toList());
    }

    List<Mobile> filterByBrandAndDimensionWidth(String brand) {
        return mobiles.stream()
                .filter(mobile -> brand.equalsIgnoreCase(mobile.getBrand()))
                .filter(mobile -> mobile.getDimension().getWidth() < 2)
                .collect(Collectors.toList());
    }

    List<Mobile> sortByPrice() {
        return mobiles.stream()
                .sorted(Comparator.comparingDouble(Mobile::getPrice))
                .collect(Collectors.toList());
    }
}
