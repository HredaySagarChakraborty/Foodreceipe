package hreday.sagar.foodreceipe.EngActivity4;

import java.util.List;

import hreday.sagar.foodreceipe.EngActivity3.EngPojoClass3;
import retrofit2.Call;
import retrofit2.http.GET;

public interface EngApiInterface4 {
    @GET("b68e08a3db5a259411e9")
    Call<List<EngPojoClass4>> getName();
    //Log.d("Creation","Here are the errors");
}