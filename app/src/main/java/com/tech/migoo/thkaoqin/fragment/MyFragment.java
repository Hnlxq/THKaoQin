package com.tech.migoo.thkaoqin.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tech.migoo.thkaoqin.R;

/**
 * Created by migoo_houhh on 16/6/15.
 */
public class MyFragment extends Fragment {

    private View view;
    private Context context;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_me,container,false);
        context = getActivity();
        return view;
    }
}
