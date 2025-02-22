package ZadanieThree;

public class Screwdriver extends Tool {

    protected Screwdriver(Workable workable) {
        super(workable);
    }

    protected Screwdriver() {

    }

    @Override
    public void hardWork() {
        System.out.println("крутит");
        if (workable != null) {
            workable.hardWork();
        }
    }
}
