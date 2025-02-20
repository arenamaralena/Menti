package Tools;

public class Opener extends Tool {

    protected Opener(Workable workable) {
        super(workable);
        this.hardWork();
    }
    protected Opener(){
        this.hardWork();
    }

    @Override
    String work() {
        return "открывает";
    }
}
