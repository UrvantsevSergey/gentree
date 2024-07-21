import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
        Human ivan = new Human("Иван", Gender.Male, LocalDate.of(1990, 1, 1), LocalDate.now());
        Human oleg = new Human("Олег", Gender.Male, LocalDate.of(1900, 1, 1), LocalDate.of(1990, 1, 1));
        Human irina = new Human("Ирина", Gender.Female, LocalDate.of(1990, 2, 2), LocalDate.now());
        Human igor = new Human("Игорь", Gender.Male, LocalDate.of(2010, 2, 2), LocalDate.now());

        FamilyTree tree = new FamilyTree();

        tree.addHuman(ivan);
        Parrents ivanPar = new Parrents();
        ivanPar.addParrents(oleg);
        ivan.setParrent(ivanPar);
        Children ivanChild = new Children();
        ivanChild.addChild(igor);
        ivan.setChild(ivanChild); 

        tree.addHuman(oleg);
        Children olegCh = new Children();
        olegCh.addChild(ivan);
        olegCh.addChild(irina);
        oleg.setChild(olegCh);

        tree.addHuman(irina);
        Parrents irinaPar = new Parrents();
        irinaPar.addParrents(oleg);
        irina.setParrent(irinaPar);
        irina.setChild(ivanChild);

        tree.addHuman(igor);
        Parrents igorPar = new Parrents();
        igorPar.addParrents(oleg);
        igorPar.addParrents(irina);
        igor.setParrent(igorPar);

        System.out.println(tree);
    }
}
