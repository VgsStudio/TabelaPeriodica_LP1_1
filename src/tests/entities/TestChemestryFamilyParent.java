package tests.entities;

import main.entities.ChemestryFamilyChildren.FamilyFM1;

public class TestChemestryFamilyParent {
        public static void main(String[] args) {
            System.out.println("TestChemestryFamilyParent.java");
            FamilyFM1 cfp = new FamilyFM1();
            System.out.println(cfp.getName().equals("Metais Alcalinos"));
            System.out.println(cfp.getColor().equals("#FF0000"));
    }

}
