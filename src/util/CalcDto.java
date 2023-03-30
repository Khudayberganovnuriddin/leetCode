package util;

public class CalcDto {
    private String date;
    private Double amount;
    private Double interest;

    public CalcDto(String date, Double amount, Double interest) {
        this.date = date;
        this.amount = amount;
        this.interest = interest;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getInterest() {
        return interest;
    }

    public void setInterest(Double interest) {
        this.interest = interest;
    }
}
