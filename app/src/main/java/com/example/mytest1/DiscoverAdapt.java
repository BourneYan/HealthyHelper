package com.example.mytest1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DiscoverAdapt extends RecyclerView.Adapter<DiscoverAdapt.ViewHolder> {
    private List<Discover>mDiscover;
    static  class  ViewHolder extends  RecyclerView.ViewHolder{
        ImageView discoverImage;
        TextView  discoverText;
        public  ViewHolder(View view){
            super(view);
            discoverImage=(ImageView)view.findViewById(R.id.discover_image);
            discoverText=(TextView)view.findViewById(R.id.discover_id);
        }
    }
    public DiscoverAdapt(List<Discover>discoverList){
        mDiscover=discoverList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.discover_item,parent,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Discover discover=mDiscover.get(position);
        holder.discoverImage.setImageResource(discover.getDiscoverimageId());
        holder.discoverText.setText(discover.getDiscovername());
    }
    public  int getItemCount(){
        return mDiscover.size();
    }
}
