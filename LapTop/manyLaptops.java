package LapTop;

import java.util.HashSet;
import java.util.Set;

//2. Код для создания множества ноутбуков в Java:
public class manyLaptops {
    public static void main(String[] args) {
        Set<laptop1> laptops = (Set<laptop1>) new HashSet<laptop1>();
        laptops.add(new laptop1("Apple", "MacBook Pro", 16, 512, "macOS", "Silver", 1999.99));
        laptops.add(new laptop1("Dell", "XPS 13", 8, 256, "Windows 10", "Rose Gold", 999.99));
        laptops.add(new laptop1("HP", "Spectre x360", 16, 1, "Windows 10", "Nightfall Black", 1399.99));
        laptops.add(new laptop1("Lenovo", "ThinkPad X1 Carbon", 16, 1, "Windows 10", "Black", 1499.99));
        laptops.add(new laptop1("Asus", "ZenBook Pro Duo", 32, 1, "Windows 10", "Celestial Blue", 2499.99));

        System.out.println("Все ноутбуки:");
        for (laptop1 laptop : laptops) {
            System.out.println(laptop);
        }
    }
}