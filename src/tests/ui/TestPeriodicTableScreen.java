package tests.ui;
import main.back.domain.repo.RepositoryInterface;
import main.back.modules.GetAllElements.GetAllElementsPresenter;
import main.back.shared.repo.RepositoryMock;
import main.ui.table.PeriodicTable;
import main.ui.table.PeriodicTableScreen;

public class TestPeriodicTableScreen {
    public static void main(String[] args) {
        RepositoryInterface repo = new RepositoryMock();
        GetAllElementsPresenter presenter = new GetAllElementsPresenter(repo);
        PeriodicTable periodicTable = new PeriodicTable(presenter.call());
        new PeriodicTableScreen(periodicTable);
    }
} 
