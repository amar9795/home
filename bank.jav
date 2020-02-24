import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bank {

    private Loan[] loan = new Loan[100];
    private Customer[] customer = new Customer[100];
    private static Bank bank;
    private static int count, c;

    public static Bank getObj(){
        if(bank == null)
            bank = new Bank();
        return bank;
    }
    Scanner sc = new Scanner(System.in);
  //  Customer customer = new Customer();
    public boolean registration() throws ParseException {
        Customer customer = new Customer();
        System.out.println("Enter Customer Id");
        int CstId = customer.setCustomerId(sc.nextInt());
        System.out.println("Enter Customer Name");
        sc.nextLine();
        String name = customer.setCustomerName(sc.nextLine());
        System.out.println("Enter Date Of Birth");
        String date = sc.nextLine();
        SimpleDateFormat format=new SimpleDateFormat("dd/mm/yyyy");
        Date dob= format.parse(date);
        System.out.println("Enter Contact Number");
        String phoneno = customer.setContactNumber(sc.nextLine());
        System.out.println("Enter Email Address");
        String email = customer.setEmailAddress(sc.nextLine());
        System.out.println("Enter Monthly Income");
        double income = customer.setMonthlyIncome(sc.nextDouble());
        System.out.println("Enter Profession");
        sc.nextLine();
        String profession = customer.setProfession(sc.nextLine());
        System.out.println("Enter Total Monthly Expenses");
        double expenses = customer.setTotalMonthlyExpenses(sc.nextDouble());
        System.out.println("Enter Designation");
        sc.nextLine();
        String designation = customer.setDesignation(sc.nextLine());
        System.out.println("Enter Company Name");
        String comapnyName = customer.setCompanyName(sc.nextLine());

        Connection con=null;
        Statement statement=null;

        try{
            con= DBconnection.createConnection();
            con.setAutoCommit(false);
            statement=con.createStatement();
            String query="INSERT INTO Customer VALUES ('"+CstId+"','"+name+"','"+dob+"','"+phoneno+"','"+email+"','"+income+"','"+profession+"','"+expenses+"','"+designation+"','"+comapnyName+"');";
            statement.executeUpdate(query);
            con.commit();
            return true;
        } catch ( SQLException e) {
            e.printStackTrace();
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        }
        finally{
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false ;

    }

    boolean findCustomer(){
        Customer customer = new Customer();
        System.out.println("Enter the Customer Id");
        int custId = sc.nextInt();
        Connection con=null;
        Statement statement=null;

        try{
            con= DBconnection.createConnection();
            con.setAutoCommit(false);
            statement=con.createStatement();
            String query="Select CustId from Customer";
            statement.executeUpdate(query);
            con.commit();
            return true;
        } catch ( SQLException e) {
            e.printStackTrace();
            try {
                con.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }

        }
        finally{
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    void boolean applyLoan(){
        Loan loan = new Loan();
        System.out.println("");
    }



}
