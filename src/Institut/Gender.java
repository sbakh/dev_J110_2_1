package Institut;

enum Gender{
    MALE("M"),
    FEMALE("F");
    private final String gender;
    Gender (String gender) {
        this.gender = gender;
    }
    //    @Override
    public String getGender() {
        return gender;
    }
}
