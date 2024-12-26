public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Alice", "Watson", "Female", 19, 2, 4.4),
                new Student("Bob", "Abramovich", "Male", 20, 3, 3.9),
                //new Student("Charlie", "Hertz", "Male", 19, 2, 4.0),
                //new Student("Amanda", "Becket", "Female", 21, 4, 5.0)
        };

        Group groupOne = new Group(students);
        groupOne.getGroupList();

    }
}