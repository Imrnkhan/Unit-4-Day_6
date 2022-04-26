package Hostller;

import java.time.Year;
import java.util.Scanner;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class Main {
    public static Hostller getHouseDetails() {
        Scanner sc = new Scanner(System.in);

        Hostller hs = new Hostller();
        System.out.println("StudentId:");

        int stuId = Integer.parseInt(sc.nextLine());

        System.out.println("StudentName:");
        String stuName = sc.nextLine();
        System.out.println("department Id:");
        int departId = Integer.parseInt(sc.nextLine());
        System.out.println("Gender:");
        String gender = sc.nextLine();

        System.out.println("Phone No:");
        String phone = sc.nextLine();
        System.out.println("Hostel Name");
        String hostelName = sc.nextLine();
        System.out.println("Room Number:");
        int roomNumber = Integer.parseInt(sc.nextLine());

        System.out.println("Modify room Number");
        String modiRoomNo = sc.nextLine();
        if (modiRoomNo.equals("Y")) {
            System.out.println("newRoom No:");
            roomNumber = Integer.parseInt(sc.nextLine());
            hs.setRoomNumber(roomNumber);
        } else {
            hs.setRoomNumber(roomNumber);
        }
        System.out.println("Modify Phone Number(Y/N");
        String modiphoneNo = sc.nextLine();
        if (modiphoneNo.equals("Y")) {
            System.out.println("New Phone Number:");
            phone = sc.nextLine();
            hs.setPhone(phone);
        } else {
            hs.setPhone(phone);
        }
        hs.setStudentId(stuId);
        hs.setName(stuName);
        hs.setGender(gender);
        hs.setHostelName(hostelName);
        sc.close();
        return hs;

    }

    public static void main(String[] args) {

        Hostller hs1 = Main.getHouseDetails();

        System.out.println("--------------------Stdudent Detais-----------------------------");

        System.out.println("Student Details" + " " + hs1.getStudentId() + "  " + hs1.getName() + "  "
                + hs1.getDepartmentId() + "  " + hs1.getGender() + "  " + hs1.getPhone() + "  " + hs1.getHostelName()
                + "  " + hs1.getRoomNumber());
    }

}
