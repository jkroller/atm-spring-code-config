package th.ac.ku.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ATMConfig.class);

        ATM atm = context.getBean(ATM.class);
        String name = atm.validateCustomer(1,1234);
        System.out.println( name + " has " + atm.getBalance());
        atm.deposit(100);
        System.out.println( name + " has " + atm.getBalance());

        Bank bank = context.getBean(Bank.class);
        System.out.println( bank.getName() );
    }
}
