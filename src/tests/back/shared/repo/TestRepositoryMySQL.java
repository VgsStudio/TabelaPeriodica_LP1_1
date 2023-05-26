package tests.back.shared.repo;

import java.util.ArrayList;

import main.back.shared.repo.RepositoryMySQL;
import main.entities.Element;

public class TestRepositoryMySQL {
    public static void main(String[] args) {
        test_getAllElements();
        test_getElement();
        test_getElementNotFound();
        test_updateElement();
    }


    public static void test_getAllElements(){
        System.out.println("Teste GetAllElements");
        RepositoryMySQL repositoryMySQL = new RepositoryMySQL();
        ArrayList<Element> elements = repositoryMySQL.getAllElements();
        System.out.println(elements.size() == 118);

    }

    public static void test_getElement(){
        System.out.println("Teste GetElement");
        RepositoryMySQL repositoryMySQL = new RepositoryMySQL();
        Element element = repositoryMySQL.getElement(1);
        System.out.println(element.getAtomicNumber() == 1);
        System.out.println(element.getName().equals("Hidrogênio"));
    }

    public static void test_getElementNotFound(){
        System.out.println("Teste GetElement - Elemento não encontrado");
        RepositoryMySQL repositoryMySQL = new RepositoryMySQL();
        Element element = repositoryMySQL.getElement(999);
        System.out.println(element == null);
    }

    public static void test_updateElement(){
        System.out.println("Teste UpdateElement");
        RepositoryMySQL repositoryMySQL = new RepositoryMySQL();
        repositoryMySQL.updateElement(1, "Bananinha");
        System.out.println(repositoryMySQL.getElement(1).getInfo().equals("Bananinha"));
    }
}
