package ZadanieThree;

public class Knife extends Tool {

    protected Knife(Workable workable) {
        super(workable);
    }

    protected Knife() {

    }

    @Override
    public void hardWork() {
        System.out.println("режет");
        if (workable != null) {
            workable.hardWork();
        }
    }
}
