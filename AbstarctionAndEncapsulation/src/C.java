public class C extends Bank{

    @Override
    public void setDepositAmount(double amount) {

        depositAmount = amount;
    }

    @Override
    public void getBalance() {
        System.out.println("Bank C has an amount of: "+depositAmount+"$");
    }
}
