package tests.back.modules.get_all_elements;

import main.back.modules.get_all_elements.GetAllElementsController;
import main.back.modules.get_all_elements.GetAllElementsUsecase;
import main.back.shared.repo.RepositoryMock;

public class TestGetAllElementsController {
    public static void main(String[] args) {
        teste1();
    }
    public static void teste1(){
        System.out.println("Teste de sucesso de GetAllElementsController");
        RepositoryMock repositoryMock = new RepositoryMock();
        GetAllElementsUsecase usecase = new GetAllElementsUsecase(repositoryMock);
        GetAllElementsController controller = new GetAllElementsController(usecase);
        System.out.println(controller.call().size() == 118);
    }
}
