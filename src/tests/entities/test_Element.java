import main.entities.Element;

public class test_Element {
    public static void main(String[] args) throws Exception{
        System.out.println("test_Element.java");
        Element e = new Element(1, "Hidrogênio", "H", 0, 1, "FM1", "1766");
        System.out.println(e.getName() == "Hidrogênio");
        System.out.println(e.getSymbol() == "H");
        System.out.println(e.getAtomicNumber() == 1);
        System.out.println(e.getNeutronNumber() == 0);
        System.out.println(e.getAtomicMass() == 1);
        System.out.println(e.getFamilyName() == "Metais Alcalinos");
        System.out.println(e.getColor() == "Red");
        System.out.println(e.getYear() == "1766");
    }
}
