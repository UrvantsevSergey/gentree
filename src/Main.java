public class Main {
    public static void main(String[] args) {
        
        Human ivan = new Human("Иван", Gender.Male);
        Human irina = new Human("Ирина", Gender.Female);

        FamilyTree tree = new FamilyTree();
        tree.addHuman(ivan);
        tree.addHuman(irina);

        System.out.println();
    }
}
