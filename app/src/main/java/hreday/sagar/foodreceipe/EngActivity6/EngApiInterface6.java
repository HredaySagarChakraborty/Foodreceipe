package hreday.sagar.foodreceipe.EngActivity6;

import java.util.List;

import hreday.sagar.foodreceipe.EngActivity5.EngPojoClass5;
import retrofit2.Call;
import retrofit2.http.GET;

public interface EngApiInterface6 {
    @GET("9c710c8843309943cf35")
    Call<List<EngPojoClass6>> getName();
    //Log.d("Creation","Here are the errors");
}