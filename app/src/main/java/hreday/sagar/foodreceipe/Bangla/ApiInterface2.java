package hreday.sagar.foodreceipe.Bangla;

import java.util.List;

import hreday.sagar.foodreceipe.English.PojoClass;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface2 {
    @GET("selk6")
    Call<List<PojoClass2>> getName();
    //Log.d("Creation","Here are the errors");
}