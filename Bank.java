public class Bank {
    private float balance = 0.0f;
    private float loan = 0.0f;
    private boolean took_loan = false;
    private String name;
    private int pin;
    public Bank(String name, int pin){
		this.name = name;
        this.pin = pin;
	}
    public void top_up(float top_up){
		balance = balance + top_up;
        System.out.format("your account was topped up by %.3f pounds\n", top_up);
        System.out.format("your balance is %.3f pounds\n", balance);
	}
    public void pay(float payment){
        if(payment<=balance)
        {
            balance = balance - payment;
            System.out.format("your just payed %f pounds\n", payment);
            System.out.format("your balance is %f pounds\n", balance);
        }
	}
    public void take_loan(float howmuch){
		balance = balance + howmuch;
        took_loan = true;
        loan = howmuch;
        System.out.format("you took a loan of %.3f pounds\n", howmuch);
        System.out.format("your balance is %.3f pounds\n", balance);
	}
    public void repay_loan(float repay)
    {
        if(loan<=balance)
        {
            if(repay>loan)
            {
                repay = repay - (repay-loan);
            }
            balance = balance - repay;
            loan = loan - repay;
            System.out.format("Paid %.3f, Remaining loan %.3f\n", repay, loan);
        }
        else
        {
            System.out.format("Your balance is not enough");
        }
        if(loan == 0)
        {
            took_loan = false;
        }
    }
    public void info(){
        System.out.format("Name of the holder %s\n", name);
        System.out.format("Balance %.3f\n", balance);
        if(took_loan)
        {
            System.out.println("!--------------------------------------------!");
            System.out.format("Dear %s, you have a loan of %.3f to repay.", name, loan);
            System.out.format("\n!--------------------------------------------!\n");
        }
    }
}
