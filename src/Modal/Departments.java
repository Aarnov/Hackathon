package Modal;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Departments {
    ArrayList<SubBranch> subBranches ;
String location;

    public Departments(ArrayList<SubBranch> subBranches, String location) {
        this.subBranches = subBranches;
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<SubBranch> getSubBranches() {
        return subBranches;
    }

    public void setSubBranches(ArrayList<SubBranch> subBranches) {
        this.subBranches = subBranches;
    }
}
