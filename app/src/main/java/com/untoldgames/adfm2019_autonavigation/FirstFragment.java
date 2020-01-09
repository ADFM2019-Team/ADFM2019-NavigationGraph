package com.untoldgames.adfm2019_autonavigation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener {

    private Button btn;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        btn = view.findViewById(R.id.gotoBtn);
        btn.setOnClickListener(this);

        return view;
    }


    @Override
    public void onClick(View v) {
        NavController navController = Navigation.findNavController(v);

        NavDirections navAction = FirstFragmentDirections.actionFirstFragmentToSecondFragment();
        navController.navigate(navAction);
    }
}
