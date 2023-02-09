package Modal;

import java.util.ArrayList;

public class HeadBranch {
ArrayList<Departments> departments;

    public HeadBranch(ArrayList<Departments> departments) {
        this.departments = departments;
    }

    public ArrayList<Departments> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Departments> departments) {
        this.departments = departments;
    }

    public void show_branches() {
        for (Departments d : this.departments) {
            System.out.println(d.location);
            for (SubBranch j : d.subBranches) {

                System.out.println(j.name);

            }
        }
    }
    }

