import hw.src.view.ConsoleUI;
import hw.src.view.View;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        View view = new ConsoleUI();
        view.start();
    }
}



















//     public static void main(String[] args) throws IOException {
        
//         Human ivan = new Human("Иван", Gender.Male, LocalDate.of(1990, 1, 1), LocalDate.now());
//         Human oleg = new Human("Олег", Gender.Male, LocalDate.of(1900, 1, 1), LocalDate.of(1990, 1, 1));
//         Human irina = new Human("Ирина", Gender.Female, LocalDate.of(1990, 2, 2), LocalDate.now());
//         Human igor = new Human("Игорь", Gender.Male, LocalDate.of(2010, 2, 2), LocalDate.now());

//         FamilyTree tree = new FamilyTree();

//         tree.addHuman(ivan);
//         tree.addHuman(oleg);
//         tree.addHuman(irina);
//         tree.addHuman(igor);

//         System.out.println(tree);

//         tree.sortByName();
//         System.out.println(tree);
        
//         tree.sortByAge();
//         System.out.println(tree);
        
//         Writer writer = new Writer(tree);

//         try {
//             writer.saveinFile("family_tree.csv");
//             System.out.println("Family tree saved to file.");

//             writer.readFromFile("family_tree.csv");
//             System.out.println("Family tree loaded from file.");

//             FamilyTree loadtree = writer.getFamilyTree();
//             System.out.println(loadtree);

//         } catch (IOException | ClassNotFoundException e) {
//             e.printStackTrace();
//         }
//     }
// }
