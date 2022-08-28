package models.user;

public class OutputUser {

    private Double startValue;
    private String startCurrency;
    private Double IOF;
    private Double totalOperationFee;
    private Double finalValue;
    private String finalCurrency;

    public OutputUser() {
    }

    public OutputUser(Double startValue, String startCurrency, Double IOF,
                      Double totalOperationFee, Double finalValue, String finalCurrency) {
        this.startValue = startValue;
        this.startCurrency = startCurrency;
        this.IOF = IOF;
        this.totalOperationFee = totalOperationFee;
        this.finalValue = finalValue;
        this.finalCurrency = finalCurrency;
    }

    public Double getStartValue() {
        return startValue;
    }

    public void setStartValue(Double startValue) {
        this.startValue = startValue;
    }

    public Double getIOF() {
        return IOF;
    }

    public void setIOF(Double IOF) {
        this.IOF = IOF;
    }

    public Double getTotalOperationFee() {
        return totalOperationFee;
    }

    public void setTotalOperationFee(Double totalOperationFee) {
        this.totalOperationFee = totalOperationFee;
    }

    public Double getFinalValue() {
        return finalValue;
    }

    public void setFinalValue(Double finalValue) {
        this.finalValue = finalValue;
    }

    public String getStartCurrency() {
        return startCurrency;
    }

    public void setStartCurrency(String startCurrency) {
        this.startCurrency = startCurrency;
    }

    public String getFinalCurrency() {
        return finalCurrency;
    }

    public void setFinalCurrency(String finalCurrency) {
        this.finalCurrency = finalCurrency;
    }
}
