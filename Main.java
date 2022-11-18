/* 
 * Lab Sheet 4
 */

/* Question 1
 Make a BankAccount Class. This Class should provide a constructor, 
 three mutators and three accessors of the type that a bank account might need. 
 
 In the Main class (i.e. this class) create two different BankAccount instances 
 from its main method (i.e. two BankAccount objects). 
 Demonstrate the use of your mutators and accessors within that same main method.
*/

class Main {
    public static void main(String[] args) {
        Bank account1 = new Bank("Maru", 123);
        Bank account2 = new Bank("Rika", 666);
        account1.info();
        account1.take_loan(1500);
        account1.info();
        account1.top_up(1700);
        account1.repay_loan(1700);
        account1.info();
    }
  }
