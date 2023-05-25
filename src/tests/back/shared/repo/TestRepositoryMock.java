package tests.back.shared.repo;

import java.util.ArrayList;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

import main.back.shared.repo.RepositoryMock;
import main.entities.Element;

public class TestRepositoryMock {
    public static void main(String[] args) {
        teste1();
        test_getAllElements();
    }

    public static void teste1() {
        System.out.println("Teste 1");
        RepositoryMock repositoryMock = new RepositoryMock();
        Element element = new Element(1, "Hidrogênio", "H", 0, 1, "FM1", "1766");
        Element element2 = new Element(2, "Hélio", "He", 2, 4, "FM18", "1868");
        
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
}
