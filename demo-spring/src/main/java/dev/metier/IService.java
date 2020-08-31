package dev.metier;

import java.util.List;

public interface IService {

    void sauvegarder(String texte);

    List<String> lister();
}
