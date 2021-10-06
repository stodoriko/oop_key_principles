package domain;

public class Header {

    private String id;
    private String logoImageUrl;
    private String text;
    private String date;

    public Header(String id, String logoImageUrl, String text, String date) {
        this.id = id;
        this.logoImageUrl = logoImageUrl;
        this.text = text;
        this.date = date;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogoImageUrl() {
        return logoImageUrl;
    }

    public void setLogoImageUrl(String logoImageUrl) {
        this.logoImageUrl = logoImageUrl;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
