package hreday.sagar.foodreceipe.Thai;

import java.util.List;

import hreday.sagar.foodreceipe.Chiness.PojoClass4;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface5 {
    @GET("vzewm")
    Call<List<PojoClass5>> getName();
    //Log.d("Creation","Here are the errors");
}