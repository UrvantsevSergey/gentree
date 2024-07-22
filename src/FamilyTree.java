import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FamilyTree implements Serializable {
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
}