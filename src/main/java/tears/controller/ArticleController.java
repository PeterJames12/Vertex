package tears.controller;

import tears.model.Article;
import tears.service.ArticleService;
import tears.service.impl.ArticleServiceImpl;

public class ArticleController {

    public static void main(String[] args) {
        ArticleService articleService = new ArticleServiceImpl();
        articleService.getByTitlePart("Some");
    }

}
