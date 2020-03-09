package hreday.sagar.foodreceipe.EngActivity5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.List;

import hreday.sagar.foodreceipe.EnglishMeatDetails.EngMeatdetails1;
import hreday.sagar.foodreceipe.EnglishMeatDetails.EngMeatdetails2;
import hreday.sagar.foodreceipe.EnglishMeatDetails.EngMeatdetails3;
import hreday.sagar.foodreceipe.EnglishMeatDetails.EngMeatdetails4;
import hreday.sagar.foodreceipe.EnglishMeatDetails.EngMeatdetails5;
import hreday.sagar.foodreceipe.EnglishMeatDetails.EngMeatdetails6;
import hreday.sagar.foodreceipe.EnglishMeatDetails.EngMeatdetails7;
import hreday.sagar.foodreceipe.EnglishMeatDetails.EngMeatdetails8;
import hreday.sagar.foodreceipe.EnglishMeatDetails.EngMeatdetails9;
import hreday.sagar.foodreceipe.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class EnglishActivity5 extends AppCompatActivity {
    private RecyclerView recyclerView;
    AdapterEng5 adapter;
    List<EngPojoClass5> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english5);

        recyclerView = findViewById(R.id.recyclerId);
        //   getSupportActionBar().hide();


        //   intent();


        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GridLayoutManager grid = new GridLayoutManager(EnglishActivity5.this, 3, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);

        //     myAdapter.setOnItemClickListener((Adapter.OnItemClickListener) getActivity().getApplicationContext());


        adapter = new AdapterEng5(this, list);

        adapter.setOnItemClickListener(new AdapterEng5.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(EnglishActivity5.this, EngMeatdetails1.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);


                } else if (position == 1) {

                    Intent intent = new Intent(EnglishActivity5.this, EngMeatdetails2.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 2) {

                    Intent intent = new Intent(EnglishActivity5.this, EngMeatdetails3.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 3) {

                    Intent intent = new Intent(EnglishActivity5.this, EngMeatdetails4.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }



                else if (position == 4) {

                    Intent intent = new Intent(EnglishActivity5.this, EngMeatdetails5.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 5) {

                    Intent intent = new Intent(EnglishActivity5.this, EngMeatdetails6.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }



                else if (position == 6) {

                    Intent intent = new Intent(EnglishActivity5.this, EngMeatdetails7.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }



                else if (position == 7) {

                    Intent intent = new Intent(EnglishActivity5.this, EngMeatdetails8.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 8) {

                    Intent intent = new Intent(EnglishActivity5.this, EngMeatdetails9.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }






            }
        });


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.npoint.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EngApiInterface5 apiInterface = retrofit.create(EngApiInterface5.class);
        Call<List<EngPojoClass5>> call = apiInterface.getName();
        call.enqueue(new Callback<List<EngPojoClass5>>() {
            @Override
            public void onResponse(Call<List<EngPojoClass5>> call, Response<List<EngPojoClass5>> response) {
                showIt(response.body());


            }

            @Override
            public void onFailure(Call<List<EngPojoClass5>> call, Throwable t) {

            }
        });





    }

    private void showIt(List<EngPojoClass5> response) {

        AdapterEng5 adapter = new AdapterEng5(getApplicationContext(), response);
        recyclerView.setAdapter(adapter);

    }
}
