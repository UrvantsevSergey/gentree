package hw.src.model;
import java.util.Comparator;

public class HumanComporatorByAge<T extends FamilyTreeItem> implements Comparator<T>{

    @Override
    public int compare(T o1, T o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}
