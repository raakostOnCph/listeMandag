public class Main {

    public static void main(String[] args) {
	// write your code here

        Liste liste = new Liste();

//        liste.insertFromHead(new Knude("Arne"));
//        liste.insertFromHead(new Knude("jønke"));
//        liste.insertFromHead(new Knude("blondie"));
//        liste.insertFromHead(new Knude("feehår"));
//        liste.insertFromHead(new Knude("gøjler"));
//
//        liste.printFromHead();



        liste.insertFromTail(new Knude("Lise"));
        liste.insertFromTail(new Knude("hans"));
        liste.insertFromTail(new Knude("ole"));
        liste.insertFromTail(new Knude("bo "));
        liste.insertFromTail(new Knude("ib"));
        liste.insertFromTail(new Knude("helle"));

        liste.printFromTail();




    }
}
