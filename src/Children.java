import java.util.ArrayList;
import java.util.List;

public class Children extends Parrents{
    private List<String> children;

    public Children() {
        children = new ArrayList<>();
    }
    public void addChild(Human ivan) {
        children.add(ivan.getName());
    }

}