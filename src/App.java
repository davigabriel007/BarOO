import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Bill bill = new Bill();

        Scanner sc = new Scanner(System.in);

        System.out.println("Customer gender:");
        bill.gender = sc.next().charAt(0);

        System.out.println("Enter the number of the beers drinked:");
        bill.beer = sc.nextInt();

        System.out.println("Enter the number of softdrinks drinked:");
        bill.softDrink = sc.nextInt();

        System.out.println("Enter the number of barbecue ate:");
        bill.barbecue = sc.nextInt();

        System.out.println("Expenses:");
        System.out.printf("Food: R$ %.2f\n",  Bill.feeding(bill.beer, bill.barbecue, bill.softDrink));
        System.out.printf("Couvert: R$ %.2f\n", bill.cover());
        System.out.printf("Ticket: R$ %.2f\n", Bill.ticket(bill.gender));

        sc.close();
    }
}
