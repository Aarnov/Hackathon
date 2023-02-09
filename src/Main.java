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
        System.out.println("Entering Data as Admin");
        System.out.println("......................");
        Scanner sc = new Scanner(System.in);
        ArrayList<SubBranch> sub1 = new ArrayList<SubBranch>();
        ArrayList<SubBranch> sub2 = new ArrayList<SubBranch>();
        ArrayList<Departments> dep_list1 = new ArrayList<Departments>();
        System.out.println("Enter number of data entries:");
        int num = sc.nextInt();
        CustomerService c1 = null;
        ShowRoom sh1 = null;
        WorkShop w1 = null;
        for (int i = 0; i < num; i++) {

            System.out.println("enter the location:");
            String name = sc.next();
            System.out.println("enter the type of service:");
            String type = sc.next();
            System.out.println("enter the opening time:");
            String opening_time = sc.next();
            System.out.println("enter the closing time:");
            String closing_time = sc.next();
            System.out.println("enter the contact:");
            String contact = sc.next();
            if (type.equalsIgnoreCase("customerservice")) {
                System.out.println("Enter the avialable time of Servicing:");
                String avialable_constant = sc.next();
                c1 = new CustomerService(name, opening_time, closing_time, contact, type, name, opening_time, closing_time, contact, avialable_constant);
                sub1.add(c1);
            } else if (type.equalsIgnoreCase("workshop")) {
                System.out.println("Enter the number of avialable parts:");
                String avialable_part = sc.next();
                w1 = new WorkShop(name, opening_time, closing_time, contact, type, name, opening_time, closing_time, contact, avialable_part);
                sub1.add(w1);
            } else if (type.equalsIgnoreCase("showroom")) {
                System.out.println("Enter the number of avialable cars:");
                String avialable_cars = sc.next();
                sh1 = new ShowRoom(name, opening_time, closing_time, contact, type, name, opening_time, closing_time, contact, avialable_cars);
                sub1.add(sh1);

            } else {
                System.out.println("error");
            }
            System.out.println("......................");

        }
        User u1 = new User();
        u1.addUserInfo();

        Departments d1 = new Departments(sub1);
        dep_list1.add(d1);
        HeadBranch h1 = new HeadBranch(dep_list1);
        h1.show_branches();
        System.out.println("Which service would you wanna view?" +
                " Enter the number.");
        int num1 = sc.nextInt();

        SubBranch new_sub = new SubBranch(sub1.get(num1 - 1).getName(), sub1.get(num1 - 1).getOpening_time(), sub1.get(num1 - 1).getClosing_time(), sub1.get(num1 - 1).getContact(), sub1.get(num1 - 1).type);


        if (new_sub.type.equalsIgnoreCase("customerservice")) {
            System.out.println(u1.getName()+" has booked and appointment at our servicing center located at "+new_sub.getName()+"which opens from "+new_sub.getOpening_time()+" to "+new_sub.getOpening_time()+".\n If you would like to get in touch with one of our employes then be sure to contact us via our services.."+new_sub.getContact());
        }

        if (new_sub.type.equalsIgnoreCase("workshop")) {
            System.out.println(u1.getName()+" has booked and appointment at our servicing center located at "+new_sub.getName()+"which opens from "+new_sub.getOpening_time()+" to "+new_sub.getOpening_time()+".\n If you would like to get in touch with one of our employes then be sure to contact us via our services.."+new_sub.getContact());
        }

        if (new_sub.type.equalsIgnoreCase("showroom")) {
            System.out.println(u1.getName()+" has booked and appointment at our servicing center located at "+new_sub.getName()+"which opens from "+new_sub.getOpening_time()+" to "+new_sub.getOpening_time()+".\n If you would like to get in touch with one of our employes then be sure to contact us via our services.."+new_sub.getContact());
        }






    }





}
