public class Group {
    protected Student groupArray[];

    public Group(Student group[]) {
        try {
            if (group.length >= 3 && group.length <= 15) {
                this.groupArray = group;
            } else {
                throw new GroupSizeException(); // Create an instance of the exception
            }
        } catch (GroupSizeException e) {
            System.out.println("Wrong student number");
            this.groupArray = new Student[0];
        }
    }

    //public void addStudent() {}



    public void getGroupList() {
        for (Student student : groupArray) {
            System.out.println(student.getName());
            System.out.println(student.getSurname());
            System.out.println(student.getGpa());
        }
    }
}
