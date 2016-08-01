package vinay.com.paritycubetask.model;


public class User {

    private Integer id;
    private String name;
    private String image;
    private String rank;
    private Integer currentDimes;
    private Integer karma;
    private Integer fpdCount;

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
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The image
     */
    public String getImage() {
        return image;
    }

    /**
     *
     * @param image
     * The image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     *
     * @return
     * The rank
     */
    public String getRank() {
        return rank;
    }

    /**
     *
     * @param rank
     * The rank
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     *
     * @return
     * The currentDimes
     */
    public Integer getCurrentDimes() {
        return currentDimes;
    }

    /**
     *
     * @param currentDimes
     * The current_dimes
     */
    public void setCurrentDimes(Integer currentDimes) {
        this.currentDimes = currentDimes;
    }

    /**
     *
     * @return
     * The karma
     */
    public Integer getKarma() {
        return karma;
    }

    /**
     *
     * @param karma
     * The karma
     */
    public void setKarma(Integer karma) {
        this.karma = karma;
    }

    /**
     *
     * @return
     * The fpdCount
     */
    public Integer getFpdCount() {
        return fpdCount;
    }

    /**
     *
     * @param fpdCount
     * The fpd_count
     */
    public void setFpdCount(Integer fpdCount) {
        this.fpdCount = fpdCount;
    }

}
