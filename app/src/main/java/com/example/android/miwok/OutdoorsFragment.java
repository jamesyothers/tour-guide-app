package com.example.android.miwok;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of outdoor activities.
 */
public class OutdoorsFragment extends Fragment {

    public OutdoorsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of listItems
        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem(getResources().getString(R.string.cedar_description), getResources().getString(R.string.cedar)));
        listItems.add(new ListItem(getResources().getString(R.string.white_description), getResources().getString(R.string.white)));
        listItems.add(new ListItem(getResources().getString(R.string.trinity_description), getResources().getString(R.string.trinity)));
        listItems.add(new ListItem(getResources().getString(R.string.widow_description), getResources().getString(R.string.widow)));
        listItems.add(new ListItem(getResources().getString(R.string.audubon_description), getResources().getString(R.string.audubon)));

        // Create an {@link ListItemAdapter}, whose data source is a list of {@link ListItem}s. The
        // adapter knows how to create list items for each item in the list.
        ListItemAdapter adapter = new ListItemAdapter(getActivity(), listItems);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link ListItemAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        listView.setBackgroundColor(getResources().getColor(R.color.category));

        return rootView;
    }

}