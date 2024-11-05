int vanillaPrice = 39; 
int chocolatePrice = 48; 
int strawberryPrice = 23; 
int conePrice = 100;

void orderIceCream() {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    System.out.print("Select flavor (v)anilla, (c)hocolate, (s)trawberry: ");
    String flavorChoice = scanner.nextLine().trim().toLowerCase();

    int pricePerScoop = 0;
    switch (flavorChoice) {
        case "v":
            pricePerScoop = vanillaPrice;
            break;
        case "c":
            pricePerScoop = chocolatePrice;
            break;
        case "s":
            pricePerScoop = strawberryPrice;
            break;
        default:
            System.out.println("Flavor not available.");
            return;
    }

    System.out.print("Enter number of scoops (1-3): ");
    int scoops = scanner.nextInt();
    if (scoops < 1 || scoops > 3) {
        System.out.println("Invalid scoop count. Must be between 1 and 3.");
        return;
    }

    int totalCostPence = conePrice + (pricePerScoop * scoops);
    int pounds = totalCostPence / 100;
    int pence = totalCostPence % 100;

    System.out.printf("Total: £%d.%02d\n", pounds, pence);
    scanner.close();
}

orderIceCream();