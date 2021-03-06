package com.tech.migoo.thkaoqin.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.tech.migoo.thkaoqin.R;
import com.tech.migoo.thkaoqin.adapter.ShenpiAdapter;
import com.tech.migoo.thkaoqin.view.HeadView;
import com.tech.migoo.thkaoqin.view.MyGridView;

/**
 * Created by migoo_houhh on 16/6/12.
 */
public class ShenpiFragment extends Fragment {

    private View view;
    private Context context;
    private MyGridView gridView;
    private ShenpiAdapter adapter;
    private String[] shenpi = {"请假审批","销假审批","考勤台账填报","加班情况填报"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_shenpi,container,false);
        context = getActivity();
        init();
        return view;
    }

    private void init(){
        gridView = (MyGridView) view.findViewById(R.id.gridView_shenpi);
        adapter = new ShenpiAdapter(context,shenpi);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(context, shenpi[position], Toast.LENGTH_LONG).show();

            }
        });
    }
}
