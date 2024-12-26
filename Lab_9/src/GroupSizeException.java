public class GroupSizeException extends Exception {
    public GroupSizeException() {
        super("Group size must be between 3 and 15.");
    }
}