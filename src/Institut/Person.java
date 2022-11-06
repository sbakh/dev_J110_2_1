package Institut;

public class Person implements People{
    String name, surname, facultyName;
    Gender gender;

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public Person() {

    }

    public Person(String name, String surname, Gender gender, String facultyName){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.facultyName = facultyName;
    }

    @Override
    public void print() {
        System.out.print("This is " + this.name + " " + this.surname + ".");
    }
}
