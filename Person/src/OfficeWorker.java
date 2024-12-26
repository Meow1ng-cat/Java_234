public class OfficeWorker extends Employee{

    public OfficeWorker() {this.position = "OfficeWorker";}

    @Override
    public void setPosition(String position) {
        System.out.println("You cannot change this!");
    }

    @Override
    public void work(){
        System.out.println("Copping Paper...");
    }

    public void mk_tea(){
        System.out.println("Nice cup of tea");
    }
}
