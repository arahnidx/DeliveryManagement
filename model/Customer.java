package model;

public class Customer extends Person{

    private float Credit;
    

    public float getCredit() {
        return Credit;
    }

    public void setCredit(float credit) {
        Credit = credit;
    }

    @Override
    public String toString() {
        return "Customer [Credit=" + Credit + "]";
    }

    

}
