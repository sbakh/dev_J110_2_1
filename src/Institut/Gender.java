package Institut;

public enum Gender{
    MALE("M","He","His"),
    FEMALE("F", "She", "Her");
    private final String gender, he, his;
    Gender (String gender, String he, String his) {
        this.gender = gender;
        this.he = he;

        this.his = his;
    }


    //    @Override
    public String getGender() {
        return gender;
    }

    public String getHe() {
        return he;
    }

    public String getHis() {
        return his;
    }
}
