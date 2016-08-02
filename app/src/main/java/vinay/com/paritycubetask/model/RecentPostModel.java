package vinay.com.paritycubetask.model;

public class RecentPostModel
{
    private Data[] data;

    private String total_count;

    public Data[] getData ()
    {
        return data;
    }

    public void setData (Data[] data)
    {
        this.data = data;
    }

    public String getTotal_count ()
    {
        return total_count;
    }

    public void setTotal_count (String total_count)
    {
        this.total_count = total_count;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [data = "+data+", total_count = "+total_count+"]";
    }
}