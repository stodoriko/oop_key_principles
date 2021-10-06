package domain;

public class Article {

    private String articleId;
    private String imageUrl;
    private boolean favorite;
    private String heading;
    private String subtitle;

    public Article(String articleId, String imageUrl, boolean favorite, String heading, String subtitle) {
        this.articleId = articleId;
        this.imageUrl = imageUrl;
        this.favorite = favorite;
        this.heading = heading;
        this.subtitle = subtitle;
    }

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }
}
