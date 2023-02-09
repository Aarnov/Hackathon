import Modal.Departments;
import Modal.HeadBranch;
import Modal.SubBranch;
import Modal.User;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        ArrayList<SubBranch>  branch_list = new ArrayList<SubBranch>() ;
        ArrayList<Departments> department_list =new ArrayList<>();
        HeadBranch b1 =new HeadBranch("hellow",branch_list);
        b1.get_branches();

        System.out.println("ENTERING THE DATA AS ADMIN");
        System.out.println("..........................");
                System.out.println("how many branches do you wanna add?");
                int r1=sc.nextInt();
                for(int i=0;i<r1;i++){
                    SubBranch s1 = new SubBranch();
                    s1.addBranch();
                    Departments d1= new Departments();
                    d1.depart_info();
                    department_list.add(d1);
                    branch_list.add(s1);
                }
        System.out.println(branch_list);





        }





}
