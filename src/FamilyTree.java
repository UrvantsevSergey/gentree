import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FamilyTree<E extends FamilyTreeItem<E>> implements Serializable, Iterable<E> {
    private final List<E> famtree;

    public FamilyTree() {
        famtree = new ArrayList<>();
    }

    public int size() {
        return famtree.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Family Tree: \n");
        for (E human : famtree) {
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void addHuman(E nameHuman) {
        famtree.add(nameHuman);
    }

    @Override
    public Iterator<E> iterator() {
        return new HumanIterator(famtree);
    }
    public List<E> getHumans() {
        return famtree;
    }
    public void sortByName() {
        Collections.sort(famtree);
    }
    public void sortByAge() {
        Collections.sort(famtree, new HumanComporatorByAge<>());
    }
}