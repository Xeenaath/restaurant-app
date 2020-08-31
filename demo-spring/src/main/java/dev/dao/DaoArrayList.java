package dev.dao;

import java.util.ArrayList;
import java.util.List;

public class DaoArrayList implements IDao {

    List<String> liste = new ArrayList<>();

    @Override
    public void sauvegarder(String texte) {
        liste.add(texte);
    }

    @Override
    public List<String> lister() {
        return new ArrayList<>(liste);
    }
}
