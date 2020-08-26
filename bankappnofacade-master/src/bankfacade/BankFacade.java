
package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import bankcustomers.MyFacade;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class BankFacade {
    public static void main(String[] args) {
       ArrayList<AccountIf> cust1Accounts = new ArrayList();
       AccountIf acc = new BankAccount(12345);
       cust1Accounts.add(acc); //acc1ofcus1
       acc = new BankAccount(12346);
       cust1Accounts.add(acc); //acc2ofcus1
       CustomerIf cust1 = new BankCustomer("John", cust1Accounts);


       ArrayList<AccountIf> cust2Accounts = new ArrayList();
       acc = new BankAccount(12347);
       cust2Accounts.add(acc); //acc1ofcus2
       acc = new BankAccount(12348);
       cust2Accounts.add(acc); //acc2ofcus2
       CustomerIf cust2 = new BankCustomer("Sarah", cust2Accounts);


       MyFacade obj = MyFacade.getMyFacade();

       obj.doDeposit(500.00, cust1, 12345);
       obj.doDeposit(1500.00, cust1, 12346);

       obj.doDeposit(2400.00, cust2, 12347);
       obj.doDeposit(6500.00, cust2, 12348);

       obj.getbankAccount(cust1, 12345);
       obj.getbankAccount(cust1, 12346);

       obj.getbankAccount(cust2, 12347);
       obj.getbankAccount(cust2, 12348);

       obj.getBanCustomer(cust1);

    }
    
}
