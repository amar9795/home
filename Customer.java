import java.time.LocalDate;

public class Customer{
    private int customerId;
    private String customerName;
    private LocalDate dateOfBirth;
    private String contactNumber;
    private String emailAddress;
    private double monthlyIncome;
    private String profession;
    private double totalMonthlyExpenses;
    private String designation;
    private String companyName;

    public int getCustomerId() {
        return customerId;
    }

    public int setCustomerId(int customerId) {
        this.customerId = customerId;
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String setCustomerName(String customerName) {
        this.customerName = customerName;
        return customerName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public LocalDate setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return null;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
        return contactNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return emailAddress;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public double setMonthlyIncome(double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
        return monthlyIncome;
    }

    public String getProfession() {
        return profession;
    }

    public String setProfession(String profession) {
        this.profession = profession;
        return profession;
    }

    public double getTotalMonthlyExpenses() {
        return totalMonthlyExpenses;
    }

    public double setTotalMonthlyExpenses(double totalMonthlyExpenses) {
        this.totalMonthlyExpenses = totalMonthlyExpenses;
        return totalMonthlyExpenses;
    }

    public String getDesignation() {
        return designation;
    }

    public String setDesignation(String designation) {
        this.designation = designation;
        return designation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String setCompanyName(String companyName) {
        this.companyName = companyName;
        return companyName;
    }

    public double calculateDBR(){
        double dbr = getTotalMonthlyExpenses()/getMonthlyIncome();
        return dbr;
    }

    public double calculateMaxEligibleEMI(){
        double maxEMI = (getMonthlyIncome()-getTotalMonthlyExpenses()-getMonthlyIncome()*.2)/2;
        return maxEMI;
    }
}
