package dev.ihm;

import dev.exception.PlatException;
import dev.ihm.options.IOptionMenu;
import dev.ihm.options.OptionAjouterPlat;
import dev.ihm.options.OptionListerPlats;
import dev.ihm.options.OptionTerminer;
import dev.service.IPlatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.*;

@Controller
public class Menu {

    private Map<Integer, IOptionMenu> actions = new HashMap<>();

    private String menu;
    private Scanner scanner;

    public Menu(Scanner scanner, IPlatService service) {
        actions.put(1, new OptionListerPlats(service));
        actions.put(2, new OptionAjouterPlat(scanner, service));
        actions.put(99, new OptionTerminer());
        this.scanner = scanner;
    }














    @Autowired
    public Menu(Scanner scanner, List<IOptionMenu> optionMenus) {


       // option 1 => :
        optionMenus.sort(Comparator.comparing(IOptionMenu::getPoids));

        // option 2 => ->
        //optionMenus.sort((opt1, opt2) -> Integer.compare(opt1.getPoids(), opt2.getPoids()));

        // option 3 => Classe anonyme
        /*optionMenus.sort(new Comparator<IOptionMenu>() {
            @Override
            public int compare(IOptionMenu o1, IOptionMenu o2) {
                return Integer.compare(o1.getPoids(), o2.getPoids());
            }
        });*/

        int index = 1;
        for (IOptionMenu optionMenu: optionMenus) {
            actions.put(index, optionMenu);
            index++;
        }

        this.scanner = scanner;
    }

    public void afficher() {

        boolean continuer = true;

        while (continuer) {

            System.out.println(getMenuTexte());

            int choix = this.scanner.nextInt();

            try {
                this.actions.get(choix).executer();
            } catch (PlatException e) {
                continuer = false;
                System.out.println(e.getMessage());
            }
        }
    }

    private String getMenuTexte() {
        if (menu == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("** Restaurant Console App **");
            sb.append("\n");
            this.actions.forEach((index, option) -> {
                sb.append(index);
                sb.append(". ");
                sb.append(option.getTitre());
                sb.append("\n");
            });
            this.menu = sb.toString();
        }
        return this.menu;
    }
}
