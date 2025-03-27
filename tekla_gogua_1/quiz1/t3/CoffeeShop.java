package tekla_gogua_1.quiz1.t3;

public class CoffeeShop {
    // Revenue-related variables
    int pricePerCoffee = 250; // tetri
    int numCoffeeSold = 100;
    int totalCostOfBeans = 15000; // tetri
    
    // Expenses
    int Tax = 51 * 100;          // 51 lari → 5100 tetri
    int Water = 75;              // 75 tetri (exact value)
    int Gas = 159;               // 159 tetri (exact value)
    int Electricity = 148 * 100; // 148 lari → 14800 tetri
    int Parking = 51 * 100;      // 51 lari → 5100 tetri
    
    // Calculate total other expenses
    int otherExpenses = Tax + Water + Gas + Electricity + Parking;
    
    // Total expenses (beans + other expenses)
    int totalExpenses = totalCostOfBeans + otherExpenses;

    // Profit calculation
    double profit = calculateProfit(pricePerCoffee, numCoffeeSold, totalCostOfBeans, otherExpenses);

    public static double calculateProfit(int pricePerCoffee, int numCoffeeSold, 
                                      int totalCostOfBeans, int otherExpenses) {
        // Calculate total revenue in tetri
        int totalRevenue = pricePerCoffee * numCoffeeSold;
        
        // Calculate profit in tetri
        int profitInTetri = totalRevenue - (totalCostOfBeans + otherExpenses);
        
        // Convert to laris
        return profitInTetri / 100.0;
    }

    public static void main(String[] args) {
        CoffeeShop shop = new CoffeeShop();
        
        System.out.println("Profit Calculation Details:");
        System.out.println("-------------------------");
        System.out.println("Coffee sold: " + shop.numCoffeeSold + " cups");
        System.out.println("Revenue: " + (shop.pricePerCoffee * shop.numCoffeeSold / 100.0) + " GEL");
        System.out.println("\nExpenses (exact values as specified):");
        System.out.println("Tax: " + (shop.Tax / 100.0) + " GEL");
        System.out.println("Water: " + (shop.Water / 100.0) + " GEL");
        System.out.println("Gas: " + (shop.Gas / 100.0) + " GEL");
        System.out.println("Electricity: " + (shop.Electricity / 100.0) + " GEL");
        System.out.println("Parking: " + (shop.Parking / 100.0) + " GEL");
        System.out.println("Coffee beans: " + (shop.totalCostOfBeans / 100.0) + " GEL");
        System.out.println("\nTotal expenses: " + (shop.totalExpenses / 100.0) + " GEL");
        System.out.println("Profit: " + shop.profit + " GEL");
    }
}
