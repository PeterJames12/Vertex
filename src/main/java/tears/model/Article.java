package tears.model;

public class Article {
    private String title;
    private String desc;

    @Override
    public String toString() {
        return "Article{" +
                "title='" + title + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }





}
