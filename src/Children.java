import java.util.ArrayList;
import java.util.List;

public class Children {

    private List<String> children;

    public Children() {
        children = new ArrayList<>();
    }
    public void addChild(Human nameHuman) {
        this.children.add(nameHuman.getName());
    }

    public List<String> getChildren() {
        return children;
    }
    public void setChildren(List<String> children) {
        this.children = children;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String human : children) {
            sb.append(human);
            sb.append(", ");
        }
        return sb.toString();
    }
    

}