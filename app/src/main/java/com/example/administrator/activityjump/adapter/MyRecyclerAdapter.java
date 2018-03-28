package com.example.administrator.activityjump.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.activityjump.R;

import java.util.List;
import java.util.Map;

public class MyRecyclerAdapter extends RecyclerView.Adapter<MyRecyclerAdapter.MyViewHolder>{

    private List<Map<String, Object>> mDatas;
    private Context mContext;
    private LayoutInflater inflater;

    public MyRecyclerAdapter(Context context, List<Map<String, Object>> datas){
        this. mContext=context;
        this. mDatas=datas;
        inflater=LayoutInflater. from(mContext);
    }

    @Override
    public int getItemCount() {

        return mDatas.size();
    }

    //填充onCreateViewHolder方法返回的holder中的控件
    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        Map map = mDatas.get(position);
        holder.title_tv.setText((String)map.get("title"));
        holder.logo.setImageResource((Integer) map.get("logo"));
        holder.version_tv.setText((String)map.get("version"));
        holder.size_tv.setText((String)map.get("size"));
    }

    //重写onCreateViewHolder方法，返回一个自定义的ViewHolder
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.item,parent, false);
        MyViewHolder holder= new MyViewHolder(view);
        return holder;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView title_tv;
        ImageView logo;
        TextView version_tv;
        TextView size_tv;


        public MyViewHolder(View view) {
            super(view);
            title_tv=(TextView) view.findViewById(R.id.itme_title);
            logo = (ImageView)view.findViewById(R.id.itme_logo);
            version_tv = (TextView)view.findViewById(R.id.itme_version);
            size_tv = (TextView)view.findViewById(R.id.itme_size);
        }

    }
}
