package Modal;

import java.util.ArrayList;
import java.util.Scanner;

public class SubBranch {
    public String type;
    public String name;
    public    String opening_time;
    public String closing_time;
    public String contact;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SubBranch(String type, String name, String opening_time, String closing_time, String contact) {
        this.type = type;

        this.name = name;
        this.opening_time = opening_time;
        this.closing_time = closing_time;
        this.contact = contact;
    }
public void depart_info() {
    System.out.println("Department information");
    System.out.println("Department Opening time:"+this.opening_time);
    System.out.println("Department closing time:"+this.closing_time);
    System.out.println("Department contact:"+this.contact);
}

}
