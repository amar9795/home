///*
//import java.time.LocalDate;
//
//import static java.time.temporal.ChronoUnit.DAYS;
//
//public class Bank implements Checker ,Maker {
//    private  Loan loan[]=new Loan[100];
//    private Customer cu[]=new Customer[100];
//    private static Bank bank;
//
//    private static int count,c;
//
//    private Bank() {
//        super();
//    }
//
//    public static Bank getObj(){
//        if(bank == null)
//            bank = new Bank();
//        return bank;
//    }
//
//    public Customer registeration(String customerName, String contactNo, String emailAddress, String profession, String designation, String companyName, double income, double expenses, LocalDate dob, double experience)
//    {
//        cu[c++]=new Customer(customerName,contactNo,emailAddress,profession,designation,companyName,income,expenses,dob,experience);
//        return cu[c-1];
//    }
//    public Loan applyLoan(int customerid,double loanAmount,int tenure,LocalDate loanDisbusalDate,
//                          int repaymentFrequency,String builderName,int propertySize,double propertyValue ){
//        Customer customer=null;
//        int flag=0;
//        for(int i=0;i<cu.length;i++)
//        {
//            if(cu[i]==null)
//            {
//                break;
//            }
//            else if(cu[i].getCustomerId()==customerid)
//            {
//                customer=cu[i];
//                flag=1;
//                break;
//            }
//        }
//
//        if(flag==1) {
//            double roi=6;
//
//
//            String loanType = "SECURED";
//            LoanStatus loanStatus = LoanStatus.PENDING;
//            loan[count++] = new HomeLoan(customer, loanAmount, roi, tenure, loanType, loanStatus,
//                    repaymentFrequency, builderName, propertySize, propertyValue, loanDisbusalDate);
//
//            loan[count - 1].setLoanId(count);
//            loan[count - 1].setLoanStatus(LoanStatus.PENDING);
//            loan[count - 1].setLoanType(LoanType.HOME.toString());
//            return loan[count - 1];
//        }
//
//        return null;
//
//    }
//
//
//    public Loan applyLoan(int customerid,int tenure,int repaymentSchedule,double loanAmount,LocalDate loanDisbusalDate,String vehicleCategory, String vehicleModelNo, String manufacturer, int yearOfManufacture, double assetValue ){
//        Customer customer=null;
//        int flag=0;
//        for(int i=0;i<cu.length;i++)
//        {
//            if(cu[i]==null)
//            {
//                break;
//            }
//            else if(cu[i].getCustomerId()==customerid)
//            {
//                customer=cu[i];
//                flag=1;
//                break;
//            }
//        }
//
//        if(flag==1) {
//            double roi = 8;
//
//
//            String loanType = "SECURED";
//            LoanStatus loanStatus = LoanStatus.PENDING;
//            loan[count++] = new VehicleLoan(customer, tenure, repaymentSchedule, loanType, loanDisbusalDate, loanAmount, roi, loanStatus,
//                    vehicleCategory, vehicleModelNo,
//                    manufacturer, yearOfManufacture, assetValue);
//            loan[count - 1].setLoanId(count);
//            loan[count - 1].setLoanStatus(LoanStatus.PENDING);
//            loan[count - 1].setLoanType(LoanType.VEHICLE.toString());
//            return loan[count - 1];
//
//
//        }
//        return null;
//
//
//    }
//
//    public Loan applyLoan(int customerid,int tenure, int repaymentSchedule,   double loanAmount,  LocalDate loanDisbusalDate,
//                          String qualification, double workExperience ) {
//        Customer customer=null;
//        int flag=0;
//        for(int i=0;i<cu.length;i++)
//        {
//            if(cu[i]==null)
//            {
//                break;
//            }
//            else if(cu[i].getCustomerId()==customerid)
//            {
//                customer=cu[i];
//                flag=1;
//                break;
//            }
//        }
//
//        if(flag==1) {
//
//            double roi=10;
//
//            String loanType = "UNSECURED";
//            LoanStatus loanStatus = LoanStatus.PENDING;
//            loan[count++] = new PersonalLoan(customer, tenure, repaymentSchedule, loanType, loanAmount, roi, loanDisbusalDate,
//                    qualification, workExperience);
//            loan[count - 1].setLoanId(count);
//            loan[count - 1].setLoanType(LoanType.PERSONAL.toString());
//            loan[count - 1].setLoanStatus(LoanStatus.PENDING);
//            return loan[count - 1];
//        }
//
//        return null;
//    }
//    public Customer findCustomer(int id)
//    {for(int i=0;i<cu.length;i++)
//    {
//        if(cu[i]==null)
//        {
//            return null;
//        }
//        if(cu[i].getCustomerId()==id)
//        {
//            return cu[i];
//        }
//    }
//        return null;
//    }
//
//    public String trackLoanStatus(int loanApplicationId){
//        for(int i=0;loan[i]!=null&&i<loan.length;i++)
//        {
//            if(loan[i].getLoanId()==loanApplicationId)
//            {
//
//                return loan[i].getLoanStatus().toString();
//            }
//        }
//        return "Loan record not found";
//    }
//    public  void approveRejectLoan(int loanApplicationId)
//    {
//    */
///*for(int i=0;i<loan.length;i++)
//    {
//        if(loan[i].getLoanStatus().equals("APPROVED")) {
//            System.out.println(loan[i] + " TRUE");
//        }
//else if(loan[i].getLoanStatus().equals("REJECTED"))
//        {
//            System.out.println(loan[i]+" FALSE");
//        }
//
//    }*//*
//
//        int flag=0;
//        int i=0;
//        for( i=0;i<loan.length;i++) {
//            if(loan[i]==null)
//            {break;
//
//            }
//            else  if(loan[i].getLoanId()==loanApplicationId)
//            {
//                flag=1;
//                break;
//            }
//        }
//        if(flag==1) {
//            Customer cust = loan[i].getCustomer();
//            if ((Customer.maxLoan(cust.getExpenses(), cust.getIncome(), loan[i].getTenure()) < loan[i].getLoanAmount())) {
//
//                loan[i].setLoanStatus(LoanStatus.REJECTED);
//                return;
//                //  removeLoanAccount(loan[i].getLoanId());
//
//            }
//            if (loan[i].getLoanType().equals(LoanType.HOME) || loan[i].getLoanType().equals(LoanType.VEHICLE)) {
//                double ltv;
//                if(loan[i].getLoanType().equals(LoanType.HOME)) {
//                    HomeLoan o = (HomeLoan) loan[i];
//                    ltv = loan[i].getLoanAmount() / o.getPropertyValue();
//                }
//                else
//                {
//                    VehicleLoan assest=(VehicleLoan) loan[i];
//                    ltv=loan[i].getLoanAmount()/ assest.assetValue;
//                }
//                if (ltv > 0.8) {
//                    loan[i].setLoanStatus(LoanStatus.REJECTED);
//                    return;
//                }
//            }
//            if (loan[i].getLoanType().equals(LoanType.PERSONAL)) {
//                if (cust.getIncome() < 500000 && cust.getExperience() < 5) {
//                    loan[i].setLoanStatus(LoanStatus.REJECTED);
//                    return;
//                }
//            }
//            if (cust.dbr() < 0.4) {
//                loan[i].setLoanStatus(LoanStatus.REJECTED);
//                return;
//            }
//            if (loan[i].getLoanType().equals(LoanType.HOME)) {
//                long d = DAYS.between(cust.getDob(), LocalDate.now());
//                long age = d / 365;
//                long tenure = loan[i].getTenure();
//                if ((age + tenure) > 60) {
//                    loan[i].setLoanStatus(LoanStatus.REJECTED);
//                    return;
//                }
//            }
//            loan[i].setLoanStatus(LoanStatus.APPROVED);
//
//        }
//
//    }
//
//
//
//
//
//    public Customer[] getCu() {
//        return cu;
//    }
//
//    @Override
//    public void applyLoan() {
//
//    }
//
//
//
//
//    public Loan[] getLoan() {
//        return loan;
//    }
//
//    public static int getCount() {
//        return count;
//    }
//
//    public void getAllActiveLoanDetails()
//
//    {
//
//        for (int i = 0; i < loan.length; i++) {
//            if(loan[i]==null)
//            {
//                break;
//            }
//            if (loan[i].getLoanStatus().equals(LoanStatus.APPROVED)) {
//                System.out.println(loan[i]);
//            }
//        }
//
//
//    }
//
//    public void getLoanDetails(int loanAccountNumber)
//    {
//        for(int i=0;i<loan.length;i++)
//        {if(loan[i]==null)
//        {
//            System.out.println("Not present");
//            return;
//        }
//        else if(loan[i].getLoanId()==loanAccountNumber)
//        {
//            System.out.println(loan[i]);
//            return;
//        }
//        }
//
//    }
//
//    public boolean removeLoanAccount(int loanAccountNumber)
//    {int i,flag=0;
//        for( i=0;i<loan.length;i++)
//        {if(loan[i]==null)
//        {
//            break;
//        }
//            if(loan[i].getLoanId()==loanAccountNumber)
//            {flag=1;
//                break;
//            }
//        }
//        int j=0;
//        if(flag==1) {
//            for ( j = i; j < loan.length - 1; j++) {
//                loan[j] = loan[j + 1];
//            }
//            loan[j-1]=null;
//            count--;
//            return true;
//        }
//
//
//        return false;
//
//    }
//
//}*/
