package bankcustomers;

import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;


public class MyFacade {


    AccountIf acc ;
    CustomerIf cust;


    private static MyFacade myFacadeObj = null;
        public MyFacade() {}


    public static MyFacade getMyFacade(){
        if (myFacadeObj == null) {
            myFacadeObj = new MyFacade();
        }
        return myFacadeObj;
    }

    public void doDeposit(double amt , CustomerIf cust,int accNo){
        acc = cust.getAccount(accNo);
        acc.deposit(amt);

    }
   public void getbankAccount(CustomerIf cust,int accNo){
       acc = cust.getAccount(accNo);
       System.out.println("Account number " + acc.getAccountNumber() + " has " + acc.getBalance());
   }

   public void getBanCustomer(CustomerIf cust){

        System.out.println("All Account of "+cust.getCustomerName());
        ArrayList<AccountIf> accounts = cust.getllAccounts();
            for(AccountIf account : accounts) {
            System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
       }
   }

}
