import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
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

    public boolean registration(){
        Customer customer = new Customer();
        System.out.println("Enter Customer Id");
        int CstId = customer.setCustomerId(sc.nextInt());
        System.out.println("Enter Customer Name");
        String name = customer.setCustomerName(sc.nextLine());
        System.out.println("Enter Date Of Birth");
        LocalDate dob = customer.setDateOfBirth(LocalDate.parse(sc.nextLine()));
        System.out.println("Enter Contact Number");
        String phoneno = customer.setContactNumber(sc.nextLine());
        System.out.println("Enter Email Address");
        String email = customer.setEmailAddress(sc.nextLine());
        System.out.println("Enter Monthly Income");
        double income = customer.setMonthlyIncome(sc.nextDouble());
        System.out.println("Enter Profession");
        String profession = customer.setProfession(sc.nextLine());
        System.out.println("Enter Total Monthly Expenses");
        double expenses = customer.setTotalMonthlyExpenses(sc.nextDouble());
        System.out.println("Enter Designation");
        String designation = customer.setDesignation(sc.nextLine());
        System.out.println("Enter Company Name");
        String comapnyName = customer.setCompanyName(sc.nextLine());

        Connection con=null;
        Statement statement=null;

        try{
            con= DBconnection.createConnection();
            con.setAutoCommit(false);
            statement=con.createStatement();
            String query="INSERT INTO login VALUES ('"+CstId+"','"+name+"','"+dob+"','"+phoneno+"','"+email+"','"+income+"','"+profession+"','"+expenses+"','"+designation+"','"+comapnyName+"');";
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



}
