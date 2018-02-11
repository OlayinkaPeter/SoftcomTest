package com.olayinkapeter.softcom;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Olayinka_Peter on 2/10/2018.
 */

public class ComplainAdapter extends RecyclerView.Adapter<ComplainAdapter.MyViewHolder> {

    private List<Complain> complainList;
    Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView complain, username;

        public MyViewHolder(View itemView) {
            super(itemView);
            itemView.setClickable(true);
            complain = (TextView) itemView.findViewById(R.id.complain);
            username = (TextView) itemView.findViewById(R.id.username);
        }
    }

    public ComplainAdapter(List<Complain> complainList) {
        this.complainList = complainList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.complain_row, parent, false);
        return new MyViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Complain complains = complainList.get(position);
        holder.complain.setText(complains.getComplain());
        holder.username.setText(complains.getUsername());
    }

    @Override
    public int getItemCount() {
        return complainList.size();
    }
}
