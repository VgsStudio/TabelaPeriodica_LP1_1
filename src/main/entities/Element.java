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
import main.entities.ChemestryFamilyChildren.FamilyFMACT;
import main.entities.ChemestryFamilyChildren.FamilyFMLAN;

public class Element {
    private int atomicNumber, neutronNumber, atomicMass;
    private String name, symbol;
    private ChemestryFamilyParent family;
    private String year;

    public Element(int atomicNumber, String name, String symbol, int neutronNumber, int atomicMass, String family, String year){
        this.atomicNumber = atomicNumber;
        this.name = name;
        this.symbol = symbol;
        this.neutronNumber = neutronNumber; 
        this.atomicMass = atomicMass;
        this.year = year;
        this.setFamily(family);
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

    public void setFamily(String family){
        switch (family) {
            case "FM1":
                this.family = new FamilyFM1();
                break;
            case "FM2":
                this.family = new FamilyFM2();
                break;
            case "FM3_12":
                this.family = new FamilyFM3_12();
                break;
            case "FM13":
                this.family = new FamilyFM13();
                break;
            case "FM14":
                this.family = new FamilyFM14();
                break;
            case "FM15":
                this.family = new FamilyFM15();
                break;
            case "FM16":
                this.family = new FamilyFM16();
                break;
            case "FM17":
                this.family = new FamilyFM17();
                break;
            case "FM18":   
                this.family = new FamilyFM18();
                break;
            case "FMACT":   
                this.family = new FamilyFMACT();
                break;
            case "FMLAN":   
                this.family = new FamilyFMLAN();
                break;
            default:
                throw new IllegalArgumentException("Família Química não encontrada");
        }
    }

    public String getYear() {
        return this.year;
    }
    public void setYear(String year) {
        this.year = year;
    }

    public String toString(){
        return 
            "Elemento: " + this.name + "\n" +
            "Número atômico: " + this.atomicNumber + "\n" +
            "Símbolo: " + this.symbol + "\n" +
            "Número de nêutrons: " + this.neutronNumber + "\n" +
            "Massa atômica: " + this.atomicMass + "\n" +
            "Família Química: " + this.family.getName() + "\n" +
            "Ano de descoberta: " + this.year + "\n" +
            "Cor: " + this.family.getColor();
    }
}
