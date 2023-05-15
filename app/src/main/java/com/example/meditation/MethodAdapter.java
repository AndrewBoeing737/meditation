package com.example.meditation;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MethodAdapter extends RecyclerView.Adapter<MethodAdapter.ViewHolder>  {
    private final LayoutInflater inflater;
    private final List<methodConstuctor> actions;

    public MethodAdapter(Context context, List<methodConstuctor> actions) {

        this.inflater = LayoutInflater.from(context);
        this.actions = actions;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        methodConstuctor  action = actions.get(position);
        holder.methodView.setText(action.getMethod());
        holder.descriptionView.setText(action.getDescription());
    }

    @Override
    public int getItemCount() {
        return actions.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final TextView methodView, descriptionView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            methodView = itemView.findViewById(R.id.method);
            descriptionView = itemView.findViewById(R.id.description);
        }

    }
}
