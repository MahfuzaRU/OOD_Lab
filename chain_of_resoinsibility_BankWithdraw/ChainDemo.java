

public class ChainDemo {
    public static void main(String[] args) {
        Approver cashier = new Cashier();
        Approver senior = new SeniorOfficer();
        Approver manager = new Manager();

        cashier.setNext(senior);
        senior.setNext(manager);

        cashier.approve(5000);
        cashier.approve(50000);
        cashier.approve(2000000);
    }

}
