package tests.entities;

import main.back.shared.errors.EntityError;
import main.entities.Element;

public class TestElement {
    public static void main(String[] args) {
        teste1();
        teste2();
        test_atomicNumberNegative();
        
    }

    public static void teste1(){
        System.out.println("TestElement - Elemento válido");
        Element element = new Element(
            1,
            "Hidrogênio",
            "H",
            0,
            1,
            "GPAKM",
            1766
        );
        System.out.println(element.getAtomicNumber() == 1);
        System.out.println(element.getName().equals("Hidrogênio"));
        System.out.println(element.getSymbol().equals("H"));
        System.out.println(element.getYear() == 1766);
        System.out.println(element.getNeutronNumber() == 0);
        System.out.println(element.getAtomicMass() == 1);
        System.out.println(element.getGroupName().equals("Metais Alcalinos"));
        System.out.println(element.getColor().equals("#FF0000"));
    }

    public static void teste2(){
        System.out.println("TestElement - Nome de família não existe");
        try {
            Element element = new Element(
                1,
                "Hidrogênio",
                "H",
                0,
                1,
                "Codigo Errado",
                1766
            );
            System.out.println("False");
        } catch (Exception e) {
            System.out.println("True");
        }
    }

    public static void test_atomicNumberNegative(){
        System.out.println("TestElement - Nome de família não existe");
        try {
            Element element = new Element(
                -1,
                "Hidrogênio",
                "H",
                0,
                1,
                "GPAKM",
                1766
            );
            System.out.println("False");
        } catch (EntityError e) {
            System.out.println(e.getMessage().equals("Erro no atributo atomicNumber: O número atômico deve ser maior que 0"));
        }
    }
}
