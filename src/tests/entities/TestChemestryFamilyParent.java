package tests.entities;

import main.entities.ChemestryFamilyParent;

import java.util.Objects;

public class TestChemestryFamilyParent {
        public static void main(String[] args) {
        System.out.println("TestChemestryFamilyParent.java");
        ChemestryFamilyParent cfp = new ChemestryFamilyParent();
        System.out.println(Objects.equals(cfp.getName(), "Metais Alcalinos"));
        System.out.println(Objects.equals(cfp.getColor(), "Red"));
    }

}
