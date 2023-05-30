package tests.back.modules.get_all_elements;

import main.back.modules.get_all_elements.GetAllElementsUsecase;
import main.back.shared.repo.RepositoryMock;

public class TestGetAllElementsUsecase {
    public static void main(String[] args) {
        teste1();
    }
    public static void teste1(){
        System.out.println("Teste de sucesso de GetAllElementsUsecase");
        RepositoryMock repositoryMock = new RepositoryMock();
        GetAllElementsUsecase usecase = new GetAllElementsUsecase(repositoryMock);
        System.out.println(usecase.call().size() == 118);
    }
}
