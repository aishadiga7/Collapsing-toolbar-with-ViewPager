package retrofit.aishwarya.com.whatsapptabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;
import java.util.List;

/**
 * Created by aishwarya on 14/7/16.
 */
public class FragmentOne extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_one, null);
        initUI(view);
        return view;
    }

    private void initUI(View view) {
        RecyclerView fragOneRecyclerView = (RecyclerView) view.findViewById(R.id.frag_one_items);
        fragOneRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        List<String> dummyNames = getDummyNamesForFragmentOne();
        FragmentOneAdapter fragmentOneAdapter   = new FragmentOneAdapter(dummyNames, getActivity());
        fragOneRecyclerView.setAdapter(fragmentOneAdapter);
        fragOneRecyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private List<String> getDummyNamesForFragmentOne() {
        List<String> planetNames = Arrays.asList(getActivity().getResources()
                .getStringArray(R.array.planet_names));
        return planetNames;
    }
}
