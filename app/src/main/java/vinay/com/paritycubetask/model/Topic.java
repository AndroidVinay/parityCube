package vinay.com.paritycubetask.model;


public class Topic {

    private Integer id;
    private Boolean fpdFlag;
    private String title;
    private Integer viewCount;
    private Integer postsCount;
    private Integer lastActivityAt;
    private Integer score;
    private String forumName;
    private String shareUrl;
    private Integer frontPageSuggestionsCount;
    private String updatedAt;

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
     * The fpdFlag
     */
    public Boolean getFpdFlag() {
        return fpdFlag;
    }

    /**
     *
     * @param fpdFlag
     * The fpd_flag
     */
    public void setFpdFlag(Boolean fpdFlag) {
        this.fpdFlag = fpdFlag;
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
     * The viewCount
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     *
     * @param viewCount
     * The view_count
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
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
     * The score
     */
    public Integer getScore() {
        return score;
    }

    /**
     *
     * @param score
     * The score
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     *
     * @return
     * The forumName
     */
    public String getForumName() {
        return forumName;
    }

    /**
     *
     * @param forumName
     * The forum_name
     */
    public void setForumName(String forumName) {
        this.forumName = forumName;
    }

    /**
     *
     * @return
     * The shareUrl
     */
    public String getShareUrl() {
        return shareUrl;
    }

    /**
     *
     * @param shareUrl
     * The share_url
     */
    public void setShareUrl(String shareUrl) {
        this.shareUrl = shareUrl;
    }

    /**
     *
     * @return
     * The frontPageSuggestionsCount
     */
    public Integer getFrontPageSuggestionsCount() {
        return frontPageSuggestionsCount;
    }

    /**
     *
     * @param frontPageSuggestionsCount
     * The front_page_suggestions_count
     */
    public void setFrontPageSuggestionsCount(Integer frontPageSuggestionsCount) {
        this.frontPageSuggestionsCount = frontPageSuggestionsCount;
    }

    /**
     *
     * @return
     * The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     *
     * @param updatedAt
     * The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}