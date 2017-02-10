package com.rh.icetool.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.rh.icetool.R;
import com.rh.icetool.javaBean.Goods;

import java.util.List;

/**
 * Created by Jeremy on 2017-02-09.
 */
public class MyAdapter extends BaseAdapter {

    private Context context;
    private List<Goods> goodses;

    public MyAdapter(Context context, List<Goods> goodses) {
        this.context = context;
        this.goodses = goodses;
    }

    @Override
    public int getCount() {
        return goodses.size();
    }

    @Override
    public Object getItem(int position) {
        return goodses.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = View.inflate(context,R.layout.history_item,null);
            holder = new ViewHolder();
            holder.tv_num = (TextView) convertView.findViewById(R.id.tv_num);
            holder.tv_date = (TextView) convertView.findViewById(R.id.tv_date);
            holder.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
            holder.tv_kind = (TextView) convertView.findViewById(R.id.tv_kind);
            holder.tv_factory = (TextView) convertView.findViewById(R.id.tv_factory);
            holder.tv_cost = (TextView) convertView.findViewById(R.id.tv_cost);
            holder.tv_count = (TextView) convertView.findViewById(R.id.tv_count);
            holder.tv_sum = (TextView) convertView.findViewById(R.id.tv_sum);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
            holder.tv_num.setText(String.valueOf(goodses.get(position).getNum()));
            holder.tv_date.setText(goodses.get(position).getDate());
            holder.tv_name.setText(goodses.get(position).getPerson());
            holder.tv_kind.setText(goodses.get(position).getKind());
            holder.tv_factory.setText(String.valueOf(goodses.get(position).getFactory()));
            holder.tv_cost.setText(goodses.get(position).getCost());
            holder.tv_count.setText(String.valueOf(goodses.get(position).getCount()));
            holder.tv_sum.setText((goodses.get(position).getSum()));
        return convertView;
    }

    class ViewHolder {
        public TextView tv_num;
        public TextView tv_date;
        public TextView tv_name;
        public TextView tv_kind;
        public TextView tv_factory;
        public TextView tv_cost;
        public TextView tv_count;
        public TextView tv_sum;
    }

}
