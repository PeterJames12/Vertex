package tears.database;

import tears.model.Article;

/**
 * @author Vladimir on 8/17/2017.
 */
public class ArticleData {
    private static Article[] articles;

    public static Article getArticleByTitle(String title){
        for (Article el: articles) {
            el.getTitle().equals(title);
        }
        return null;
    }
    public static Article[] getArticles(){
        final Article tmp = new Article();
        tmp.setTitle("Java OOP");

        Article[] articleArr = new Article[1];
        articleArr[0] = tmp;

        return articleArr;
    }
}
