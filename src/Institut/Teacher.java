package Institut;

public class Teacher extends Person implements People{
    private String specialty;
    private AcademicDegree degree;

    public AcademicDegree getDegree() {
        return degree;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(getGender().getHe() + " teaches at " + getFacultyName() + ".");
        System.out.println(getGender().getHe() + " has " + getDegree().getPhD() + " degree in " + getSpecialty() + ".");
    }

    public Teacher(String name, String surname, Gender gender, String facultyName, AcademicDegree degree, String specialty) {
        super(name, surname, gender, facultyName);
        this.degree = degree;
        this.specialty = specialty;
    }
}
