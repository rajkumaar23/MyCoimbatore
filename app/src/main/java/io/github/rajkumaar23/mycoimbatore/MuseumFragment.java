package io.github.rajkumaar23.mycoimbatore;


import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MuseumFragment extends Fragment {







    public MuseumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);



        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Gedee Museum","Avanashi Road","https://www.google.com/maps/place/GD+Naidu+Museum/@11.0071627,76.9756024,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba859b1af05b363:0x79847b55a2765875!8m2!3d11.0071574!4d76.9777911",R.drawable.gd,getString(R.string.gd)));
        words.add(new Word("Gass Forest Museum","R.S.Puram","https://www.google.com/maps/place/Gass+Forest+Museum/@11.0165495,76.9438047,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba858e16ddfea5d:0x957f4fb6534760ec!8m2!3d11.0165442!4d76.9459934",R.drawable.gfm,getString(R.string.gfm)));
        words.add(new Word("Ancient Industrial Artifacts Museum","Ramanathapuram","https://www.google.com/maps/place/Ancient+Industrial+Artifacts+Museum/@10.9897997,76.9968665,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba859e6287a130d:0xeeec22ad601a58ab!8m2!3d10.9897944!4d76.9990552",R.drawable.ancient,getString(R.string.ancient)));

        words.add(new Word("Kasthuri Sreenivasan Art Gallery ","Avanashi Road","https://www.google.com/maps/place/Kasthuri+Sreenivasan+Art+Gallery+%26+Textile+Museum+(Culture+Centre)/@11.0344896,77.030251,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba857be2c3d77a5:0x1006596fe3f69f6d!8m2!3d11.0344843!4d77.0324397",R.drawable.kasturi,getString(R.string.kasturi)));
        words.add(new Word("Regional Science Center","Peelamedu","https://www.google.com/maps/place/Regional+Science+Centre+and+Science+Museum/@11.0327693,77.0249453,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba85791512bcf97:0x33d5b1f6ec12c04f!8m2!3d11.032764!4d77.027134",R.drawable.regional,getString(R.string.regional)));
        words.add(new Word("Government Museum","Gopalapuram","https://www.google.com/maps/place/MUSEUM/@11.0073039,76.9678474,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba859a944cdef93:0x6d53e3c7bcbfd03d!8m2!3d11.0072986!4d76.9700361",R.drawable.govtmuseum,getString(R.string.govtmuseum)));
        words.add(new Word("Palakkad Fort","Fort Maidan","https://www.google.com/maps/place/Palakkad+Fort/@10.763711,76.6549328,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba86dee9706765f:0xbe653c3f3ca26523!8m2!3d10.7637057!4d76.6571215",R.drawable.fort,getString(R.string.fort)));



        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_museum);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);



        return rootView;
    }

}

