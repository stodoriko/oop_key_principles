package domain;

public class Repost {

    private String id;
    private String name;
    private int countReposts;
    private String userImageUrl;

    public Repost(String id, String name, int countReposts, String userImageUrl) {
        this.id = id;
        this.name = name;
        this.countReposts = countReposts;
        this.userImageUrl = userImageUrl;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCountReposts() {
        return countReposts;
    }

    public void setCountReposts(int countReposts) {
        this.countReposts = countReposts;
    }

    public String getUserImageUrl() {
        return userImageUrl;
    }

    public void setUserImageUrl(String userImageUrl) {
        this.userImageUrl = userImageUrl;
    }
}
