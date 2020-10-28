
public class testCreditAccount {


  public static void main(String[] args) {

// Instantiate 3 accounts using constructor with values
    Account a1 = new Account("Sanjay Gupta", 11556, 300);
    Account a2 = new Account("He Xai", 22338, 500);
    Account a3 = new Account("Ilya Mustafana", 44559, 1000);
// Instantiate 2 credit accounts using constructor with
// values which will call constructor from super
    CreditAccount c1 = new CreditAccount("A.N Other", 88776, 500);
    CreditAccount c2 = new CreditAccount("Another", 66778, 3000);
// Print accounts
    a1.print();
    a2.print();
    a3.print();
    c1.print();
    c2.print();
  }
}

