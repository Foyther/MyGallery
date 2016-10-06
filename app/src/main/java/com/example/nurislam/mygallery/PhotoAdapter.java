package com.example.nurislam.mygallery;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by Nurislam on 06.10.2016.
 */

public class PhotoAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private Context context;

    public PhotoAdapter(Context context){
        this.context = context;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item, parent, false);
        return new PhotoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int k = position % 6 + 1;
        switch (k){
            case 1 :
                ((PhotoViewHolder) holder).bind(R.drawable.img_1);
                break;
            case 2 :
                ((PhotoViewHolder) holder).bind(R.drawable.img_2);
                break;
            case 3 :
                ((PhotoViewHolder) holder).bind(R.drawable.img_3);
                break;
            case 4 :
                ((PhotoViewHolder) holder).bind(R.drawable.img_4);
                break;
            default:
                ((PhotoViewHolder) holder).bind(R.drawable.img_1);
        }
    }

    class PhotoViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;

        public PhotoViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.img);

        }
        public void bind(final int drawableRes){
            clearImage();
            imageView.setImageResource(drawableRes);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, ImageActivity.class);
                    intent.putExtra("image", drawableRes);
                    context.startActivity(intent);
                }
            });
        }

        public void clearImage(){
            imageView.setImageResource(0);
            imageView.setImageDrawable(null);
            imageView.setImageURI(null);
        }

    }

    @Override
    public int getItemCount() {
        return 100;
    }
}
