package hreday.sagar.foodreceipe.EngActivity3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.List;

import hreday.sagar.foodreceipe.EngActivity2.AdapterEng2;
import hreday.sagar.foodreceipe.EngActivity2.EngApiInterface2;
import hreday.sagar.foodreceipe.EngActivity2.EngPojoClass2;
import hreday.sagar.foodreceipe.EngDinnerDetails.Engdinnerdetails1;
import hreday.sagar.foodreceipe.EngDinnerDetails.Engdinnerdetails10;
import hreday.sagar.foodreceipe.EngDinnerDetails.Engdinnerdetails11;
import hreday.sagar.foodreceipe.EngDinnerDetails.Engdinnerdetails12;
import hreday.sagar.foodreceipe.EngDinnerDetails.Engdinnerdetails2;
import hreday.sagar.foodreceipe.EngDinnerDetails.Engdinnerdetails3;
import hreday.sagar.foodreceipe.EngDinnerDetails.Engdinnerdetails4;
import hreday.sagar.foodreceipe.EngDinnerDetails.Engdinnerdetails5;
import hreday.sagar.foodreceipe.EngDinnerDetails.Engdinnerdetails6;
import hreday.sagar.foodreceipe.EngDinnerDetails.Engdinnerdetails7;
import hreday.sagar.foodreceipe.EngDinnerDetails.Engdinnerdetails8;
import hreday.sagar.foodreceipe.EngDinnerDetails.Engdinnerdetails9;
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

public class EnglishActivity3 extends AppCompatActivity {
    private RecyclerView recyclerView;
    AdapterEng3 adapter;
    List<EngPojoClass3> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english3);

        recyclerView = findViewById(R.id.recyclerId);
        //   getSupportActionBar().hide();


        //   intent();


        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GridLayoutManager grid = new GridLayoutManager(EnglishActivity3.this, 3, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);

        //     myAdapter.setOnItemClickListener((Adapter.OnItemClickListener) getActivity().getApplicationContext());


        adapter = new AdapterEng3(this, list);

        adapter.setOnItemClickListener(new AdapterEng3.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(EnglishActivity3.this, Engdinnerdetails1.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);


                } else if (position == 1) {

                    Intent intent = new Intent(EnglishActivity3.this, Engdinnerdetails2.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 2) {

                    Intent intent = new Intent(EnglishActivity3.this, Engdinnerdetails3.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 3) {

                    Intent intent = new Intent(EnglishActivity3.this, Engdinnerdetails4.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }



                else if (position == 4) {

                    Intent intent = new Intent(EnglishActivity3.this, Engdinnerdetails5.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 5) {

                    Intent intent = new Intent(EnglishActivity3.this, Engdinnerdetails6.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }



                else if (position == 6) {

                    Intent intent = new Intent(EnglishActivity3.this, Engdinnerdetails7.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }



                else if (position == 7) {

                    Intent intent = new Intent(EnglishActivity3.this, Engdinnerdetails8.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 8) {

                    Intent intent = new Intent(EnglishActivity3.this, Engdinnerdetails9.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 9) {

                    Intent intent = new Intent(EnglishActivity3.this, Engdinnerdetails10.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }


                else if (position == 10) {

                    Intent intent = new Intent(EnglishActivity3.this, Engdinnerdetails11.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }



                else if (position == 11) {

                    Intent intent = new Intent(EnglishActivity3.this, Engdinnerdetails12.class);
                    startActivity(intent);
                    //  progressBar.setVisibility(View.VISIBLE);

                }




            }
        });


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.npoint.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EngApiInterface3 apiInterface = retrofit.create(EngApiInterface3.class);
        Call<List<EngPojoClass3>> call = apiInterface.getName();
        call.enqueue(new Callback<List<EngPojoClass3>>() {
            @Override
            public void onResponse(Call<List<EngPojoClass3>> call, Response<List<EngPojoClass3>> response) {
                showIt(response.body());


            }

            @Override
            public void onFailure(Call<List<EngPojoClass3>> call, Throwable t) {

            }
        });





    }

    private void showIt(List<EngPojoClass3> response) {

        AdapterEng3 adapter = new AdapterEng3(getApplicationContext(), response);
        recyclerView.setAdapter(adapter);

    }
}
