package nyc.c4q.helenchan.vinetest;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import nyc.c4q.helenchan.vinetest.Models.Record;

/**
 * Created by helenchan on 12/10/16.
 */
public class VineViewHolder extends RecyclerView.ViewHolder{

    TextView recordText;
    TextView likedText;


    public VineViewHolder(View itemView) {
        super(itemView);
        recordText = (TextView) itemView.findViewById(R.id.record_textview);
        likedText = (TextView) itemView.findViewById(R.id.liked_textview);
    }

    public void bind(Record record){
        itemView.setBackgroundColor(Integer.parseInt(record.getProfileBackground()));
        recordText.setText(record.getUsername());
        likedText.setText(record.getLiked());


    }
}
