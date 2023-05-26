package main.back.domain.repo;

import java.util.ArrayList;

import main.entities.Element;

public interface RepositoryInterface {
    public ArrayList<Element> getAllElements();
    public Element getElement(int atomicNumber);
    public Element updateElement(int atomicNumber, String info);
}
