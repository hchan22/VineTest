package nyc.c4q.helenchan.vinetest.Models;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by helenchan on 12/10/16.
 * https://vine.co/api/timelines/users/918753190470619136
 */

public interface VineService {

    @GET("api/timelines/users/918753190470619136")
    Call<VineResponse> getVineUser();
}
