package ModulSix;

public class Main {
    public static void main(String[] args) {
        Pair <Integer,String> pair = Pair.of(1,null);
        Integer i = pair.getFirst();
        String s = pair.getSecond();
        Pair<Integer, String> pair2 = Pair.of(1, null);
        boolean mustBeTrue = pair.equals(pair2);
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode();
    }
}
