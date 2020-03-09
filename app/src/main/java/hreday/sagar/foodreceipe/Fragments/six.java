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

import hreday.sagar.foodreceipe.Bangla.Adapter2;
import hreday.sagar.foodreceipe.Bangla.PojoClass2;
import hreday.sagar.foodreceipe.Hindi.Adapter3;
import hreday.sagar.foodreceipe.Hindi.ApiInterface3;
import hreday.sagar.foodreceipe.Hindi.PojoClass3;
import hreday.sagar.foodreceipe.Italian.Adapter6;
import hreday.sagar.foodreceipe.Italian.ApiInterface6;
import hreday.sagar.foodreceipe.Italian.PojoClass6;
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
public class six extends Fragment {

    Adapter6 adapter;
    private RecyclerView recyclerView;
    List<PojoClass6> list;
    public six() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_six, container, false);
        recyclerView = v.findViewById(R.id.recyclerId);


        //   intent();


        // recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        GridLayoutManager grid = new GridLayoutManager(getActivity(), 3, GridLayoutManager.VERTICAL, false);
        //    recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(grid);

        //     myAdapter.setOnItemClickListener((Adapter.OnItemClickListener) getActivity().getApplicationContext());


        adapter = new Adapter6(this, list);

        adapter.setOnItemClickListener(new Adapter6.ClickListener() {
            @Override
            public void onItemClick(int position, View v) {

                // Toast.makeText(getApplicationContext(), "onclick:" + position, Toast.LENGTH_LONG).show();

                if (position == 0) {
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);

                }

                if (position == 1) {
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);

                }

                if (position == 2) {
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);

                }

                if (position == 3) {
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);

                }

                if (position == 4) {
                    Intent intent = new Intent(getActivity(), MainActivity.class);
                    startActivity(intent);

                }

                if (position == 5) {
                    Intent intent = new Intent(getActivity(), MainActivity.class);
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
                .baseUrl("https://api.myjson.com/bins/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiInterface6 apiInterface = retrofit.create(ApiInterface6.class);
        Call<List<PojoClass6>> call = apiInterface.getName();
        call.enqueue(new Callback<List<PojoClass6>>() {
            @Override
            public void onResponse(Call<List<PojoClass6>> call, Response<List<PojoClass6>> response) {
                showIt(response.body());


            }

            @Override
            public void onFailure(Call<List<PojoClass6>> call, Throwable t) {

            }
        });


        return v;


    }

    private void showIt(List<PojoClass6> response) {

        Adapter6 adapter = new Adapter6(getActivity(), response);
        recyclerView.setAdapter(adapter);

    }
}
