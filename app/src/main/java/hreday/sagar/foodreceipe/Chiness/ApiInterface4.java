package hreday.sagar.foodreceipe.Chiness;

import java.util.List;

import hreday.sagar.foodreceipe.Bangla.PojoClass2;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface4 {
    @GET("yykxi")
    Call<List<PojoClass4>> getName();
    //Log.d("Creation","Here are the errors");
}