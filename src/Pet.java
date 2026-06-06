public class Pet {

    private  final String NAME;



    public Pet(String NAME, boolean isClean) {
        this.NAME = NAME;
        this.isClean = isClean;
        isClean = false;
    }

    private boolean isClean;

    public String getNAME() {
        return NAME;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }
}
