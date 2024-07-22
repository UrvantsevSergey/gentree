import java.io.IOException;

public interface Serializable {
    public abstract  void saveinFile(FamilyTree tree) throws IOException;
    public abstract void readFromFile();
}
