package retrofit.aishwarya.com.whatsapptabs;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aishwarya on 14/7/16.
 */
public class FragmentOneAdapter extends RecyclerView.Adapter<FragmentOneAdapter.FragmentOneViewHolder> {
    private List<String> mDummyValues;

    public FragmentOneAdapter(List<String> dummyNames, Context context) {
        this.mDummyValues = dummyNames;
    }

    @Override
    public FragmentOneViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.dummy_layout, parent, false);
        return new FragmentOneAdapter.FragmentOneViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(FragmentOneViewHolder holder, int position) {
        String name = mDummyValues.get(position);
        holder.mName.setText(name);
    }

    @Override
    public int getItemCount() {
        return mDummyValues.size();
    }

    public class FragmentOneViewHolder extends RecyclerView.ViewHolder {
        TextView mName;

        public FragmentOneViewHolder(View itemView) {
            super(itemView);
            mName = (TextView) itemView.findViewById(R.id.name);
        }
    }
}
