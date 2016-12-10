package nyc.c4q.helenchan.vinetest.Models;

/**
 * Created by helenchan on 12/10/16.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Data {

    @SerializedName("count")
    @Expose
    public int count;
    @SerializedName("anchorStr")
    @Expose
    public String anchorStr;
    @SerializedName("records")
//    @Expose
//    public List<VineResponse.Record> records = null;
//    @SerializedName("previousPage")
    @Expose
    public Object previousPage;
    @SerializedName("backAnchor")
    @Expose
    public String backAnchor;
    @SerializedName("anchor")
    @Expose
    public int anchor;
    @SerializedName("nextPage")
    @Expose
    public int nextPage;
    @SerializedName("size")
    @Expose
    public int size;

}