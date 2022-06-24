package model;

public class Customer extends Person{

    private double credit;
    

    public double getCredit() {
        return credit;
    }

    public void setCredit(float credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Customer [credit=" + credit + "]";
    }

    

}
