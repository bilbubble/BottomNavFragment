package com.example.bottomnavfragment;

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

public class TvShowFragment extends Fragment {
    private RecyclerView recyclerViewShow;
    private final List<ShowModel> models = new ArrayList<>();

    public static TvShowFragment newInstance() {
        TvShowFragment fragment = new TvShowFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tv_show, container, false);
        recyclerViewShow = view.findViewById(R.id.rv_tv_shows);
        recyclerViewShow.setHasFixedSize(true);
        recyclerViewShow.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        models.addAll(ShowDatabase.getListData());
        ShowAdapter adapter = new ShowAdapter(models);
        recyclerViewShow.setAdapter(adapter);
        return view;

    }

}