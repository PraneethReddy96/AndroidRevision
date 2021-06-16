public class B  extends  Bank{

    @Override
    public void setDepositAmount(double amount) {

        depositAmount = amount;
    }
    @Override
    public void getBalance() {
        System.out.println("Bank B has an amount of: "+depositAmount+"$");
    }
}
