package vinay.com.paritycubetask.model;


public class Forum {

    private Integer id;
    private String title;
    private String description;
    private Integer topicsCount;
    private Integer postsCount;
    private Integer lastActivityAt;
    private Boolean haveSubforum;

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
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The topicsCount
     */
    public Integer getTopicsCount() {
        return topicsCount;
    }

    /**
     *
     * @param topicsCount
     * The topics_count
     */
    public void setTopicsCount(Integer topicsCount) {
        this.topicsCount = topicsCount;
    }

    /**
     *
     * @return
     * The postsCount
     */
    public Integer getPostsCount() {
        return postsCount;
    }

    /**
     *
     * @param postsCount
     * The posts_count
     */
    public void setPostsCount(Integer postsCount) {
        this.postsCount = postsCount;
    }

    /**
     *
     * @return
     * The lastActivityAt
     */
    public Integer getLastActivityAt() {
        return lastActivityAt;
    }

    /**
     *
     * @param lastActivityAt
     * The last_activity_at
     */
    public void setLastActivityAt(Integer lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
    }

    /**
     *
     * @return
     * The haveSubforum
     */
    public Boolean getHaveSubforum() {
        return haveSubforum;
    }

    /**
     *
     * @param haveSubforum
     * The have_subforum
     */
    public void setHaveSubforum(Boolean haveSubforum) {
        this.haveSubforum = haveSubforum;
    }

}