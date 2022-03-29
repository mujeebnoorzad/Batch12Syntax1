package com.class18;

public class AccountTester {
    public static void main(String[] args) {
    Account account=new Account();
    // System.out.println(account.userName);
    //System.out.println(account.password);
    //System.out.println(account.balance);
    //System.out.println(account.accountNumber);
        /*
        accessing a field directly is different
        from accessing the same field with methods
        having different access modifier
         */
    //  account.printUserName(); private access
        account.printPassword();
        account.printBalance();
        account.printAccountNumber();


}
}
