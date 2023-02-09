package Modal;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Departments {
    ArrayList<SubBranch> subBranches ;


    public Departments(ArrayList<SubBranch> subBranches) {
        this.subBranches = subBranches;

    }


    public ArrayList<SubBranch> getSubBranches() {
        return subBranches;
    }

    public void setSubBranches(ArrayList<SubBranch> subBranches) {
        this.subBranches = subBranches;
    }
}
