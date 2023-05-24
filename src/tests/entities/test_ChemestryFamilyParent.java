package tests.entities;
import main.entities.ChemestryFamilyParent;

public class Test_ChemestryFamilyParent {
    public static void main(String[] args) {
        System.out.println("Test_ChemestryFamilyParent.java");
        ChemestryFamilyParent cfp = new ChemestryFamilyParent();
        System.out.println(cfp.getName() == "Metais Alcalinos");
        System.out.println(cfp.getColor() == "Red");
    }
}
