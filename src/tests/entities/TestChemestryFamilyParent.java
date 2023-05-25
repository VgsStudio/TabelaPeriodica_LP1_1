package tests.entities;

import main.entities.ChemestryFamilyChildren.FamilyFM1;
import main.entities.ChemestryFamilyChildren.FamilyFMACT;
import main.entities.ChemestryFamilyChildren.FamilyFMLAN;

public class TestChemestryFamilyParent {
        public static void main(String[] args) {
            System.out.println("TestChemestryFamilyParent.java");
            FamilyFM1 cfp = new FamilyFM1();
            System.out.println(cfp.getName().equals("Metais Alcalinos"));
            System.out.println(cfp.getColor().equals("#FF0000"));
            
            FamilyFMACT cfp2 = new FamilyFMACT();
            System.out.println(cfp2.getName().equals("Actinídeos"));
            System.out.println(cfp2.getColor().equals("#FF00FF"));

            FamilyFMLAN cfp3 = new FamilyFMLAN();
            System.out.println(cfp3.getName().equals("Lantanídeos"));
            System.out.println(cfp3.getColor().equals("#FF00FF"));
            
    }

}
