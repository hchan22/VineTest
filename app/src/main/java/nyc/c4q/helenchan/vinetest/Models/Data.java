package nyc.c4q.helenchan.vinetest.Models;

/**
 * Created by helenchan on 12/10/16.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Data {

    @SerializedName("count")
    @Expose
    public int count;
    @SerializedName("anchorStr")
    @Expose
    public String anchorStr;

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    @SerializedName("records")
    @Expose
    public List<Record> records = null;
    @SerializedName("previousPage")
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