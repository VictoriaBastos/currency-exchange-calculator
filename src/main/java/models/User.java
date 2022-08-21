package models;

public class User {
    private Double value;
    private String currency;
    private Double finalValue;

    public User(Double value, String currency) {
        this.value = value;
        this.currency = currency;
    }

    public Double getValue() {
        return value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getFinalValue() {
        return finalValue;
    }

    public void setFinalValue(Double value) {
        this.finalValue = value;
    }
}
