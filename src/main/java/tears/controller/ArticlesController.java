package tears.controller;

import tears.service.ArticlesService;
import tears.service.impl.ArticlesServiceImpl;

/**
 * @author Viktor Bilko on 17.08.2017.
 */
public class ArticlesController {


    public static void main(String[] args) {

        ArticlesService articlesService = new ArticlesServiceImpl();
        articlesService.getArticless();
    }
}
