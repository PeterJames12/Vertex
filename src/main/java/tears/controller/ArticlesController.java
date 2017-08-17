package tears.controller;

import tears.model.Articles;
import tears.service.ArticlesService;
import tears.service.impl.ArticlesServiceImpl;

/**
 * Created by qw-user on 17.08.2017.
 */
public class ArticlesController {

    public static void main(String[] args) {
        ArticlesService articlesService = new ArticlesServiceImpl();
        articlesService.getTitle();
    }
}
