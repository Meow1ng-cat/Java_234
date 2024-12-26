public class Person implements Worker {
    private String name, surname, gender;
    private boolean active;

    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setGender(String gender) {this.gender = gender;}
    public void setActive(boolean active) {this.active = active;}

    public String getName() {return name;}
    public String getSurname() {return surname;}
    public String getGender() {return gender;}
    public boolean isActive() {return active;}

    public void sleep(){if (active == true){active = false;}}

}
