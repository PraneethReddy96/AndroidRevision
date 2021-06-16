public class A extends Bank{

    @Override
    public void setDepositAmount(double amount) {
        depositAmount = amount;
    }

    @Override
    public void getBalance() {
        System.out.println("Bank A has an amount of: "+depositAmount+"$");
    }
}
