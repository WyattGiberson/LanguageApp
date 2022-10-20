package com.hfad.languageapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class homeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container,  false);

        Button btnEnglish = view.findViewById(R.id.english);
        Button btnFrench = view.findViewById(R.id.french);
        Button btnSpanish = view.findViewById(R.id.spanish);

        btnSpanish.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_spanishFragment)
        );

        btnFrench.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_frenchFragment)
        );

        btnEnglish.setOnClickListener(
                Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_englishFragment)
        );

        return view;
    }
}