package com.rh.icetool.activity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.rh.icetool.R;
import com.rh.icetool.adapter.MyAdapter;
import com.rh.icetool.javaBean.Goods;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class SellFragment extends Fragment {
    private List<Goods> goodses = new ArrayList<>();
    private ListView lv;
    private MyAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_history_sell, container, false);
        lv = (ListView) view.findViewById(R.id.lv_history);

        //准备数据
        goodses = prepare();

        adapter = new MyAdapter(getActivity(), goodses);

        lv.setAdapter(adapter);

        return view;
    }

    private List<Goods> prepare() {
        Goods good1 = new Goods(34178266, "2017.1.2", "李建国", "猪手", 202, "300.00", 3, "");
        Goods good2 = new Goods(45170018, "2017.1.2", "王爽", "筒子骨", 202, "280.00", 2, "");
        Goods good3 = new Goods(34178122, "2017.1.2", "刘琴", "五花肉", 28, "400.00", 1, "");
        Goods good4 = new Goods(34123567, "2017.1.2", "胡东", "猪手", 202, "290.00", 1, "");
        goodses.add(good1);
        goodses.add(good2);
        goodses.add(good3);
        goodses.add(good4);

        return goodses;
    }
}
