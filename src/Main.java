import Modal.Departments;
import Modal.HeadBranch;
import Modal.SubBranch;
import Modal.User;
import Modal.subDepart.CustomerService;
import Modal.subDepart.ShowRoom;
import Modal.subDepart.WorkShop;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<SubBranch> sub1 = new ArrayList<SubBranch>();
        ArrayList<SubBranch> sub2 = new ArrayList<SubBranch>();
        ArrayList<Departments> dep_list1 = new ArrayList<Departments>();


        CustomerService c1= new CustomerService("Customer Service", "Jay nepal","8 am", "8 am", "9841", "1234")
        ShowRoom sr1 = new ShowRoom("Showroom", "Honda ", "8am", "7pm","985123467", "240");
        WorkShop ws1 = new WorkShop("Workshop", "Honda ", "8am", "7pm","985123467", "240");
        CustomerService c2 = new CustomerService("Birathnagar", "danda ", "8am", "7pm","985123467", "12pm");
        ShowRoom sr2 = new ShowRoom("Showroom", "gonda ", "8am", "7pm","985123467", "240");
        WorkShop ws2 = new WorkShop("Workshop", "tonda ", "8am", "7pm","985123467", "240");
        sub1.add(c1);
        sub1.add(sr1);
        sub1.add(ws1);
        sub2.add(c2);
        sub2.add(sr2);
        sub2.add(ws2);
        Departments d1 = new Departments(sub1,"kathmandu");
        Departments d2 = new Departments(sub2, "birathnagar");
        dep_list1.add(d1);
        dep_list1.add(d2);
        HeadBranch h1 = new HeadBranch(dep_list1);

User u1 = new User();
u1.addUserInfo() ;
        System.out.println("From which branch would you like to get out services? ");
h1.show_branches();
c1.getClass();

        }





}
