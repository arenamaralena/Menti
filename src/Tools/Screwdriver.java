package Tools;

public class Screwdriver extends Tool {

    protected Screwdriver(Workable workable) {
        super(workable);
        this.hardWork();
    }
    protected Screwdriver(){
        this.hardWork();
    }


    @Override
    String work() {
        return "крутит";
    }
}
