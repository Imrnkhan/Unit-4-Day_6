package Collage_Q2;

public class Hosteller extends Student {
    private double hsotelFee;

    public Hosteller() {

    }

    public Hosteller(double hsotelFee) {
        super();
        this.hsotelFee = hsotelFee;
    }

    public double getHsotelFee() {
        return hsotelFee;
    }

    public void setHsotelFee(double hsotelFee) {
        this.hsotelFee = hsotelFee;
    }

    @Override
    public double payfee() {
        // TODO Auto-generated method stub
        // return super.payfee();
        Hosteller hs = new Hosteller();
        double fee = hs.getExamFee();
        return this.hsotelFee+fee;
    }

}
