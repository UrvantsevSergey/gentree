public class Main {
    public static void main(String[] args) {
        
        Human ivan = new Human("Иван", Gender.Male);
        Human irina = new Human("Ирина", Gender.Female);
        Human igor = new Human("Игорь", Gender.Male);

        FamilyTree tree = new FamilyTree();
        tree.addHuman(ivan);
        tree.addHuman(irina);
        tree.addHuman(igor);

        System.out.println(tree);
    }
}
