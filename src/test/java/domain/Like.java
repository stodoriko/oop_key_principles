package domain;

public class Like {

    private boolean canLike;
    private int likesCount;
    private String[] likesPeopleId;

    public Like(boolean canLike, int likesCount, String[] likesPeopleId) {
        this.canLike = canLike;
        this.likesCount = likesCount;
        this.likesPeopleId = likesPeopleId;
    }

    public boolean isCanLike() {
        return canLike;
    }

    public void setLike(boolean canLike) {
        this.canLike = canLike;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public String[] getLikesPeopleId() {
        return likesPeopleId;
    }

    public void setLikesPeopleId(String[] likesPeopleId) {
        this.likesPeopleId = likesPeopleId;
    }
}
