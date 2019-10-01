package com.example.android.miwok;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of museums.
 */
public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);

        // Create a list of words
        final ArrayList<ListItem> listItems = new ArrayList<>();

        listItems.add(new ListItem(getResources().getString(R.string.vomit_description), getResources().getString(R.string.vomit), R.drawable.rainbow_vomit));
        listItems.add(new ListItem(getResources().getString(R.string.bush_description), getResources().getString(R.string.bush), R.drawable.bush_library));
        listItems.add(new ListItem(getResources().getString(R.string.delany_description), getResources().getString(R.string.delany), R.drawable.delany_min));
        listItems.add(new ListItem(getResources().getString(R.string.vomit_description), getResources().getString(R.string.vomit), R.drawable.rainbow_vomit));
        listItems.add(new ListItem(getResources().getString(R.string.art_description), getResources().getString(R.string.art), R.drawable.art_museum));

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

        listView.setBackgroundColor(getResources().getColor(R.color.category_numbers));

        return rootView;
    }

}