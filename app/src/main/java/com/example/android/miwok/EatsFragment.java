package com.example.android.miwok;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of places to eat.
 */
public class EatsFragment extends Fragment {

    public EatsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of listItems
        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem(getResources().getString(R.string.teian_description), getResources().getString(R.string.teian)));
        listItems.add(new ListItem(getResources().getString(R.string.lucia_description), getResources().getString(R.string.lucia)));
        listItems.add(new ListItem(getResources().getString(R.string.bullion_description), getResources().getString(R.string.bullion)));
        listItems.add(new ListItem(getResources().getString(R.string.hearth_description), getResources().getString(R.string.hearth)));
        listItems.add(new ListItem(getResources().getString(R.string.sachet_description), getResources().getString(R.string.sachet)));

        // Create an {@link ListItemAdapter}, whose data source is a list of {@link ListItem}s. The
        // adapter knows how to create list items for each item in the list.
        ListItemAdapter adapter = new ListItemAdapter(getActivity(), listItems);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link ListItem} in the list.
        listView.setAdapter(adapter);

        listView.setBackgroundColor(getResources().getColor(R.color.category));

        return rootView;
    }

}