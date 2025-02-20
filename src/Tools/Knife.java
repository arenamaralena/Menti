package Tools;

public class Knife extends Tool {

    protected Knife(Workable workable) {
        super(workable);
        this.hardWork();
    }
    protected Knife(){
        this.hardWork();
    }

    @Override
    String work() {
        return "режет";
    }
}
