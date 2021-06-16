public class BankTest {

    public static void main(String[] args) {

        Bank a = new A();
        Bank b = new B();
        Bank c = new C();

        a.setDepositAmount(1000);
        b.setDepositAmount(140);
        c.setDepositAmount(2050);

        a.getBalance();
        b.getBalance();
        c.getBalance();


    }


}


