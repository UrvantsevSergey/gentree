import java.util.ArrayList;
import java.util.List;

public class Parrents {
    private List<String> parrents;
    
    public Parrents() {
        parrents = new ArrayList<>();
    }
    public int size() {
        return parrents.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (String human : parrents) {
            sb.append(human);
            sb.append(", ");
        }
        return sb.toString();
    }

    public void addParrents(Human ivan) {
        parrents.add(ivan.getName());
    }
}