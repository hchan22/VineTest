package nyc.c4q.helenchan.vinetest.Models;

/**
 * Created by helenchan on 12/10/16.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


public class Repost {


    public String getProfileBackground() {
        return profileBackground;
    }

    public void setProfileBackground(String profileBackground) {
        this.profileBackground = profileBackground;
    }


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
    @SerializedName("flags|platform_lo")
    @Expose
    public int flagsPlatformLo;
    @SerializedName("repostId")
    @Expose
    public int repostId;
    @SerializedName("avatarUrl")
    @Expose
    public String avatarUrl;
    @SerializedName("userId")
    @Expose
    public int userId;

    @SerializedName("profileBackground")
    @Expose
    public String profileBackground;
    @SerializedName("created")
    @Expose
    public String created;
    //    @SerializedName("user")
//    @Expose
//    public VineResponse.User user;
    @SerializedName("postId")
    @Expose
    public int postId;
    @SerializedName("ipAddress")
    @Expose
    public int ipAddress;
    @SerializedName("flags|platform_hi")
    @Expose
    public int flagsPlatformHi;
    @SerializedName("sourceType")
    @Expose
    public int sourceType;
    @SerializedName("sourceId")
    @Expose
    public int sourceId;

}
