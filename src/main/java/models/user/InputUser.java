package models.user;

public class InputUser {
    private Double inputValue;
    private Integer currency;

    public InputUser() {
        this.inputValue = getInputValue();
        this.currency = getCurrency();
    }

    public Double getInputValue() {
        return this.inputValue;
    }

    public Integer getCurrency() {
        return this.currency;
    }

    public void setInputValue(Double inputValue) {
        this.inputValue = inputValue;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }
}
