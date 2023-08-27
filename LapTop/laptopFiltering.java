package LapTop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class laptopFiltering {
    public static void main(String[] args) {
        Set<laptop1> laptops = (Set<laptop1>) new HashSet<laptop1>();
        laptops.add(new laptop1("Apple", "MacBook Pro", 16, 512, "macOS", "Silver", 1999.99));
        laptops.add(new laptop1("Dell", "XPS 13", 8, 256, "Windows 10", "Rose Gold", 999.99));
        laptops.add(new laptop1("HP", "Spectre x360", 16, 1, "Windows 10", "Nightfall Black", 1399.99));
        laptops.add(new laptop1("Lenovo", "ThinkPad X1 Carbon", 16, 1, "Windows 10", "Black", 1499.99));
        laptops.add(new laptop1("Asus", "ZenBook Pro Duo", 32, 1, "Windows 10", "Celestial Blue", 2499.99));

        Scanner scanner = new Scanner(System.in);
        Map<String, Object> filters = new HashMap<String, Object>();

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем ЖД");
        System.out.println("3 - Операционная система");
        System.out.println("3 - Цвет");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Введите минимальный объем ОЗУ:");
                int minRam = scanner.nextInt();
                filters.put("ram", minRam);
                break;
            case 2:
                System.out.println("Введите минимальный объем ЖД:");
                int minStorage = scanner.nextInt();
                filters.put("storage", minStorage);
                break;
            case 3:
                System.out.println("Введите желаемый цвет:");
                String color = scanner.next();
                filters.put("color", color);
                break;
            default:
                System.out.println("Некорректный ввод.");
                return;
        }

        Set<laptop1> filteredLaptops = filterLaptops(laptops, filters);
        if (filteredLaptops.isEmpty()) {
            System.out.println("Ноутбуки с заданными параметрами не найдены.");
        } else {
            System.out.println("Найденные ноутбуки:");
            for (laptop1 laptop : filteredLaptops) {
                System.out.println(laptop);
            }
        }
    }

    public static Set<Laptop> filterLaptops(Set<laptop1> laptops, Map<String, Object> filters) {
        Set<laptop1> filteredLaptops = (Set<laptop1>) new HashSet<laptop1>();
        for (laptop1 laptop : laptops) {
            boolean meetsCriteria = true;
            for (String filter : filters.keySet()) {
                Object value = filters.get(filter);
                switch (filter) {
                    case "ram":
                        if (laptop.getRam() < (int) value) {
                            meetsCriteria = false;
                        }
                        break;
                    case "storage":
                        if (laptop.getStorage() < (int) value) {
                            meetsCriteria = false;
                        }
                        break;
                    case "color":
                        if (!laptop.getColor().equalsIgnoreCase((String) value)) {
                            meetsCriteria = false;
                        }
                        break;
                    default:
                        System.out.println("Некорректный фильтр.");
                        break;
                }
            }
            if (meetsCriteria) {
                filteredLaptops.add(laptop);
            }
        }
        return filteredLaptops;
    }
}