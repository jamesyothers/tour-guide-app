package com.example.android.miwok;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of historical places.
 */
public class HistoricFragment extends Fragment {

    public HistoricFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of listItems
        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem(getResources().getString(R.string.bonnie_description), getResources().getString(R.string.bonnie)));
        listItems.add(new ListItem(getResources().getString(R.string.log_description), getResources().getString(R.string.log)));
        listItems.add(new ListItem(getResources().getString(R.string.cowgirl_description), getResources().getString(R.string.cowgirl)));
        listItems.add(new ListItem(getResources().getString(R.string.railroad_description), getResources().getString(R.string.railroad)));
        listItems.add(new ListItem(getResources().getString(R.string.village_description), getResources().getString(R.string.village)));

        // Create an {@link ListItemAdapter}, whose data source is a list of {@link ListItem}s. The
        // adapter knows how to create list items for each item in the list.
        ListItemAdapter adapter = new ListItemAdapter(getActivity(), listItems);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setBackgroundColor(getResources().getColor(R.color.category));

        return rootView;
    }

}