public class Main {
    public static void main(String[] args) {
        Employee Ivan = new Employee();
        Ivan.setPosition("OfficeWorker");
        Ivan.setName("Ivan");
        Ivan.setActive(true);
        System.out.println("We created " + Ivan.getName() +" the "+ Ivan.getPosition() +", " + Ivan.isActive());
        Ivan.work();

        KitchenWorker Pavel = new KitchenWorker();
        Pavel.setName("Pavel");
        Pavel.setPosition("OfficeWorker");
        Pavel.setActive(true);
        System.out.println("We created " + Pavel.getName() +" the "+ Pavel.getPosition() +", " + Pavel.isActive());
        Pavel.work();

        GuardWorker Bob = new GuardWorker();
        Bob.setName("Bob");
        Bob.setPosition("OfficeWorker");
        System.out.println("We created " + Bob.getName() +" the "+ Bob.getPosition());
        Bob.work();
        Bob.bonk(Ivan);
        Bob.bonk(Pavel);
        System.out.println(Ivan.isActive() + " " + Pavel.isActive());
    }
}