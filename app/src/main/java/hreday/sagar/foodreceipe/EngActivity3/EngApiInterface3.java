package hreday.sagar.foodreceipe.EngActivity3;

import java.util.List;

import hreday.sagar.foodreceipe.EngActivity2.EngPojoClass2;
import retrofit2.Call;
import retrofit2.http.GET;

public interface EngApiInterface3 {
    @GET("414ce9e1e27cba94c601")
    Call<List<EngPojoClass3>> getName();
    //Log.d("Creation","Here are the errors");
}