
public class Account extends AbstractBankAccount {

  String meme = InterfaceBankAccount.BANK;

  private int bonusValue;

  //overloaded constructor for Account
  Account(String name, int num, int amt) {
    super(name, num, (amt + calculateInitialBonusValue(amt)));
  }

  private static int calculateInitialBonusValue(int amt) {
      if (amt >= 1 && amt <= 100) {
          return 10;
      } else if (amt <= 300) {
          return 20;
      } else {
          return 30;
      }
//endif
  }//end method calculateInitialBonusValue

  //make a deposit to the balance
  public void deposit(int amt) {
      if (amt > 100) {
          balance = balance + (amt + (int) (bonusValue * 0.1));
      } else {
          balance = balance + amt;
      }
//endif
  }//end method deposit


}
