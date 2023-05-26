package main.back.modules.UpdateInfo;

import main.back.domain.repo.RepositoryInterface;
import main.entities.Element;

public class UpdateInfoPresenter {
    private UpdateInfoController controller;
    private UpdateInfoUsecase usecase;
    private RepositoryInterface repo;

    public UpdateInfoPresenter(RepositoryInterface repo){
        this.repo = repo;
        this.usecase = new UpdateInfoUsecase(this.repo);
        this.controller = new UpdateInfoController(usecase);
    }

    public Element call(int atomicNumber, String info){
        return this.controller.call(atomicNumber, info);
    }
}
