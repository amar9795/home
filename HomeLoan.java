public class HomeLoan extends SecuredLoan{
    private String builderName;
    private int propertySize;
    private double propertyValue;

    public String getBuilderName() {
        return builderName;
    }

    public void setBuilderName(String builderName) {
        this.builderName = builderName;
    }

    public int getPropertySize() {
        return propertySize;
    }

    public void setPropertySize(int propertySize) {
        this.propertySize = propertySize;
    }

    public double getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(double propertyValue) {
        this.propertyValue = propertyValue;
    }


}
