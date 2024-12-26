public class Employee extends Person{
    protected String position, department;
    protected Double payment, experience;

    public void setPosition(String position) {
        if (position == "KitchenWorker" || position == "OfficeWorker" || position == "GuardWorker")
        this.position = position;
    }
    public void setDepartment(String department) {this.department = department;}
    public void setPayment(Double payment) {this.payment = payment;}
    public void setExperience(Double experience) {this.experience = experience;}

    public String getPosition() {return position;}
    public String getDepartment() {return department;}
    public Double getPayment() {return payment;}
    public Double getExperience() {return experience;}




}
