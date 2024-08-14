package hw.src.presenter;

import java.io.IOException;
import java.time.LocalDate;

public interface ServiceInterface {
    void addHuman(String name, String gender, LocalDate birthDate, LocalDate deathDate);
    void printFamilyTree();
    void sortByName();
    void sortByAge();
    void saveToFile() throws IOException;
    void loadFromFile() throws ClassNotFoundException, IOException;
}
