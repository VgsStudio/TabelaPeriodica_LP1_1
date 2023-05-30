package tests.entities;

import main.entities.chemistry_group.ChemistryGroupGPAKM;
import main.entities.chemistry_group.ChemistryGroupGPRNM;
import main.entities.chemistry_group.ChemistryGroupGPTTM;

public class TestChemestryGroupParent {
        public static void main(String[] args) {
            System.out.println("TestChemestryFamilyParent.java");
            ChemistryGroupGPAKM cfp = new ChemistryGroupGPAKM();
            System.out.println(cfp.getName().equals(ChemistryGroupGPAKM.NAME));
            System.out.println(cfp.getColor().equals("#"+ ChemistryGroupGPAKM.COLOR));
            
            ChemistryGroupGPRNM cfp2 = new ChemistryGroupGPRNM();
            System.out.println(cfp2.getName().equals(ChemistryGroupGPRNM.NAME));
            System.out.println(cfp2.getColor().equals("#"+ ChemistryGroupGPRNM.COLOR));

            ChemistryGroupGPTTM cfp3 = new ChemistryGroupGPTTM();
            System.out.println(cfp3.getName().equals(ChemistryGroupGPTTM.NAME));
            System.out.println(cfp3.getColor().equals("#"+ ChemistryGroupGPTTM.COLOR));
            
    }

}
