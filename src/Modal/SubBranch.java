package Modal;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class SubBranch {

    public String name;
    public    String opening_time;
    public String closing_time;
    public String contact;

    public String type;

    public SubBranch(String name, String opening_time, String closing_time, String contact, String type) {
        this.name = name;
        this.opening_time = opening_time;
        this.closing_time = closing_time;
        this.contact = contact;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOpening_time() {
        return opening_time;
    }

    public void setOpening_time(String opening_time) {
        this.opening_time = opening_time;
    }

    public String getClosing_time() {
        return closing_time;
    }

    public void setClosing_time(String closing_time) {
        this.closing_time = closing_time;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void display_info(){
        Scanner sc=new Scanner(System.in);
        System.out.println("-----"+getType()+"-----");
        System.out.println("Location : "+getName());
        System.out.println("Opening Time : "+getOpening_time());
        System.out.println("Closing Time : "+getClosing_time());
        System.out.println("Contact : "+getContact());




    }
}

