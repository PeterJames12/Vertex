package tears.controller;

import tears.service.ArticlesService;
import tears.service.impl.ArticleServiceImp;

public class ArticleController {
    public static void main(String[] args) {

        ArticlesService artService =   new ArticleServiceImp();
        artService.getAricles();

    }
}
