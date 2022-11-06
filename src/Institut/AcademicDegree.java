package Institut;

public enum AcademicDegree {

    Candidat("кандидат наук","CSc"), Doctor("доктор наук","MSc"), Philosoph("доктор философии","PhD");

    private final String s, phD;

    public String getS() {
        return s;
    }

    public String getPhD() {
        return phD;
    }

    AcademicDegree(String s, String phD) {
        this.s = s;
        this.phD = phD;

    }
}
