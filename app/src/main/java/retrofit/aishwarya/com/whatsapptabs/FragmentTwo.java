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
public class FragmentTwo extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_two, null);
        initUI(view);
        return view;
    }

    private void initUI(View view) {
        RecyclerView fragTwoRecyclerView = (RecyclerView) view.findViewById(R.id.frag_two_items);
        fragTwoRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        List<String> dummyNames = getDummyNamesForFragmentTwo();
        FragmentOneAdapter fragmentOneAdapter   = new FragmentOneAdapter(dummyNames, getActivity());
        fragTwoRecyclerView.setAdapter(fragmentOneAdapter);
        fragTwoRecyclerView.setItemAnimator(new DefaultItemAnimator());
    }

    private List<String> getDummyNamesForFragmentTwo() {
        List<String> countryNames = Arrays.asList(getActivity().getResources()
                .getStringArray(R.array.country_names));
        return countryNames;
    }
}
