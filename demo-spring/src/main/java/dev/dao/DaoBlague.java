package dev.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//@Primary
//@Component
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
