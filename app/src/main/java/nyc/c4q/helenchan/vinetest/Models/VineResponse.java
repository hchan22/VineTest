package nyc.c4q.helenchan.vinetest.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by helenchan on 12/10/16.
 */

public class VineResponse {

    @SerializedName("code")
    @Expose
    public String code;
    @SerializedName("data")
    @Expose
    public Data data;
    @SerializedName("success")
    @Expose
    public boolean success;
    @SerializedName("error")
    @Expose
    public String error;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }


}
