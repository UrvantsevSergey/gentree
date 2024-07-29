import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FamilyTree implements Serializable, Iterable<Human> {
    private final List<Human> famtree;

    public FamilyTree() {
        famtree = new ArrayList<>();
    }

    public int size() {
        return famtree.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Family Tree: \n");
        for (Human human : famtree) {
            sb.append(human);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void addHuman(Human nameHuman) {
        famtree.add(nameHuman);
    }

    @Override
    public Iterator<Human> iterator() {
        return new HumanIterator(famtree);
    }
    public List<Human> getHumans() {
        return famtree;
    }
    public void sortByName() {
        Collections.sort(famtree);
    }
    public void sortByAge() {
        Collections.sort(famtree, new HumanComporatorByAge());
    }
}