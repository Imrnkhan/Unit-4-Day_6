package Hostller;

// again create public class 
public class Hostller extends Student {
    private String hostelName;
    private int roomNumber;

// frist generate getter setter method 
//and generae consturct method


    public Hostller(String hostelName, int roomNumber) {
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }


    public Hostller() {
    }


    public String getHostelName() {
        return hostelName;
    }

    public void setHostelName(String hostelName) {
        this.hostelName = hostelName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
        }
    }