package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// extend từ RecyclerView.Adapter và truyền giá trị ViewHolder vào
// Override lại 3 method chính trong RecyclerView: OncreateViewHolder, onBindViewHolder và getItemCount
public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private Context mContext;
    private List<Attribute> mListAttribute;

    // Khởi tạo một hàm constructor với 1 biến truyền vào là context


    public Adapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<Attribute> list)
    {
        this.mListAttribute = list;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Attribute attribute = mListAttribute.get(position);
        if (attribute == null)
        {
            return;
        }

        holder.ivAvatar.setImageResource(attribute.getResourceId());

    }

    @Override
    public int getItemCount() {
        if (mListAttribute != null)
        {
            return mListAttribute.size();
        }

        return 0;
    }



    public class ViewHolder extends RecyclerView.ViewHolder
    {

        //khai báo những thành phần mà có trong item_user

//        private TextView tvName;
        private ImageView ivAvatar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            ivAvatar = itemView.findViewById(R.id.ivImage);
        }
    }

}
