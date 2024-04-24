package brightway_week_3.computer_shop;

import java.util.ArrayList;

class ComputerShop {
    private ArrayList<Computer> computers = new ArrayList<>();

    public void addComputer(Computer computer) {
        computers.add(computer);
    }

    public double calculateProfit() {
        double totalProfit = 0;
        for (Computer computer : computers) {
            totalProfit += computer.getSellingPrice() - computer.getPurchasePrice();
        }
        return totalProfit;
    }
}
