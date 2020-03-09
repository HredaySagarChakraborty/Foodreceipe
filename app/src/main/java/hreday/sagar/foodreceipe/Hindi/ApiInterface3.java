package hreday.sagar.foodreceipe.Hindi;

import java.util.List;

import hreday.sagar.foodreceipe.Bangla.PojoClass2;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface3 {
    @GET("13d6t2")
    Call<List<PojoClass3>> getName();
    //Log.d("Creation","Here are the errors");
}