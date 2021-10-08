package domain;

public class Post {

    private int id;              // идентификатор записи.
    private int ownerId;         // идентификатор владельца стены, на которой размещена запись. В версиях API ниже 5.7 это поле называется to_id.
    private int fromId;          // идентификатор автора записи (от чьего имени опубликована запись).
    private int createdBy;       // идентификатор администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора). Возвращается в записях, опубликованных менее 24 часов назад.
    private int date;            // время публикации записи в формате unixtime.
    private String text;         // текст записи.
    private int replyOwnerId;    // идентификатор владельца записи, в ответ на которую была оставлена текущая.
    private int replyPostId;     // идентификатор записи, в ответ на которую была оставлена текущая.
    private int[] friendsOnly;   // 1, если запись была создана с опцией «Только для друзей».
    private int post_type;       // тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    private int signerId;        // идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    private int[] canPin;        // информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может).
    private int[] canDelete;     // информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может).
    private int[] canEdit;       // информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может).
    private int[] isPinned;      // информация о том, что запись закреплена.
    private int[] markedAsAdds;  // информация о том, содержит ли запись отметку "реклама" (1 — да, 0 — нет).
    private boolean isFavorite;  // true, если объект добавлен в закладки у текущего пользователя.
    private int postponedId;     // идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.

    private CommentsInfo commentsInfo;  // в документации он типа object, под такой тип объекта мы создали отдельный класс CommentsInfo
    private Copyright copyright;
    private Like like;
    private Repost repost;
    private View view;
    private Geo geo;
    private Donut donut;

    public Like getLike() {
        return like;
    }

    public void setLike(Like like) {
        this.like = like;
    }

    public Repost getRepost() {
        return repost;
    }

    public void setRepost(Repost repost) {
        this.repost = repost;
    }

    public View getView() {
        return view;
    }

    public void setView(View view) {
        this.view = view;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public Donut getDonut() {
        return donut;
    }

    public void setDonut(Donut donut) {
        this.donut = donut;
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

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int[] getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int[] friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public int getPost_type() {
        return post_type;
    }

    public void setPost_type(int post_type) {
        this.post_type = post_type;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int[] getCanPin() {
        return canPin;
    }

    public void setCanPin(int[] canPin) {
        this.canPin = canPin;
    }

    public int[] getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int[] canDelete) {
        this.canDelete = canDelete;
    }

    public int[] getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int[] canEdit) {
        this.canEdit = canEdit;
    }

    public int[] getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int[] isPinned) {
        this.isPinned = isPinned;
    }

    public int[] getMarkedAsAdds() {
        return markedAsAdds;
    }

    public void setMarkedAsAdds(int[] markedAsAdds) {
        this.markedAsAdds = markedAsAdds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public Copyright getCopyright() {
        return copyright;
    }

    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }


}
