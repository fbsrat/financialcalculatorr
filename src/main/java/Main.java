import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read=new Scanner(System.in) ; //accepts the total amount of loan from user
        System.out.println("please enter your total amount of loan ");
        double principal =read.nextDouble();
        System.out.println("please enter the interest  rate in percentage"); //accepts the amount of interest in percentage
        double interestRate=read.nextDouble();
        System.out.println("  please enter the loan length in years");     //accepts the lengh of loan in year
        int loanLenghtInYears= read.nextInt();
           calculateMorgage( principal,interestRate,loanLenghtInYears) ;

    }
    public static void calculateMorgage(double principal,double interestRate,double loanLenghtInYears )
    {
     double r = interestRate /100;     // calculates interest rate
     double i=   r /12;    //i,monthlyRate= annual rate/12
  double n = 12*loanLenghtInYears;   //numberOfMonthlyPayment in years = 12* loan length of years
        double growth =Math.pow(1+i,n) ; //calculates how much loan grows over n months
        double monthly=principal*(i*growth)/(growth-1);//fixed monthly payment
         double totalInterest=(monthly*n)-principal;

  System.out.printf("A $%,.1f loan at %.0f years would have a $%,.2f payment with a $%,.2f total interest %n",principal,loanLenghtInYears ,monthly,

                 totalInterest );
}
}
