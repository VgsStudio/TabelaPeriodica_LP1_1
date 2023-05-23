package ui;
public class ElmentTest {
    private String name, family, year, icon;
    private int atomicNumber,protonNum,atomicMass;
    public ElmentTest(String name, String family, int atomicNumber, int protonNum, int atomicMass, String year,String icon) {
        this.name = name;
        this.family = family;
        this.year = year;
        this.atomicNumber = atomicNumber;
        this.protonNum = protonNum;
        this.atomicMass = atomicMass;
        this.icon = icon;
        
    }
    public int getAtomicMass() {
        return atomicMass;
    }
    public int getAtomicNumber() {
        return atomicNumber;
    }
    public String getFamily() {
        return family;
    }
    public String getName() {
        return name;
    }
    public int getProtonNum() {
        return protonNum;
    }
    public String getYear() {
        return year;
    }
    public String getIcon() {
        return icon;
    }
    public void setAtomicMass(int atomicMass) {
        this.atomicMass = atomicMass;
    }
    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setProtonNum(int protonNum) {
        this.protonNum = protonNum;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
}