
public class CreditAccount extends AbstractBankAccount {

  int creditLimit;

  CreditAccount(String name, int num, int amt, int creditLimit) {
    super(name, num, amt);
    this.creditLimit = creditLimit;

  }

  //overloaded constructor for CreditAccount
  CreditAccount(String name, int num, int amt) {
    super(name, num, amt);
    this.creditLimit = calculateCreditLimit(amt);

  }

  //modifier to set the account creditlimit
  public void setcreditlimit(int num) {
    creditLimit = num;
  }

  //accessor to get the account creditlimit
  public int getcreditlimit() {

    return creditLimit;
  }

  @Override
  public void deposit(int amt) {
    balance = balance + amt;
  }//end method deposit

  private static int calculateCreditLimit(int amt) {
    if (amt > 1 && amt <= 2000) {
      return 100;
    } else if (amt <= 4000) {
      return 200;
    } else {
      return 300;
    }
//endif
  }//end method calculateCreditLimit

  //print method
  public void print() {

    System.out.println(
        super.toString() +
        "\nCredit Limit : " + creditLimit);
  }//end method print
}
