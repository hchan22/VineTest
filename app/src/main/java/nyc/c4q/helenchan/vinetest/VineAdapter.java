package nyc.c4q.helenchan.vinetest;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.helenchan.vinetest.Models.Record;

/**
 * Created by helenchan on 12/10/16.
 */
public class VineAdapter extends RecyclerView.Adapter<VineViewHolder> {
    List<Record> recordList;

    public VineAdapter(List<Record> recordList) {
        this.recordList = recordList;
    }

    @Override
    public VineViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_view,parent, false);
        return new VineViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(VineViewHolder holder, int position) {
        Record myRecord = recordList.get(position);
        holder.bind(myRecord);
    }

    @Override
    public int getItemCount() {
        return recordList.size();
    }
}
