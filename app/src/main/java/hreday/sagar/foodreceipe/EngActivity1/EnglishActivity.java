package hreday.sagar.foodreceipe.EngActivity1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

import java.util.List;

import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails10;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails11;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails12;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails2;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails1;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails3;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails5;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails6;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails7;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails8;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails9;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglishDetails4;
import hreday.sagar.foodreceipe.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EnglishActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    AdapterEng adapter;
    List<EngPojoClass> list;
    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english);

        recyclerView = findViewById(R.id.recyclerId);

        //  getSupportActionBar().hide();


        //   intent();


        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GridLayoutManager grid = new GridLayoutManager(EnglishActivity.this, 3, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);

        //     myAdapter.setOnItemClickListener((Adapter.OnItemClickListener) getActivity().getApplicationContext());


        adapter = new AdapterEng(this, list);

        adapter.setOnItemClickListener(new AdapterEng.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(EnglishActivity.this, EnglisgDetails1.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);


                } else if (position == 1) {

                    Intent intent = new Intent(EnglishActivity.this, EnglisgDetails2.class);
                    startActivity(intent);
                }


                else if (position == 2) {

                    Intent intent = new Intent(EnglishActivity.this, EnglisgDetails3.class);
                    startActivity(intent);
                }


                else if (position == 3) {

                    Intent intent = new Intent(EnglishActivity.this, EnglishDetails4.class);
                    startActivity(intent);
                }



                else if (position == 4) {

                    Intent intent = new Intent(EnglishActivity.this, EnglisgDetails5.class);
                    startActivity(intent);
                }


                else if (position == 5) {

                    Intent intent = new Intent(EnglishActivity.this, EnglisgDetails6.class);
                    startActivity(intent);
                }



                else if (position == 6) {

                    Intent intent = new Intent(EnglishActivity.this, EnglisgDetails7.class);
                    startActivity(intent);
                }



                else if (position == 7) {

                    Intent intent = new Intent(EnglishActivity.this, EnglisgDetails8.class);
                    startActivity(intent);
                }


                else if (position == 8) {

                    Intent intent = new Intent(EnglishActivity.this, EnglisgDetails9.class);
                    startActivity(intent);
                }


                else if (position == 9) {

                    Intent intent = new Intent(EnglishActivity.this, EnglisgDetails10.class);
                    startActivity(intent);
                }


                else if (position == 10) {

                    Intent intent = new Intent(EnglishActivity.this, EnglisgDetails11.class);
                    startActivity(intent);
                }



                else if (position == 11) {

                    Intent intent = new Intent(EnglishActivity.this, EnglisgDetails12.class);
                    startActivity(intent);
                }





            }
        });


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.myjson.com/bins/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EngApiInterface apiInterface = retrofit.create(EngApiInterface.class);
        Call<List<EngPojoClass>> call = apiInterface.getName();
        call.enqueue(new Callback<List<EngPojoClass>>() {
            @Override
            public void onResponse(Call<List<EngPojoClass>> call, Response<List<EngPojoClass>> response) {
                showIt(response.body());


            }

            @Override
            public void onFailure(Call<List<EngPojoClass>> call, Throwable t) {

            }
        });


    }

    private void showIt(List<EngPojoClass> response) {

        AdapterEng adapter = new AdapterEng(getApplicationContext(), response);
        recyclerView.setAdapter(adapter);

    }

}
