package tests.back.modules.UpdateInfo;

import main.back.domain.repo.RepositoryInterface;
import main.back.modules.UpdateInfo.UpdateInfoPresenter;
import main.back.shared.repo.RepositoryMock;
import main.back.shared.repo.RepositoryMySQL;

public class TestUpdateInfoPresenter {
    public static void main(String[] args) {
        test_UpdateInfoPresenter();
    }
    public static void test_UpdateInfoPresenter(){
        System.out.println("Teste de sucesso de UpdateInfoPresenter");
        RepositoryInterface repo = new RepositoryMock();
        UpdateInfoPresenter presenter = new UpdateInfoPresenter(repo);
        System.out.println(presenter.call(1, "Bananinha123").getInfo().equals("Bananinha123"));
    }
}
