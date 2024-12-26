public class Student {
    private String name, surname, sex;
    private Integer age, course;
    private Double gpa;

    public Student(String name, String surname, String sex, Integer age, Integer course, Double gpa) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.gpa=gpa;
    }

    public String getName() {return name;}
    public String getSurname(){return surname;}
    public String getSex() {return sex;}
    public Integer getAge() {return age;}
    public Integer getCourse() {return course;}
    public Double getGpa() {return gpa;}
}
