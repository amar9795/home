import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n ;
        HomeLoan homeloan = new HomeLoan();
        VehicleLoan vehicleloan = new VehicleLoan();
        PersonalLoan personalloan = new PersonalLoan();
        Bank bank = new Bank();

        String str;

        do {
            System.out.println("Enter '1' to Register a New Customer");
            System.out.println("Enter '2' to find Details Of a Customer");
            System.out.println("Enter '3' to apply a Loan");
            System.out.println("Enter '4' to track Loan Status");
            System.out.println("Enter '5' to get Details of Rejected Loans");
            System.out.println("Enter '6' to Disburse Loan");
            System.out.println("Enter '7' to find Details Of a Customer");
            System.out.println("Enter '8' pay EMI of Loan");
            System.out.println("Enter '9' Calculate Late Penalty");
            System.out.println("Enter '10' to get Loan Details");
            System.out.println("Enter '11' to get details of all Activated Loan Details");
            n = sc.nextInt();
            switch (n){
                case 1:
                    bank.registration();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:

            }



            System.out.println("If want to exit. Enter 'Exit' ");
            str = sc.nextLine();
        }
        while (str.equalsIgnoreCase("no"));
    }
}
