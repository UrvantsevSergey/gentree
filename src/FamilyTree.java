import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    private final List<Human> famtree;
    
    public FamilyTree() {
        famtree = new ArrayList<>();
    }
    public int size() {
        return famtree.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Фамильное дерево: \n");
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
