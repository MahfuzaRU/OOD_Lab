

import java.util.Scanner;

public class ChainDemo {
    public static void main(String[] args) {

        Approver cashier = new Cashier();
        Approver senior = new SeniorOfficer();
        Approver manager = new Manager();

        cashier.setNext(senior);
        senior.setNext(manager);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter amount : ");
        double amount = sc.nextDouble();

        cashier.approve(amount);
        sc.close();
    }
}
