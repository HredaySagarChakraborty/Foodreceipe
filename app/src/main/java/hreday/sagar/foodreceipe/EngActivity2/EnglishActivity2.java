package hreday.sagar.foodreceipe.EngActivity2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.List;

import hreday.sagar.foodreceipe.EngActivity1.AdapterEng;
import hreday.sagar.foodreceipe.EngActivity1.EngApiInterface;
import hreday.sagar.foodreceipe.EngActivity1.EngPojoClass;
import hreday.sagar.foodreceipe.EngActivity1.EnglishActivity;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails1;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails10;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails11;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails12;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails2;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails3;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails5;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails6;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails7;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails8;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglisgDetails9;
import hreday.sagar.foodreceipe.EnglishBreakfastDetails.EnglishDetails4;
import hreday.sagar.foodreceipe.EnglishLunchDetails.Englunchdetais1;
import hreday.sagar.foodreceipe.EnglishLunchDetails.Englunchdetais10;
import hreday.sagar.foodreceipe.EnglishLunchDetails.Englunchdetais11;
import hreday.sagar.foodreceipe.EnglishLunchDetails.Englunchdetais12;
import hreday.sagar.foodreceipe.EnglishLunchDetails.Englunchdetais2;
import hreday.sagar.foodreceipe.EnglishLunchDetails.Englunchdetais3;
import hreday.sagar.foodreceipe.EnglishLunchDetails.Englunchdetais4;
import hreday.sagar.foodreceipe.EnglishLunchDetails.Englunchdetais5;
import hreday.sagar.foodreceipe.EnglishLunchDetails.Englunchdetais6;
import hreday.sagar.foodreceipe.EnglishLunchDetails.Englunchdetais7;
import hreday.sagar.foodreceipe.EnglishLunchDetails.Englunchdetais8;
import hreday.sagar.foodreceipe.EnglishLunchDetails.Englunchdetais9;
import hreday.sagar.foodreceipe.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EnglishActivity2 extends AppCompatActivity {
    private RecyclerView recyclerView;
    AdapterEng2 adapter;
    List<EngPojoClass2> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english2);

        recyclerView = findViewById(R.id.recyclerId);
     //   getSupportActionBar().hide();


        //   intent();


        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GridLayoutManager grid = new GridLayoutManager(EnglishActivity2.this, 3, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);

        //     myAdapter.setOnItemClickListener((Adapter.OnItemClickListener) getActivity().getApplicationContext());


        adapter = new AdapterEng2(this, list);

        adapter.setOnItemClickListener(new AdapterEng2.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(EnglishActivity2.this, Englunchdetais1.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);


                } else if (position == 1) {

                    Intent intent = new Intent(EnglishActivity2.this, Englunchdetais2.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 2) {

                    Intent intent = new Intent(EnglishActivity2.this, Englunchdetais3.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 3) {

                    Intent intent = new Intent(EnglishActivity2.this, Englunchdetais4.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }



                else if (position == 4) {

                    Intent intent = new Intent(EnglishActivity2.this, Englunchdetais5.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 5) {

                    Intent intent = new Intent(EnglishActivity2.this, Englunchdetais6.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }



                else if (position == 6) {

                    Intent intent = new Intent(EnglishActivity2.this, Englunchdetais7.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }



                else if (position == 7) {

                    Intent intent = new Intent(EnglishActivity2.this, Englunchdetais8.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 8) {

                    Intent intent = new Intent(EnglishActivity2.this, Englunchdetais9.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 9) {

                    Intent intent = new Intent(EnglishActivity2.this, Englunchdetais10.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 10) {

                    Intent intent = new Intent(EnglishActivity2.this, Englunchdetais11.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }



                else if (position == 11) {

                    Intent intent = new Intent(EnglishActivity2.this, Englunchdetais12.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }




            }
        });


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.myjson.com/bins/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EngApiInterface2 apiInterface = retrofit.create(EngApiInterface2.class);
        Call<List<EngPojoClass2>> call = apiInterface.getName();
        call.enqueue(new Callback<List<EngPojoClass2>>() {
            @Override
            public void onResponse(Call<List<EngPojoClass2>> call, Response<List<EngPojoClass2>> response) {
                showIt(response.body());


            }

            @Override
            public void onFailure(Call<List<EngPojoClass2>> call, Throwable t) {

            }
        });





    }

    private void showIt(List<EngPojoClass2> response) {

        AdapterEng2 adapter = new AdapterEng2(getApplicationContext(), response);
        recyclerView.setAdapter(adapter);

    }
}
