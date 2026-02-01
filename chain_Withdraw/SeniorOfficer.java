

public class SeniorOfficer extends Approver {
    public void approve(double amount){
        if(amount >= 10000 && amount <= 1000000){
            System.out.println("Approved by Cashier and Senior officer");
        }else{
            nextApprover.approve(amount);
        }
    }
}
