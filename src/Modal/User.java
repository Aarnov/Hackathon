package Modal;

import java.util.Scanner;

public class User {
   private String name;
    private String contact_no ;
    private String location;


    public User(String name, String contact_no, String location) {
        this.name = name;
        this.contact_no = contact_no;
        this.location = location;

    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact_no() {
        return contact_no;
    }

    public void setContact_no(String contact_no) {
        this.contact_no = contact_no;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void addUserInfo() {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter username");
    name = sc.next();
    System.out.println("Enter contact");
    contact_no = sc.next();
    System.out.println("Enter location");
    location = sc.next();

}
public void showUserInfo() {
    System.out.println("Name : "+this.name);
    System.out.println("Contact : "+this.contact_no);
    System.out.println("location : "+this.location);

}


}
