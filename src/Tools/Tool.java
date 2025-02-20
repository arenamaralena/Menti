package Tools;

public abstract class Tool implements Workable {
    protected final Workable workable;

    protected Tool(Workable workable) {
        this.workable = workable;
    }
    protected Tool(){
        workable = null;
    }

    abstract String work();

    @Override
    public void hardWork() {
        System.out.println(work());
    }
}
