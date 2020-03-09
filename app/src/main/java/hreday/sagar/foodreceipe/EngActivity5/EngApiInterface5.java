package hreday.sagar.foodreceipe.EngActivity5;

import java.util.List;

import hreday.sagar.foodreceipe.EngActivity4.EngPojoClass4;
import retrofit2.Call;
import retrofit2.http.GET;

public interface EngApiInterface5 {
    @GET("91f2316d25d48249432e")
    Call<List<EngPojoClass5>> getName();
    //Log.d("Creation","Here are the errors");
}