package hreday.sagar.foodreceipe.EngActivity2;

import java.util.List;

import hreday.sagar.foodreceipe.EngActivity1.EngPojoClass;
import retrofit2.Call;
import retrofit2.http.GET;

public interface EngApiInterface2 {
    @GET("br4ma")
    Call<List<EngPojoClass2>> getName();
    //Log.d("Creation","Here are the errors");
}