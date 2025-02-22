package ModulSix;

import java.util.*;

public class Exsample<X> {
    public void someMethod(Object obj) {
        Optional<X> optional = Optional.empty();
        X newObj = (X) obj;
//        X [] array = new X[2];
//        if(obj instanceof Optional<X>){
//        }
//        X xex = new X();
        Collection<?> collection = new ArrayList<>();
        Object object = "java";
        collection.size();
        //collection.addAll(Arrays.asList(object));
        collection.toArray();
        collection.iterator();
        collection.remove(object);
        collection.clear();
        // collection.add(object);
        collection.contains(object);
    }

    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("hot");
        set.add("cold");
        set.add("warm");
        Iterator<String> iterator = set.iterator();

    }
}
