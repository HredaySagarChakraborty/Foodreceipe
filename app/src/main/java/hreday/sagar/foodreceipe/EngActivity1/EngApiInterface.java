package hreday.sagar.foodreceipe.EngActivity1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EngApiInterface {
    @GET("189e8y")
    Call<List<EngPojoClass>> getName();
    //Log.d("Creation","Here are the errors");
}