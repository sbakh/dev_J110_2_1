package Institut;

public class Student extends Person implements People {
    private Stage stage;
    private String kurs;

    @Override
    public void print() {
        super.print();
        System.out.print(getGender().getHe() + " studies at " + getFacultyName() + ".");
        System.out.println(getGender().getHe() + " is " + kurs + "'th year " + stage.getStage() + " student.");
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public String getKurs() {
        return kurs;
    }

    public void setKurs(String kurs) {
        this.kurs = kurs;
    }

    public Student(String name, String surname, Gender gender, String facultyName, Stage stage, String kurs) {
        super(name, surname, gender, facultyName);
        this.kurs = kurs;
        this.stage = stage;
    }
}
