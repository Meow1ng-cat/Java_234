public interface Worker {
    default void work(){
        System.out.println("Work, work!");
    }
}
