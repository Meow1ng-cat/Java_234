import java.security.PublicKey;

public class GuardWorker extends Employee{
    public GuardWorker() {this.position = "GuardWorker";}

    @Override
    public void setPosition(String position) {
        System.out.println("You cannot change this!");
    }

    @Override
    public void work(){
        System.out.println("YOU SHALL NOT PASS!");
    }

    public void bonk(Employee target){
        target.sleep();
    }
}
