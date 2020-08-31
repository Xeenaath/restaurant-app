package dev.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DaoBlague implements IDao {

    @Override
    public void sauvegarder(String texte) {
      // ne fait rien
    }

    @Override
    public List<String> lister() {
        return Arrays.asList("a", "b");
    }
}
