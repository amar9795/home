import java.time.LocalDate;

public class Loan {
    private int loanId;
    private String loanType;
    private double loanAmount;
    private int tenure;
    private double roi;
    enum loanStatus {approved, pending, reject};
    private double emiPerMonth;
    private LocalDate loanDisbursalDate;
    private double maxEligibleLoanAMount;
    private int repaymentFrequency;

    public int getLoanId() {
        return loanId;
    }

    public void setLoanId(int loanId) {
        this.loanId = loanId;
    }

    public String getLoanType() {
        return loanType;
    }

    public void setLoanType(String loanType) {
        this.loanType = loanType;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    public double getEmiPerMonth() {
        return emiPerMonth;
    }

    public void setEmiPerMonth(double emiPerMonth) {
        this.emiPerMonth = emiPerMonth;
    }

    public LocalDate getLoanDisbursalDate() {
        return loanDisbursalDate;
    }

    public void setLoanDisbursalDate(LocalDate loanDisbursalDate) {
        this.loanDisbursalDate = loanDisbursalDate;
    }

    public double getMaxEligibleLoanAMount() {
        return maxEligibleLoanAMount;
    }

    public void setMaxEligibleLoanAMount(double maxEligibleLoanAMount) {
        this.maxEligibleLoanAMount = maxEligibleLoanAMount;
    }

    public int getRepaymentFrequency() {
        return repaymentFrequency;
    }

    public void setRepaymentFrequency(int repaymentFrequency) {
        this.repaymentFrequency = repaymentFrequency;
    }

    double calculateEMI(){
        double finalRoi = getRoi()*.01/getRepaymentFrequency();
        double n = getTenure()*getRepaymentFrequency();
        double power = Math.pow((1+finalRoi),n);
        double emi =(getLoanAmount()*finalRoi)/(1-(1/power));
        return emi;
    }

    public void generateRepaymentSchedule() {


        double finalRoi = roi * 0.01;
        double roiAndNoOfPayment = finalRoi /getRepaymentFrequency();
        double n = getTenure() * getRepaymentFrequency();
        double power = Math.pow((1 + roiAndNoOfPayment), n);
        emiPerMonth = (getLoanAmount() *roiAndNoOfPayment) / (1 - 1 / power);
        System.out.println("Monthly Installment is:" + emiPerMonth);
        double openingBalance = getLoanAmount();
        double principalComponent = 0;
        double interestComponent = 0;
        double installment = emiPerMonth;
        for (int i = 0; i <= n; i++) {


            openingBalance = openingBalance - principalComponent;
            interestComponent = openingBalance * (finalRoi / repaymentFrequency);
            principalComponent = installment - interestComponent;
            System.out.println("Installment No:" + "  " + i + "  " + "Opening Balance:" + "  " + openingBalance + "  " + "Principal Component:" + "  " + principalComponent + "  " + "IntersetComponent:" + "  " + interestComponent + "  " + "Inatallment:" + "  " + installment);

        }
    }

//    double calculateLatePenalty(LocalDate currentDate){
//        currentDate
//    }

    void calculateEligibleLoanAmount(){
        Customer c = new Customer();
        double E = c.calculateMaxEligibleEMI(); //Max Eligible EMI
        double effectiveRoi = getRoi()*0.01;
        double power = Math.pow((1+effectiveRoi),getTenure());
        double maxEligibleLoanAmount = (E*(power)-1)/effectiveRoi*power;
        System.out.println("MaX Eligible Loan Amount:" + maxEligibleLoanAmount);

    }
}
