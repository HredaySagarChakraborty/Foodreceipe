package hreday.sagar.foodreceipe.Fragments;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import hreday.sagar.foodreceipe.EngActivity1.EnglishActivity;
import hreday.sagar.foodreceipe.EngActivity2.EnglishActivity2;
import hreday.sagar.foodreceipe.EngActivity3.EnglishActivity3;
import hreday.sagar.foodreceipe.EngActivity4.EnglishActivity4;
import hreday.sagar.foodreceipe.EngActivity5.EnglishActivity5;
import hreday.sagar.foodreceipe.English.Adapter;
import hreday.sagar.foodreceipe.English.ApiInterface;
import hreday.sagar.foodreceipe.English.PojoClass;

import hreday.sagar.foodreceipe.EnglishActivity6;
import hreday.sagar.foodreceipe.MainActivity;
import hreday.sagar.foodreceipe.R;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


/**
 * A simple {@link Fragment} subclass.
 */
public class one extends Fragment {
    Adapter adapter;
    private RecyclerView recyclerView;
    List<PojoClass> list;

    public one() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_one, container, false);
        recyclerView = v.findViewById(R.id.recyclerId);


        //   intent();


        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GridLayoutManager grid = new GridLayoutManager(getActivity(), 3, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);

        //     myAdapter.setOnItemClickListener((Adapter.OnItemClickListener) getActivity().getApplicationContext());


        adapter = new Adapter(this, list);

        adapter.setOnItemClickListener(new Adapter.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();


                if (position == 0) {
                    Intent intent = new Intent(getActivity(), EnglishActivity.class);
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(getActivity(), EnglishActivity2.class);
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(getActivity(),EnglishActivity3.class);
                    startActivity(intent);

                }

                if (position == 3) {
                    Intent intent = new Intent(getActivity(), EnglishActivity4.class);
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(getActivity(), EnglishActivity5.class);
                    startActivity(intent);

                }

                if (position == 5) {
                    Intent intent = new Intent(getActivity(), EnglishActivity6.class);
                    startActivity(intent);

                }

                if (position == 6) {
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);

                }

                if (position == 7) {
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);

                }

                if (position == 8) {
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);

                }


                if (position == 9) {
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);

                }


                if (position == 10) {
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);

                }

                if (position == 11) {
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);

                }


            }
        });


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.npoint.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface apiInterface = retrofit.create(ApiInterface.class);
        Call<List<PojoClass>> call = apiInterface.getName();
        call.enqueue(new Callback<List<PojoClass>>() {
            @Override
            public void onResponse(Call<List<PojoClass>> call, Response<List<PojoClass>> response) {
                showIt(response.body());


            }

            @Override
            public void onFailure(Call<List<PojoClass>> call, Throwable t) {

            }
        });


        return v;


    }

    private void showIt(List<PojoClass> response) {

        Adapter adapter = new Adapter(getActivity(), response);
        recyclerView.setAdapter(adapter);

    }

}