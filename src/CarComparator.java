import java.util.Scanner;

public class CarComparator {
    private double x1; //Price of CNG+Petrol variant.
    private double x2; //Price of Petrol variant.
    private int time; //How long are you planning to keep the vehicle.
    private double range; //Around how much the car is driven per year.

    public void comparingCars() {
        double fuel_x1 = time*range*50/25;
        double fuel_x2 = time*range*80/20;
        System.out.println("You will spend "+fuel_x1+" rupees on fuel in "+time+" years if you buy CNG+Petrol variant.");
        System.out.println("You will spend "+fuel_x2+" rupees on fuel in "+time+" years if you buy Petrol variant");
        double value_x1 = x1+fuel_x1;
        double value_x2 = x2+fuel_x2;
        if (value_x1 <= value_x2) {
            System.out.println("Buy the CNG+Petrol variant.\nOver a "+time+" year period, it will be "
                        +(value_x2-value_x1)+" rupees cheaper.");
        }
        else System.out.println("Buy the Petrol variant.\nOver a "+time+" year period, it will be "
                        +(value_x1-value_x2)+" rupees cheaper.");
    }

    public CarComparator(double x1, double x2, int time, double range) {
        this.x1 = x1;
        this.x2 = x2;
        this.time = time;
        this.range = range;
    }
}

class BhadiyaComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the cost of CNG+Petrol variant - ");
        double p1 = scanner.nextDouble();
        System.out.println("Please enter the cost of the Petrol variant - ");
        double p2 = scanner.nextDouble();
        System.out.println("How long are you planning to keep the vehicle?");
        int t = scanner.nextInt();
        System.out.println("Around how many kilometers can you drive in total in a year?");
        double r = scanner.nextInt();
        CarComparator cc = new CarComparator(p1,p2,t,r);
        cc.comparingCars();
    }
}