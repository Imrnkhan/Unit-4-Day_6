package Bank_Q3;

public class Axis extends Bank{
    double rateOfInterst;

    @Override
    public void displayDetails() {
        // TODO Auto-generated method stub
        // super.displayDetails();
        System.out.println("---------------");
        System.out.println("Branch Nmae: Axis bank");
        System.out.println("Ifsc Code: Axix51262");
        System.out.println("Rate of Interst:"+rateOfInterst);
        getCreditCard();
    }

    public void getCreditCard(){
        System.out.println("get cradit card from Axis bank");
    }

    
    

}
