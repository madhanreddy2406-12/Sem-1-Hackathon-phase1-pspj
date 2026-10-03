import java.util.Scanner;

class Totalwaste {

    static double calculateTotalWaste(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter waste at point 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter waste at point 2: ");
        double b = sc.nextDouble();

        double total = calculateTotalWaste(a, b);

        System.out.println("Total Waste: " + total + " kg");
    }
}