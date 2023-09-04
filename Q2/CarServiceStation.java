import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

class CarServiceStation {
    private Map<String, Map<String, Integer>> services;
    private int totalBill;

    public CarServiceStation() {
        services = new HashMap<>();
        totalBill = 0;

        // Initialize services and their prices for different car types
        services.put("BS01", createServiceMap(2000, 4000, 5000));
        services.put("EF01", createServiceMap(5000, 8000, 10000));
        services.put("CF01", createServiceMap(2000, 4000, 6000));
        services.put("BF01", createServiceMap(1000, 1500, 2500));
        services.put("GF01", createServiceMap(3000, 6000, 8000));
    }

    private Map<String, Integer> createServiceMap(int hatchbackPrice, int sedanPrice, int suvPrice) {
        Map<String, Integer> serviceMap = new HashMap<>();
        serviceMap.put("Hatchback", hatchbackPrice);
        serviceMap.put("Sedan", sedanPrice);
        serviceMap.put("SUV", suvPrice);
        return serviceMap;
    }

    public void generateBill(String carType, String[] serviceCodes) {
        System.out.println("Car Service Station Bill");
        System.out.println("Type of Car: " + carType);
        System.out.println("Service Details:");

        for (String serviceCode : serviceCodes) {
            if (services.containsKey(serviceCode)) {
                Map<String, Integer> serviceMap = services.get(serviceCode);
                int serviceCharge = serviceMap.get(carType);
                System.out.println(getServiceName(serviceCode) + ": ₹" + serviceCharge);
                totalBill += serviceCharge;
            } else {
                System.out.println("Service with code " + serviceCode + " not found.");
            }
        }

        System.out.println("Total Bill: ₹" + totalBill);
        if (totalBill > 10000) {
            System.out.println("Complimentary cleaning included in the bill.");
        }
    }

    private String getServiceName(String serviceCode) {
        switch (serviceCode) {
            case "BS01":
                return "Basic Servicing";
            case "EF01":
                return "Engine Fixing";
            case "CF01":
                return "Clutch Fixing";
            case "BF01":
                return "Brake Fixing";
            case "GF01":
                return "Gear Fixing";
            default:
                return "Unknown Service";
        }
    }


}
