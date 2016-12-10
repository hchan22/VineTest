package nyc.c4q.helenchan.vinetest;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.helenchan.vinetest.Models.VineResponse;
import nyc.c4q.helenchan.vinetest.Models.VineService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by helenchan on 12/10/16.
 */
public class VineFragment extends Fragment {
    private static final String LOG = "working";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vine, container, false);
        fetchVine();
        return view;
    }

    public void fetchVine(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://vine.co/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        VineService service = retrofit.create(VineService.class);
        Call<VineResponse> call = service.getVineUser();
        call.enqueue(new Callback<VineResponse>() {
            @Override
            public void onResponse(Call<VineResponse> call, Response<VineResponse> response) {
                Log.d(LOG, String.valueOf(response.body().getData()));
            }

            @Override
            public void onFailure(Call<VineResponse> call, Throwable t) {

            }
        });
    }
}
