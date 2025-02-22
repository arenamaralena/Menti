package ZadanieThree;

public abstract class Tool implements Workable {
    protected final Workable workable;

    protected Tool(Workable workable) {
        this.workable = workable;
    }

    protected Tool() {
        workable = null;
    }

}
