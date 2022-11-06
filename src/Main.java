import Institut.*;

public class Main {

    public void printAll(Object [] objects) {
        String str = new String(objects.getClass().getSimpleName().toString());
//        System.out.println(str.substring(0,str.length()-2));
        switch (str.substring(0,str.length()-2)) {
            case("Teacher"):
                Teacher [] teachers = (Teacher[]) objects;
                System.out.println(" Преподаватели ");
                System.out.println("|-------------------------------------------------------------------------------|");
                System.out.println("|      Имя      |  Пол  |    Факультет     | Уч.степень |     Специальность     |");
                System.out.println("|-------------------------------------------------------------------------------|");

                for (Teacher t : teachers) {
                    System.out.println("| " + t.getName() + " " + t.getSurname() + " |   " + t.getGender().getGender() + "   | " + t.getFacultyName() + " |    " + t.getDegree().getPhD() + "     | " + t.getSpecialty() + " |");
                }
                System.out.println("|-------------------------------------------------------------------------------|");
                break;
            case("Student"):
                Student[] students = (Student[]) objects;
                System.out.println(" Студенты ");
                System.out.println("|------------------------------------------------------------|");
                System.out.println("|      Имя      |  Пол  |    Факультет     |  Ступень | Курс |");
                System.out.println("|------------------------------------------------------------|");
                for (Student s : students) {
                    System.out.println("| " + s.getName() + " " + s.getSurname() + " |   " + s.getGender().getGender() + "   | " + s.getFacultyName() + " | " + s.getStage() + " | " + s.getKurs() + " |");
                }
                System.out.println("|------------------------------------------------------------|");
                break;
            case("GraduateStudent"):
                GraduateStudent[] graduateStudents = (GraduateStudent[]) objects;
                System.out.println(" Аспиранты ");
                System.out.println("|----------------------------------------------------------------------------------------|");
                System.out.println("|      Имя      |  Пол  |    Факультет     |               Тема диссертации              |");
                System.out.println("|----------------------------------------------------------------------------------------|");
                for (GraduateStudent g : graduateStudents) {
                    System.out.println("| " + g.getName() + " " + g.getSurname() + " |   " + g.getGender().getGender() + "   | " + g.getFacultyName() + " | " + g.getTitle() + " |");
                }
                System.out.println("|----------------------------------------------------------------------------------------|");

                break;
        }

        for (Object o: objects) {
            //System.out.println("");
        }
    }
    public static void main(String[] args) {

        Student studentLeo = new Student("Leo","Wilkinson",Gender.MALE, "Computer Science",Stage.Bachelor,"III");
        studentLeo.print();
        Student studentAnna = new Student("Anna","Cunningham",Gender.FEMALE,"World economy",Stage.Bachelor,"I");
        studentAnna.print();
        Student studentJill = new Student("Jill","Lundqvist",Gender.FEMALE,"Jurisprudence",Stage.Master,"I");
        studentJill.print();
        GraduateStudent graduateStudent = new GraduateStudent("Ronald", "Correa",Gender.MALE ,"Computer science","Design of a functional programming language");
        graduateStudent.print();
        Teacher teacherRonald = new Teacher("Ronald","Turner", Gender.MALE, "Computer science", AcademicDegree.Philosoph,"Programming paradigms");
        teacherRonald.print();
        Teacher teacherRuth = new Teacher("Ruth", "Hollings",Gender.FEMALE,"Jurisprudence",AcademicDegree.Doctor,"Domestic arbitration");
        teacherRuth.print();

        Main main = new Main();
        Teacher [] teachers = new Teacher[]{teacherRonald,teacherRuth};
        main.printAll(teachers);
        Student [] students = new Student[]{studentLeo,studentAnna,studentJill};
        main.printAll(students);
        GraduateStudent[] graduateStudents = new GraduateStudent[]{graduateStudent};
        main.printAll(graduateStudents);


        }

    }
