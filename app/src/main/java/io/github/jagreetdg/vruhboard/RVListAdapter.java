package io.github.jagreetdg.vruhboard;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class RVListAdapter extends RecyclerView.Adapter<RVListAdapter.ViewHolder>{
    private ArrayList<String> txts;
    private ArrayList<Integer> pb_ids;
    private Context context;

    // RecyclerView recyclerView;
    public RVListAdapter(Context context,ArrayList<String> txts, ArrayList<Integer> pb_ids) {
        this.context = context;
        this.txts = txts;
        this.pb_ids = pb_ids;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.butt.setText(txts.get(position));
        final MediaPlayer mp = MediaPlayer.create(context, pb_ids.get(position));
        holder.butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.start();
                String toast_string = "Playing "+txts.get(position);
                Toast.makeText(context, toast_string,Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return txts.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        Button butt;
        public ViewHolder(View vw)
            {
                super(vw);
            this.butt = (Button) itemView.findViewById(R.id.playButt);
        }
    }
}
