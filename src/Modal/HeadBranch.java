package Modal;

import java.util.ArrayList;

public class HeadBranch {
    String policies;
  ArrayList<SubBranch> branches;

    public HeadBranch(String policies, ArrayList<SubBranch> branches) {
        this.policies = policies;
        this.branches = branches;
    }

    public String getPolicies() {
        return policies;
    }

    public void setPolicies(String policies) {
        this.policies = policies;
    }

    public ArrayList<SubBranch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<SubBranch> branches) {
        this.branches = branches;
    }

    public void get_branches(){
        for (SubBranch branch:branches) {
            System.out.println(branch.getLocation());
            ArrayList<Departments> departments=branch.departments;
            for (Departments depart:departments
                 ) {
                System.out.println(depart);
            }
        }
    }
}
