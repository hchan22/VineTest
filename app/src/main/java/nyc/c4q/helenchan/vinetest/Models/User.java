package nyc.c4q.helenchan.vinetest.Models;

/**
 * Created by helenchan on 12/10/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class User {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @SerializedName("username")
    @Expose
    public String username;
    @SerializedName("verified")
    @Expose
    public int verified;
    @SerializedName("vanityUrls")
    @Expose
    public List<String> vanityUrls = null;
    @SerializedName("avatarUrl")
    @Expose
    public String avatarUrl;
    @SerializedName("userId")
    @Expose
    public int userId;
    @SerializedName("private")
    @Expose
    public int _private;
    @SerializedName("location")
    @Expose
    public String location;

}