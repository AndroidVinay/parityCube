package vinay.com.paritycubetask.model;

public class Datum {

    private Integer id;
    private String text;
    private String textRaw;
    private Integer createdAt;
    private Integer likeCount;
    private Boolean postLikeStatus;
    private User user;
    private Topic topic;
    private Forum forum;

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The text
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     * The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     * The textRaw
     */
    public String getTextRaw() {
        return textRaw;
    }

    /**
     *
     * @param textRaw
     * The text_raw
     */
    public void setTextRaw(String textRaw) {
        this.textRaw = textRaw;
    }

    /**
     *
     * @return
     * The createdAt
     */
    public Integer getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     * The created_at
     */
    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return
     * The likeCount
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     *
     * @param likeCount
     * The like_count
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     *
     * @return
     * The postLikeStatus
     */
    public Boolean getPostLikeStatus() {
        return postLikeStatus;
    }

    /**
     *
     * @param postLikeStatus
     * The post_like_status
     */
    public void setPostLikeStatus(Boolean postLikeStatus) {
        this.postLikeStatus = postLikeStatus;
    }

    /**
     *
     * @return
     * The user
     */
    public User getUser() {
        return user;
    }

    /**
     *
     * @param user
     * The user
     */
    public void setUser(User user) {
        this.user = user;
    }

    /**
     *
     * @return
     * The topic
     */
    public Topic getTopic() {
        return topic;
    }

    /**
     *
     * @param topic
     * The topic
     */
    public void setTopic(Topic topic) {
        this.topic = topic;
    }

    /**
     *
     * @return
     * The forum
     */
    public Forum getForum() {
        return forum;
    }

    /**
     *
     * @param forum
     * The forum
     */
    public void setForum(Forum forum) {
        this.forum = forum;
    }

}