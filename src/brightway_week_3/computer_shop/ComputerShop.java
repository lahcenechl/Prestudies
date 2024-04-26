package brightway_week_3.computer_shop;

import java.util.ArrayList;


class ComputerShop {
    private ArrayList<Computer> computers = new ArrayList<>(); // creating ArrayListe to populate with computer values

    // this Method in ComputerShop will be used ComputerTest to add created Computers
    public void addComputer(Computer computer) {
        computers.add(computer);
    }

   // Calculate Profit
    public double calculateProfit() {
        double totalProfit = 0;
        for (Computer computer : computers) { // loop through ArrayList
            totalProfit += computer.getSellingPrice() - computer.getPurchasePrice(); // calculate TotalProfit
        }
        return totalProfit;
    }
}
