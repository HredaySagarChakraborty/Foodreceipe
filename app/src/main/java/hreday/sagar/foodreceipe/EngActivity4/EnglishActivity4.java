package hreday.sagar.foodreceipe.EngActivity4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.List;

import hreday.sagar.foodreceipe.EnglishRiceDetails.Engrice2;
import hreday.sagar.foodreceipe.EnglishRiceDetails.Engrice3;
import hreday.sagar.foodreceipe.EnglishRiceDetails.Engrice4;
import hreday.sagar.foodreceipe.EnglishRiceDetails.Engrice5;
import hreday.sagar.foodreceipe.EnglishRiceDetails.Engrice6;
import hreday.sagar.foodreceipe.EnglishRiceDetails.Engrice7;
import hreday.sagar.foodreceipe.EnglishRiceDetails.Engrice8;
import hreday.sagar.foodreceipe.EnglishRiceDetails.Engrice9;
import hreday.sagar.foodreceipe.EnglishRiceDetails.Engricesetails1;
import hreday.sagar.foodreceipe.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EnglishActivity4 extends AppCompatActivity {
    private RecyclerView recyclerView;
    AdapterEng4 adapter;
    List<EngPojoClass4> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english4);

        recyclerView = findViewById(R.id.recyclerId);
        //   getSupportActionBar().hide();


        //   intent();


        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GridLayoutManager grid = new GridLayoutManager(EnglishActivity4.this, 3, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);

        //     myAdapter.setOnItemClickListener((Adapter.OnItemClickListener) getActivity().getApplicationContext());


        adapter = new AdapterEng4(this, list);

        adapter.setOnItemClickListener(new AdapterEng4.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(EnglishActivity4.this, Engricesetails1.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);


                } else if (position == 1) {

                    Intent intent = new Intent(EnglishActivity4.this, Engrice2.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 2) {

                    Intent intent = new Intent(EnglishActivity4.this, Engrice3.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 3) {

                    Intent intent = new Intent(EnglishActivity4.this, Engrice4.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }



                else if (position == 4) {

                    Intent intent = new Intent(EnglishActivity4.this, Engrice5.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 5) {

                    Intent intent = new Intent(EnglishActivity4.this, Engrice6.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }



                else if (position == 6) {

                    Intent intent = new Intent(EnglishActivity4.this, Engrice7.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }



                else if (position == 7) {

                    Intent intent = new Intent(EnglishActivity4.this, Engrice8.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 8) {

                    Intent intent = new Intent(EnglishActivity4.this, Engrice9.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }






            }
        });


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.npoint.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EngApiInterface4 apiInterface = retrofit.create(EngApiInterface4.class);
        Call<List<EngPojoClass4>> call = apiInterface.getName();
        call.enqueue(new Callback<List<EngPojoClass4>>() {
            @Override
            public void onResponse(Call<List<EngPojoClass4>> call, Response<List<EngPojoClass4>> response) {
                showIt(response.body());


            }

            @Override
            public void onFailure(Call<List<EngPojoClass4>> call, Throwable t) {

            }
        });





    }

    private void showIt(List<EngPojoClass4> response) {

        AdapterEng4 adapter = new AdapterEng4(getApplicationContext(), response);
        recyclerView.setAdapter(adapter);

    }
}
