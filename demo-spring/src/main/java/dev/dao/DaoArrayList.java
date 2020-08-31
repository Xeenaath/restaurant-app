package dev.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
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
