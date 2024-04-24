package brightway_week_3.computer_shop;

public class ComputerTest {
    public static void main(String[] args) {
        ComputerShop shop = new ComputerShop();

        // Creating 5 example computer objects with purchase and selling prices
        Computer computer1 = new Computer("Dell", 15.5, true,500,750);
        Computer computer2 = new Computer("Acer", 17.0, false,800,1000);
        Computer computer3 = new Computer("Apple", 10000, 64, 1, 4, 19, "Mac", true, 1500, 2000);
        Computer computer4 = new Computer("HP", 8000, 32, 2, 3, 17, "Laptop", false, 1000, 1500);
        Computer computer5 = new Computer("Dell", 9000, 16, 1, 2, 15, "Desktop", true, 1200, 1800);
         // Print computer values
        System.out.println(" computer 1: "+computer1);
        System.out.println(" computer 1: "+computer1);
        // Double size Ram
        System.out.println(" Double size Ram of computer 3: "+computer3.doubleValueOfRam());
        System.out.println(" Double size Ram of computer 1: "+computer1.doubleValueOfRam());

        // Adding computers to the shop
        shop.addComputer(computer1);
        shop.addComputer(computer2);
        shop.addComputer(computer3);
        shop.addComputer(computer4);
        shop.addComputer(computer5);

        // Calculating and printing the potential profit of the shop
        System.out.println("Potential profit of the shop: $" + shop.calculateProfit());
    }
}
