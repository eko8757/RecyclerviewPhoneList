package com.uas.phonejava;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterPhone extends RecyclerView.Adapter<AdapterPhone.ViewHolder> {

    Context mContext;
    List<ModelPhone> phoneList;

    public AdapterPhone(Context mContext, List<ModelPhone> phoneList) {
        this.mContext = mContext;
        this.phoneList = phoneList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ModelPhone phone = phoneList.get(position);
        holder.phone_name.setText(phone.nama);
        holder.phone_number.setText(phone.nomor);
    }

    @Override
    public int getItemCount() {
        return phoneList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView phone_name, phone_number;

        public ViewHolder(View itemView) {
            super(itemView);

            phone_name = itemView.findViewById(R.id.tv_nama);
            phone_number = itemView.findViewById(R.id.tv_nomor);
        }
    }
}
