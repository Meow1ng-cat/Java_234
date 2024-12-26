public class KitchenWorker extends Employee{

    public KitchenWorker() {this.position = "KitchenWorker";}

    @Override
    public void setPosition(String position) {
        System.out.println("You cannot change this!");
    }

    @Override
    public void work(){
        System.out.println("Let me cook!");
    }
}
