package Modal;


import Modal.subDepart.CustomerService;
import Modal.subDepart.ShowRoom;
import Modal.subDepart.WorkShop;

import java.util.Scanner;

public class Appointment  {
    String appointment_date;
    String appointment_time;
    User suppose_user;
    SubBranch suppose_branch;

    public Appointment(String appointment_date, String appointment_time, User suppose_user, SubBranch suppose_branch) {
        this.appointment_date = appointment_date;
        this.appointment_time = appointment_time;
        this.suppose_user = suppose_user;
        this.suppose_branch = suppose_branch;
    }

    public String getAppointment_date() {
        return appointment_date;
    }

    public void setAppointment_date(String appointment_date) {
        this.appointment_date = appointment_date;
    }

    public String getAppointment_time() {
        return appointment_time;
    }

    public void setAppointment_time(String appointment_time) {
        this.appointment_time = appointment_time;
    }

    public User getSuppose_user() {
        return suppose_user;
    }

    public void setSuppose_user(User suppose_user) {
        this.suppose_user = suppose_user;
    }

    public SubBranch getSuppose_branch() {
        return suppose_branch;
    }

    public void setSuppose_branch(SubBranch suppose_branch) {
        this.suppose_branch = suppose_branch;
    }


    public void displaying_appointment(){
        System.out.println("Appointment Booking Bill");
        System.out.println("------------------------");
        System.out.println("Location: " + this.suppose_branch.getName());
        System.out.println("Opening Time: " + this.suppose_branch.getOpening_time());
        System.out.println("Closing Time: " + this.suppose_branch.getClosing_time());
        System.out.println("Contact: " + this.suppose_branch.getContact());
        System.out.println("------------------------");
        System.out.println("Customer Name: " + this.suppose_user.getName());
        System.out.println("Appointment Date: " + this.appointment_date);
        System.out.println("Appointment Time: " + this.appointment_time);
        System.out.println("Customer Contact: " + this.suppose_user.contact_no);
        System.out.println("------------------------");
        System.out.println("Your Appointment has been successfully booked.");
        System.out.println("Thank you for your cooperation!");
    }
}
