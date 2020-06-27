package step1;

public class Make {
    private String makeName;

    public Make(String makeName) {
        this.makeName = makeName;
    }

    public String getMakeName() {
        return makeName;
    }

    public void setMakeName(String makeName) {
        this.makeName = makeName;
    }

    @Override
    public String toString(){
        return "\t"+makeName+"\n";
    }
}
