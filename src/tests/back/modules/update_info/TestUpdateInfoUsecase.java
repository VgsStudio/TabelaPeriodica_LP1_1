package tests.back.modules.update_info;


import main.back.modules.update_info.UpdateInfoUsecase;
import main.back.shared.errors.EntityError;
import main.back.shared.errors.NotFound;
import main.back.shared.repo.RepositoryMock;
import main.entities.Element;

public class TestUpdateInfoUsecase {
    public static void main(String[] args) {
        test_UpdateInfoUsecase();
        test_UpdateInfoUsecaseInvalidAtomicNumber();
        test_UpdateInfoUsecaseNotFound();
    }
    public static void test_UpdateInfoUsecase(){
        System.out.println("Teste de sucesso de UpdateInfoUsecase");
        RepositoryMock repositoryMock = new RepositoryMock();
        UpdateInfoUsecase usecase = new UpdateInfoUsecase(repositoryMock);
        Element element = usecase.call(1, "Bananinha 123");
        System.out.println(repositoryMock.getElement(1).getInfo().equals("Bananinha 123"));
        System.out.println(element.getInfo().equals("Bananinha 123"));
    }

    public static void test_UpdateInfoUsecaseInvalidAtomicNumber(){
        System.out.println("Teste do UpdateInfoUsecase - invalid atomicNumber");
        RepositoryMock repositoryMock = new RepositoryMock();
        UpdateInfoUsecase usecase = new UpdateInfoUsecase(repositoryMock);
        try {
            Element element = usecase.call(-1, "Bananinha 123");
            System.out.println("False");
        } catch (EntityError e) {
            System.out.println(e.getMessage().equals("Erro no atributo atomicNumber: O número atômico deve ser maior que 0"));
        }
    }

    public static void test_UpdateInfoUsecaseNotFound(){
        System.out.println("Teste do UpdateInfoUsecase - elemento não encontrado");
        RepositoryMock repositoryMock = new RepositoryMock();
        UpdateInfoUsecase usecase = new UpdateInfoUsecase(repositoryMock);
        try {
            Element element = usecase.call(1000, "Bananinha 123");
            System.out.println("False");
        } catch (NotFound e) {
            System.out.println(e.getMessage().equals("Entidade Element não encontrada"));
        }
    }
}
