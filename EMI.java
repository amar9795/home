import java.time.LocalDate;

public class EMI {
    private double emiAmount;
    private LocalDate emiDueDate;
    private String status;
    private double principleComponent;
    private double interestComponent;
    private double penaltyCharges;

    public double getEmiAmount() {
        return emiAmount;
    }

    public void setEmiAmount(double emiAmount) {
        this.emiAmount = emiAmount;
    }

    public LocalDate getEmiDueDate() {
        return emiDueDate;
    }

    public void setEmiDueDate(LocalDate emiDueDate) {
        this.emiDueDate = emiDueDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrincipleComponent() {
        return principleComponent;
    }

    public void setPrincipleComponent(double principleComponent) {
        this.principleComponent = principleComponent;
    }

    public double getInterestComponent() {
        return interestComponent;
    }

    public void setInterestComponent(double interestComponent) {
        this.interestComponent = interestComponent;
    }

    public double getPenaltyCharges() {
        return penaltyCharges;
    }

    public void setPenaltyCharges(double penaltyCharges) {
        this.penaltyCharges = penaltyCharges;
    }
}
