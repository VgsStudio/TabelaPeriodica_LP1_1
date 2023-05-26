import main.back.domain.repo.RepositoryInterface;
import main.back.modules.GetAllElements.GetAllElementsPresenter;
import main.back.shared.repo.RepositoryMock;
import main.ui.more_Info.MoreInfoPopUpFactory;
import main.ui.table.PeriodicTable;
import main.ui.table.PeriodicTableScreen;

public class Main {

    public static void main(String[] args) {
        RepositoryInterface repo = new RepositoryMock(); // TODO change to RepositoryMySQL
        GetAllElementsPresenter presenter = new GetAllElementsPresenter(repo);
        MoreInfoPopUpFactory moreInfoPopUpFactory = new MoreInfoPopUpFactory();
        PeriodicTable periodicTable = new PeriodicTable(presenter.call(), moreInfoPopUpFactory);
        new PeriodicTableScreen(periodicTable);
    }
}
