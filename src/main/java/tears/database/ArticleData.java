package tears.database;

import tears.model.Article;

public class ArticleData {
    public static Article[] getArticles() {
        final Article user = new Article();
        user.setTitle("Head");

        Article[] users = new Article[1];
        users[0] = user;

        return users;
    }
}
