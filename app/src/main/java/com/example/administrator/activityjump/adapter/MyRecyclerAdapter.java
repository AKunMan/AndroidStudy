package com.example.administrator.activityjump.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.administrator.activityjump.R;

import java.util.List;
import java.util.Map;

public class MyRecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

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


    //重写onCreateViewHolder方法，返回一个自定义的ViewHolder
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Log.d("recyclerlog","viewType:" + viewType);
        if (viewType == 0){
            View view = inflater.inflate(R.layout.item, parent, false);
            MyViewHolder holder= new MyViewHolder(view);
            return holder;
        }else {
            View view = inflater.inflate(R.layout.item2, parent, false);
            MyViewHolder2 holder= new MyViewHolder2(view);
            return holder;
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Map map = mDatas.get(position);
        if (position == 10){
            MyViewHolder2 myHolder2 = (MyViewHolder2)holder;
            myHolder2.title_tv.setText((String)map.get("title"));
        }else {
            MyViewHolder myHolder1 = (MyViewHolder)holder;
            myHolder1.title_tv.setText((String)map.get("title"));
            myHolder1.logo.setImageResource((Integer) map.get("logo"));
            myHolder1.version_tv.setText((String)map.get("version"));
            myHolder1.size_tv.setText((String)map.get("size"));
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 10){
            return 1;
        }
        return 0;
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
    class MyViewHolder2 extends RecyclerView.ViewHolder{
        TextView title_tv;
        public MyViewHolder2(View itemView) {
            super(itemView);
            title_tv=itemView.findViewById(R.id.title2);
        }
    }
}
