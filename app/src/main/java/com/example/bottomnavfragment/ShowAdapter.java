package com.example.bottomnavfragment;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ShowAdapter extends RecyclerView.Adapter<ShowAdapter.ViewHolder>{
    private final List<ShowModel>models;

    public ShowAdapter(List<ShowModel> models) { this.models = models;    }

    @NonNull
    @Override
    public ShowAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_list, parent, false);
        return new ShowAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ShowAdapter.ViewHolder holder, int position) {
        ShowModel model = models.get(position);
        holder.ivShowPhoto.setBackgroundResource(model.getPhoto());
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent a = new Intent(v.getContext(), Details.class);
//                a.putExtra("SHowModel", model);
//                holder.itemView.getContext().startActivity(a);
//            }
//        });
    }

    @Override
    public int getItemCount() { return models.size();}

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivShowPhoto;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            ivShowPhoto = itemView.findViewById(R.id.iv_photo);

        }
    }
}
