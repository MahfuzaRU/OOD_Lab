

public class Cashier extends Approver {
    public void approve(double amount){
        if(amount < 10000){
            System.out.println("approved by cashier");
        }
        else{
            nextApprover.approve(amount);
        }
    }
}
