package Modal;


import Modal.subDepart.CustomerService;
import Modal.subDepart.ShowRoom;
import Modal.subDepart.WorkShop;

public class Appointment  {
    User user;
    CustomerService cs;
    ShowRoom sr;
    WorkShop ws;

    public Appointment(User user, CustomerService cs, ShowRoom sr, WorkShop ws) {
        this.user = user;
        this.cs = cs;
        this.sr = sr;
        this.ws = ws;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CustomerService getCs() {
        return cs;
    }

    public void setCs(CustomerService cs) {
        this.cs = cs;
    }

    public ShowRoom getSr() {
        return sr;
    }

    public void setSr(ShowRoom sr) {
        this.sr = sr;
    }

    public WorkShop getWs() {
        return ws;
    }

    public void setWs(WorkShop ws) {
        this.ws = ws;
    }

    public void appointment_cs(){
        System.out.println(getUser().getName()+" has booked and appointment at our servicing center located at "+getCs().getName()+"which opens from "+getCs().getOpening_time()+" to "+getCs().getOpening_time()+".\n If you would like to get in touch with one of our employes then be sure to contact us via our services.."+getCs().getContact());
    }
    public void appointment_sr(){
        System.out.println(getUser().getName()+" has booked and appointment at our servicing center located at "+getSr().getName()+"which opens from "+ getSr().getOpening_time()+" to "+getSr().getClosing_time()+".\n If you would like to get in touch with one of our employes then be sure to contact us via our services.."+getCs().getContact());
    }
    public void appointment_ws(){
        System.out.println(getUser().getName()+" has booked and appointment at our servicing center located at "+getWs().getName()+"which opens from "+getWs().getOpening_time()+" to "+getCs().closing_time+".\n If you would like to get in touch with one of our employes then be sure to contact us via our services.."+getCs().getContact());
    }
}
