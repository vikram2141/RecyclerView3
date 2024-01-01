package com.example.recyclerview3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapter extends RecyclerView.Adapter<adapter.viewholder> {
    Context context;
    ArrayList<contentmodel> ar;

    adapter(Context con,ArrayList<contentmodel> ar){
        this.context=con;
        this.ar=ar;
    }


    @NonNull
    @Override
    public adapter.viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(context).inflate(R.layout.contect_row,parent,false);
        viewholder vh=new viewholder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull adapter.viewholder holder, int position) {
        holder.name.setText(ar.get(position).getName());
        holder.email.setText(ar.get(position).getEmail());
        holder.image.setImageResource(ar.get(position).getImg());
    }

    @Override
    public int getItemCount() {
        return ar.size();
    }

    public class viewholder extends RecyclerView.ViewHolder {
        TextView name,email;
        ImageView image;
        public viewholder(@NonNull View itemView){
            super(itemView);
            name=itemView.findViewById(R.id.name);
            email=itemView.findViewById(R.id.email);
            image=itemView.findViewById(R.id.imageView);
        }
    }
}


