package tests.back.shared.repo;

import java.util.ArrayList;

import main.back.shared.repo.RepositoryMock;
import main.entities.Element;

public class TestRepositoryMock {
    public static void main(String[] args) {
        teste1();
        test_getAllElements();
        test_getElement();
        test_getElementNotFound();
        test_updateInfo();
        test_updateInfoNotFound();
    }

    public static void teste1() {
        System.out.println("Teste 1");
        RepositoryMock repositoryMock = new RepositoryMock();
        Element element = new Element(1, "Hidrogênio", "H", 0, 1, "GPRNM", 1766);
        Element element2 = new Element(2, "Hélio", "He", 2, 4, "GPNBG", 1868);

        System.out.println(repositoryMock.elements.get(0).toString().equals(element.toString()));
        System.out.println(repositoryMock.elements.get(1).toString().equals(element2.toString()));
        System.out.println(repositoryMock.elements.size() == 118);
    }

    public static void test_getAllElements(){
        System.out.println("Teste GetAllElements");
        RepositoryMock repositoryMock = new RepositoryMock();
        ArrayList<Element> elements = repositoryMock.getAllElements();
        System.out.println(elements.size() == 118);

    }

    public static void test_getElement(){
        System.out.println("Teste getElement");
        RepositoryMock repositoryMock = new RepositoryMock();
        Element element = repositoryMock.getElement(1);
        System.out.println(element.getName().equals("Hidrogênio"));
    }

    public static void test_getElementNotFound(){
        System.out.println("Teste getElement not found");
        RepositoryMock repositoryMock = new RepositoryMock();
        Element element = repositoryMock.getElement(-1);
        System.out.println(element == null);
    }

    public static void test_updateInfo(){
        System.out.println("Teste updateInfo");
        RepositoryMock repositoryMock = new RepositoryMock();
        Element element = repositoryMock.updateElement(1, "info");
        System.out.println(element.getInfo().equals("info"));
        System.out.println(element.getName().equals("Hidrogênio"));
    }

    public static void test_updateInfoNotFound(){
        System.out.println("Teste updateInfo not found");
        RepositoryMock repositoryMock = new RepositoryMock();
        Element element = repositoryMock.updateElement(-1, "info");
        System.out.println(element == null);
    }

}
