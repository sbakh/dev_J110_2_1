package Institut;

public enum Stage {
    Bachelor("Bachelor"),
    Master("Master");
    private String stage;
    Stage(String stage) {
    this.stage = stage;
    }

    public String getStage() {
        return stage;
    }
}
