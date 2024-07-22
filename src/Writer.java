import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Writer implements Serializable {
    private FamilyTree familyTree;

    public Writer(FamilyTree famtree) {
        this.familyTree = famtree;
    }

    public void saveinFile(String fileName) throws IOException {
        try (ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream(fileName))) {
            file.writeObject(familyTree);
        }
    }

    public void readFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream file = new ObjectInputStream(new FileInputStream(fileName))) {
            this.familyTree = (FamilyTree) file.readObject();
        }
    }
    public FamilyTree getFamilyTree() {
        return familyTree;
    }
}