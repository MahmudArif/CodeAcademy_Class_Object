public class bankloan {
	public static void main(String[] args) {
int carLoan =10000;
  int loanLength=5;
  int interestRate=5;
  int downPayment=2000;
    
  if(loanLength<=0 || interestRate<=0){
    System.out.println("Error! You must take out a valid car loan");
    }
    else if(downPayment>=carLoan){
      System.out.println("The car can be paid in full");
      }
    else if(carLoan>=40000){
      System.out.println("The car loan is outside maximum amount");
      }
    else {
      int remainingBalance= carLoan-downPayment;
      int months=loanLength*12;
      int monthlybalance=remainingBalance/months;
      int interest=(monthlybalance*interestRate)/100;
        int monthlypayment=monthlybalance+interest;
      System.out.println(monthlypayment);
      do {
    	  System.out.println(downPayment);
      }while (downPayment < 1990);
      
      
      
    }
  
	

	}
}
