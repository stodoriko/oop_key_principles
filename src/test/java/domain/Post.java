package domain;

public class Post {

    private int id;
    private int ownerId;
    private String ownerImageUrl;
    private String text;
    private String date;

    public Post(int id, int ownerId, String ownerImageUrl, String text, String date) {
        this.id = id;
        this.ownerId = ownerId;
        this.ownerImageUrl = ownerImageUrl;
        this.text = text;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerImageUrl() {
        return ownerImageUrl;
    }

    public void setOwnerImageUrl(String ownerImageUrl) {
        this.ownerImageUrl = ownerImageUrl;
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
