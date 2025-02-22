package ZadanieThree;

public class Opener extends Tool {

    protected Opener(Workable workable) {
        super(workable);
    }

    protected Opener() {

    }

    @Override
    public void hardWork() {
        System.out.println("открывает");
        if (workable != null) {
            workable.hardWork();
        }
    }
}
