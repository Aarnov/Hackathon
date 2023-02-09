import Modal.Departments;
import Modal.HeadBranch;
import Modal.SubBranch;
import Modal.User;
import Modal.subDepart.CustomerService;
import Modal.subDepart.ShowRoom;
import Modal.subDepart.WorkShop;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<SubBranch>  branch_list = new ArrayList<SubBranch>() ;
        ArrayList<Departments> department_list =new ArrayList<Departments>();

        System.out.println("ENTERING THE DATA AS ADMIN");
        System.out.println("..........................");
                System.out.println("how many branches do you wanna add?");
                int r1=sc.nextInt();
                for(int i=0;i<r1;i++){

                    CustomerService c1=new CustomerService();

                    c1.enter_depart_info();

////                    ShowRoom sr1=new ShowRoom();
////                    sr1.enter_depart_info();
////                    WorkShop w1= new WorkShop();
////                    w1.enter_depart_info();
//                    department_list.add(c1);
                c1.depart_info();

                }





        }





}
