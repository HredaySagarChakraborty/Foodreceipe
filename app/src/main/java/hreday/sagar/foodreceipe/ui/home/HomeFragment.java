package hreday.sagar.foodreceipe.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.ViewModelProviders;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import hreday.sagar.foodreceipe.R;
import hreday.sagar.foodreceipe.Fragments.five;
import hreday.sagar.foodreceipe.Fragments.four;
import hreday.sagar.foodreceipe.Fragments.one;
import hreday.sagar.foodreceipe.Fragments.six;
import hreday.sagar.foodreceipe.Fragments.three;
import hreday.sagar.foodreceipe.Fragments.two;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public static TabLayout tabLayout;
    public static ViewPager viewPager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);


        viewPager = root.findViewById(R.id.viewpager);
        tabLayout = root.findViewById(R.id.tab);

        MypagerAdapter mypagerAdapter = new MypagerAdapter(getFragmentManager());
        viewPager.setAdapter(mypagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        //  viewPager.setOffscreenPageLimit(7);

        return root;
    }


    class MypagerAdapter extends FragmentStatePagerAdapter {


        String[] name = {"English","বাংলা","Indian","Chinese","Thai","Italian"};
        Integer array = 6;


        public MypagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }


        @NonNull
        @Override
        public Fragment getItem(int position) {

            switch (position) {

                case 0:
                    one tab1 = new one();
                    return tab1;
                case 1:
                    two tab2 = new two();
                    return tab2;
                case 2:
                    three tab3 = new three();
                    return tab3;
                case 3:
                    four tab4 = new four();
                    return tab4;

                case 4:
                    five tab5 = new five();
                    return tab5;


                case 5:
                    six tab6 = new six();
                    return tab6;
            }


            return null;
        }

        @Override
        public int getCount() {
            return name.length;
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return name[position];
        }
    }


}