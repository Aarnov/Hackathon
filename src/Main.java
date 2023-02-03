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
        System.out.println("Enter email");
        String email=sc.next();
        System.out.println("enter password");
        String password=sc.next();


        ArrayList<SubBranch>  branch_list = new ArrayList<SubBranch>() ;
        if(email.equalsIgnoreCase("admin@gmail.com")&&(password.equalsIgnoreCase("adminhero"))){

                System.out.println("how many branches do you wanna add?");
                int r1=sc.nextInt();
                for(int i=0;i<r1;i++){
                    SubBranch s1 = new SubBranch();
                    s1.addBranch();
                    branch_list.add(s1);
                }
                HeadBranch b1=new HeadBranch("hellow",branch_list);
                b1.get_branches();


        }
        else{

User u1 = new User();
u1.addUserInfo() ;
u1.showUserInfo() ;

            System.out.println("");

        }




    }
}
