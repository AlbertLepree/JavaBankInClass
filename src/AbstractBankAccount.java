public abstract class AbstractBankAccount {

  // class variables
  String accountname;
  int accountnum;
  int balance;
  public final String BANK = "JavaBank";

  //overloaded constructor for Account
  AbstractBankAccount(String name, int num, int amt) {
    accountname = name;
    accountnum = num;
    balance = amt;
  }

  //make a deposit to the balance
  public void deposit(int amt) {
    balance = balance + amt;
  }

  //make a withdrawal from the balance
  public void withdraw(int amt) {
    balance = balance - amt;
  }

  //modifier to set the accountname
  public void setaccountname(String name) {
    accountname = name;
  }

  //modifier to set the accountnumber
  public void setaccountnum(int num) {
    accountnum = num;
  }

  //modifier to set the balance
  public void setbalance(int num) {
    balance = num;
  }

  //accessor to get the accountname
  public String getaccountname() {

    return accountname;
  }

  //accessor to get the accountnumber
  public int getaccountnum() {

    return accountnum;
  }

  //accessor to get the account balance
  public int getbalance() {

    return balance;
  }

  //accessor to get the bank name
  public String getBankName() {
    return InterfaceBankAccount.BANK; // uses the String from InterfaceBankAccount
  }

  //print method
  public void print() {
    System.out.println("Bank Name: " + getBankName() + "\n" +
        "Account Holder: " + accountname + "\n" +
        "Account Number: " + accountnum + "\n" +
        "Account Balance: " + balance + "\n");
  }

}//end class AbstractBankAccount