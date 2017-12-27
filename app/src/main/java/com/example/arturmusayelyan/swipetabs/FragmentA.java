package com.example.arturmusayelyan.swipetabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentA extends Fragment {


    public FragmentA() {
        // Required empty public constructor
    }

    public static FragmentA newInstance() {
         Bundle args = new Bundle();
         FragmentA fragment = new FragmentA();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

}
