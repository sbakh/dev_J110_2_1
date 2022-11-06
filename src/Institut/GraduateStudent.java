package Institut;

public class GraduateStudent extends Person implements People{
    private String title;

    public String getTitle() {
        return title;
    }

    @Override
    public void print() {
        super.print();
        System.out.print(getGender().getHe() + " studies at " + getFacultyName() + ".");
        System.out.println(getGender().getHis() + " thesis title is '" + getTitle() + "'.");
    }

    public GraduateStudent(String name, String surname, Gender gender, String facultyName, String title) {
        super(name, surname, gender, facultyName);
        this.title = title;
    }
}
