package main.entities;

import main.entities.ChemestryFamilyChildren.FamilyFM1;
import main.entities.ChemestryFamilyChildren.FamilyFM13;
import main.entities.ChemestryFamilyChildren.FamilyFM14;
import main.entities.ChemestryFamilyChildren.FamilyFM15;
import main.entities.ChemestryFamilyChildren.FamilyFM16;
import main.entities.ChemestryFamilyChildren.FamilyFM17;
import main.entities.ChemestryFamilyChildren.FamilyFM18;
import main.entities.ChemestryFamilyChildren.FamilyFM2;
import main.entities.ChemestryFamilyChildren.FamilyFM3_12;

public class Element {
    private int atomicNumber, neutronNumber, atomicMass;
    private String name, symbol;
    private ChemestryFamilyParent family;
    private String year;

    public Element(int atomicNumber, String name, String symbol, int neutronNumber, int atomicMass, String family, String year) throws Exception{
        this.atomicNumber = atomicNumber;
        this.name = name;
        this.symbol = symbol;
        this.neutronNumber = neutronNumber; 
        this.atomicMass = atomicMass;
        this.year = year;
        try{
            this.setFamily(family);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    public int getAtomicNumber() {
        return atomicNumber;
    }
    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public int getNeutronNumber() {
        return neutronNumber;
    }
    public void setNeutronNumber(int neutronNumber) {
        this.neutronNumber = neutronNumber;
    }

    public int getAtomicMass() {
        return atomicMass;
    }
    public void setAtomicMass(int atomicMass) {
        this.atomicMass = atomicMass;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return this.symbol;
    }
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getColor() {
        return this.family.getColor();
    }

    public String getFamilyName() {
        return this.family.getName();
    }

    public void setFamily(String family) throws Exception {
        switch (family) {
            case "FML1" -> this.family = new FamilyFM1();
            case "FML2" -> this.family = new FamilyFM2();
            case "FML3_12" -> this.family = new FamilyFM3_12();
            case "FML13" -> this.family = new FamilyFM13();
            case "FML14" -> this.family = new FamilyFM14();
            case "FML15" -> this.family = new FamilyFM15();
            case "FML16" -> this.family = new FamilyFM16();
            case "FML17" -> this.family = new FamilyFM17();
            case "FML18" -> this.family = new FamilyFM18();
            default -> throw new Exception("Invalid Family");
        }
    }

    public String getYear() {
        return this.year;
    }
    public void setYear(String year) {
        this.year = year;
    }
}
