package br.com.kakobotasso.lodjinha.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import br.com.kakobotasso.lodjinha.models.Banner;
import br.com.kakobotasso.lodjinha.models.DataBannerContainer;
import br.com.kakobotasso.lodjinha.utils.Constantes;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface BannerService {
    @GET("/banner")
    Call<DataBannerContainer> getBanners();

    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
            .create();

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(Constantes.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build();

}
