package Bank_Q3;
import java.util.Scanner;
public class Main {

    public static Bank getBank(String bank){
        if(bank.equals("axis")){
            Axis a = new Axis();
            a.rateOfInterst = 12;
            return a;
        }
        else if(bank.equals("icici")){
            ICICI i = new ICICI();
            i.rateOfInterst= 13;
            return i;
        }
else return null;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter abnk name:");
        String bankname = sc.nextLine();
        Bank b1 = Main.getBank(bankname);
        if(b1==null){
            System.out.println("Invalid bank name");
        }
        else
        b1.displayDetails();
        sc.close();
    }
}
