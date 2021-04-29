package com.example.bottomnavfragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MovieFragment extends Fragment {
    private RecyclerView recyclerViewVacay;
    private final List<VacationModel> models = new ArrayList<>();

    public static MovieFragment newInstance() {
        MovieFragment fragment = new MovieFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_movie, container, false);
        recyclerViewVacay = view.findViewById(R.id.rv);
        recyclerViewVacay.setHasFixedSize(true);
        models.addAll(VacationDatabase.getListData());
        recyclerViewVacay.setLayoutManager(new GridLayoutManager(getActivity(), 1));
        VacationAdapter adapter = new VacationAdapter(models);
        recyclerViewVacay.setAdapter(adapter);
        return view;

    }

}