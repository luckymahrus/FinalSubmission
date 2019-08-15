package com.luckymahrus.finalsubmission.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.luckymahrus.finalsubmission.R;
import com.luckymahrus.finalsubmission.model.Brand;

import java.util.ArrayList;

public class ListBrandAdapter extends RecyclerView.Adapter<ListBrandAdapter.ListViewHolder>
{
    private ArrayList<Brand> listBrand;

    public ListBrandAdapter(ArrayList<Brand> list) {
        this.listBrand = list;
    }


    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType)
    {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_brand_list, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position)
    {
        Brand brand = listBrand.get(position);
        Glide.with(holder.itemView.getContext())
                .load(brand.getBrandLogo())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.ivBrandLogo);
        holder.tvBrandName.setText(brand.getBrandName());
        holder.tvBrandId.setText(brand.getBrandId());
    }

    @Override
    public int getItemCount()
    {
        return listBrand.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder
    {
        ImageView ivBrandLogo;
        TextView tvBrandName, tvBrandId;
        ListViewHolder(View itemView)
        {
            super(itemView);
            ivBrandLogo = itemView.findViewById(R.id.iv_brand_logo);
            tvBrandName = itemView.findViewById(R.id.tv_brand_name);
            tvBrandId = itemView.findViewById(R.id.tv_brand_id);
        }
    }
}
