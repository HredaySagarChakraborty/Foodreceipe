package hreday.sagar.foodreceipe.Italian;

import java.util.List;

import hreday.sagar.foodreceipe.Chiness.PojoClass4;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface6 {
    @GET("ou7na")
    Call<List<PojoClass6>> getName();
    //Log.d("Creation","Here are the errors");
}