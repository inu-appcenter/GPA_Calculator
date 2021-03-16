package com.example.inucalc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adapter_ai_recomm2 extends RecyclerView.Adapter<Adapter_ai_recomm2.ViewHolder>  {
    List<grades> List = null;
    ArrayList<Data_ai_recomm2> arrayList2;
    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView tv11,tv22,tv33,tv44;
        ViewHolder(View itemview){
            super(itemview);
            tv11 = itemview.findViewById(R.id.tv11);
            tv22 = itemview.findViewById(R.id.tv22);
            tv33 = itemview.findViewById(R.id.tv33);
            tv44 = itemview.findViewById(R.id.tv44);
        }
    }
    public Adapter_ai_recomm2(java.util.List<grades> list){
        List = list;
    }
    @NonNull
    @Override
    public Adapter_ai_recomm2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_recomm2,parent,false);
        Adapter_ai_recomm2.ViewHolder viewHolder = new Adapter_ai_recomm2.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter_ai_recomm2.ViewHolder holder, int position) {
        holder.tv11.setText(List.get(position).getName());
        holder.tv22.setText(List.get(position).getScore());
        holder.tv33.setText(List.get(position).getName() + List.get(position).getScore());
        holder.tv44.setText("b");

    }

    @Override
    public int getItemCount() {
        return List.size();
    }


}