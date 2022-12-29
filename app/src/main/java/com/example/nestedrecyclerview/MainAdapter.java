package com.example.nestedrecyclerview;

import static android.content.ContentValues.TAG;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends  RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private List<DataModel> arrayList;
    private List<String> list = new ArrayList<String>();
Context context;
    public MainAdapter(List<DataModel> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.ViewHolder holder, int position) {
        DataModel model = arrayList.get(position);
        holder.textView.setText(model.getText());
        boolean isExpandable = model.isExandable();

        holder.relativeLayout.setVisibility(isExpandable ? View.VISIBLE : View.GONE);

        if(isExpandable){
            Log.d(TAG, "onBindViewHolder: ");
        }else {
            Log.d(TAG, "onBindViewHolder: Click");
        }


        NestedAdapter adapter = new NestedAdapter(list);
        holder.recyclerView.setLayoutManager(new LinearLayoutManager(holder.itemView.getContext()));
        holder.recyclerView.setHasFixedSize(true);
        holder.recyclerView.setAdapter(adapter);
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.setExandable(!model.isExandable());
                list = model.getList();
                notifyItemChanged(holder.getAdapterPosition());
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private RecyclerView recyclerView;          //nest
        private LinearLayout layout;                //line
        private TextView textView;                  //mtext
        private RelativeLayout relativeLayout;      //expected
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            recyclerView = itemView.findViewById(R.id.child);
            layout = itemView.findViewById(R.id.linear);
            textView = itemView.findViewById(R.id.textView2);
            relativeLayout = itemView.findViewById(R.id.pathRelative);

        }
    }
}
