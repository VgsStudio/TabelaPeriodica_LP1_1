package tests.back.modules.UpdateInfo;

import main.back.modules.UpdateInfo.UpdateInfoController;
import main.back.modules.UpdateInfo.UpdateInfoUsecase;
import main.back.shared.repo.RepositoryMock;
import main.entities.Element;

public class TestUpdateInfoController {
    public static void main(String[] args) {
        test_UpdateInfoController();
    }
    public static void test_UpdateInfoController(){
        System.out.println("Teste de sucesso de test_UpdateInfoController");
        RepositoryMock repositoryMock = new RepositoryMock();
        UpdateInfoUsecase usecase = new UpdateInfoUsecase(repositoryMock);
        UpdateInfoController controller = new UpdateInfoController(usecase);
        Element element = controller.call(1, "Bananinha 123");
        System.out.println(element.getInfo().equals("Bananinha 123"));
    }
}
