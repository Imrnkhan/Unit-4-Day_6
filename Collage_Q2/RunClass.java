package Collage_Q2;
import java.util.Scanner;

public class RunClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name:");
        String studntName = sc.nextLine();
        System.out.println(" Enter Sudent Id:");
        int studentId = Integer.parseInt(sc.nextLine());
         System.out.println("Enter Ecam fee:");
         double examFee = Double.parseDouble((sc.nextLine()));

         Student s = new Student( studentId,studntName,examFee);
         s.displayDetails();

         DayScholar ds = new DayScholar();
         ds.setTranspostFee(1500);


         double hsotelFee = ds.payfee();
         System.out.println("HostellFee:"+hsotelFee);
         Hosteller hs = new Hosteller();
         hs.setHsotelFee(6000);
         double transpostFee = hs.payfee();
         System.out.println("TransFee:"+transpostFee);
         sc.close();
    }
    
}
