package domain;

public class Repost {

    private int count;          // count (integer) — число пользователей, скопировавших запись;
    private int userReposted;   //  наличие репоста от текущего пользователя (1 — есть, 0 — нет).

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }


}
