import main.back.domain.repo.RepositoryInterface;
import main.back.modules.get_all_elements.GetAllElementsPresenter;
import main.back.modules.update_info.UpdateInfoPresenter;
import main.back.shared.repo.RepositoryMySQL;
import main.ui.more_Info.MoreInfoPopUpFactory;
import main.ui.table.PeriodicTable;
import main.ui.table.PeriodicTableScreen;

public class Main {

    public static void main(String[] args) {
        RepositoryInterface repo = new RepositoryMySQL();
        GetAllElementsPresenter getAllElementsPresenter = new GetAllElementsPresenter(repo);
        UpdateInfoPresenter updateInfoPresenter = new UpdateInfoPresenter(repo);
        MoreInfoPopUpFactory moreInfoPopUpFactory = new MoreInfoPopUpFactory(updateInfoPresenter);
        PeriodicTable periodicTable = new PeriodicTable(getAllElementsPresenter.call(), moreInfoPopUpFactory);
        new PeriodicTableScreen(periodicTable);
    }
}
