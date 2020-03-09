package hreday.sagar.foodreceipe.English;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("3b6cab689d6686eff0fb")
    Call<List<PojoClass>> getName();
    //Log.d("Creation","Here are the errors");
}