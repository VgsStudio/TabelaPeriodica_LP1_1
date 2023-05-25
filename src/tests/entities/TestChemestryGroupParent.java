package tests.entities;

import main.entities.ChemestryGroupChildren.GroupGPAKM;
import main.entities.ChemestryGroupChildren.GroupGPRNM;
import main.entities.ChemestryGroupChildren.GroupGPTTM;

public class TestChemestryGroupParent {
        public static void main(String[] args) {
            System.out.println("TestChemestryFamilyParent.java");
            GroupGPAKM cfp = new GroupGPAKM();
            System.out.println(cfp.getName().equals(GroupGPAKM.NAME));
            System.out.println(cfp.getColor().equals("#"+GroupGPAKM.COLOR));
            
            GroupGPRNM cfp2 = new GroupGPRNM();
            System.out.println(cfp2.getName().equals(GroupGPRNM.NAME));
            System.out.println(cfp2.getColor().equals("#"+GroupGPRNM.COLOR));

            GroupGPTTM cfp3 = new GroupGPTTM();
            System.out.println(cfp3.getName().equals(GroupGPTTM.NAME));
            System.out.println(cfp3.getColor().equals("#"+GroupGPTTM.COLOR));
            
    }

}
