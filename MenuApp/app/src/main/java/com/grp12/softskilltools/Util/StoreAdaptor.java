package com.grp12.softskilltools.Util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.galgespil.stvhendeop.menuapp.R;
import com.grp12.softskilltools.Entities.AbstractItem;

import java.util.ArrayList;

/**
 * Created by mathiaslarsen on 22/11/2016.
 */

public class StoreAdaptor extends BaseAdapter {

    private static ArrayList<AbstractItem> products;
    private LayoutInflater mInflater;

    public StoreAdaptor(Context StoreFragment, ArrayList<AbstractItem> products){
        this.products = products;
        mInflater = LayoutInflater.from(StoreFragment);
    }



    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return products.size();
    }

    @Override
    public Object getItem(int arg0) {
        // TODO Auto-generated method stub
        return products.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        // TODO Auto-generated method stub
        return arg0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView == null){
            convertView = mInflater.inflate(R.layout.store_adaptor, parent, false);
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.textView15);
            holder.description = (TextView) convertView.findViewById(R.id.textView16);
            holder.price = (TextView) convertView.findViewById(R.id.textView17);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.name.setText(products.get(position).getProductName());
        holder.description.setText(products.get(position).getDescription());
        holder.price.setText(products.get(position).getPrice()+",-");

        return convertView;
    }

    static class ViewHolder{
        TextView name, description, price;
    }
}

