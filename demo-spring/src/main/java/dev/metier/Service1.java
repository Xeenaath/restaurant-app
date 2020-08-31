package dev.metier;

import dev.dao.IDao;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
