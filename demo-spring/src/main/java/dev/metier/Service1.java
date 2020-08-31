package dev.metier;

import dev.dao.IDao;

import java.util.List;

public class Service1 implements IService {

    private IDao dao;

    public Service1(IDao dao) {
        this.dao = dao;
    }

    @Override
    public void sauvegarder(String texte) {
        String texteEnMajuscule = texte.toUpperCase();
        this.dao.sauvegarder(texteEnMajuscule);
    }

    @Override
    public List<String> lister() {
        return dao.lister();
    }
}
