package io.github.rajkumaar23.mycoimbatore;


import android.content.Intent;
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
public class TemplesFragment extends Fragment {


    public TemplesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);



        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Subramanya Swami Temple","Marudhamalai","https://www.google.com/maps/place/Arulmigu+Subramanya+Swami+Temple,+Maruthamalai/@11.0463151,76.850648,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba85f853e01b50b:0xcbc9bcc157065c67!8m2!3d11.0463098!4d76.8528367",R.drawable.marudha,getString(R.string.marudha)));
        words.add(new Word("Pateeswarar Temple","Perur","https://www.google.com/maps/place/Patteeswarar+Swamy+Aalyam/@10.9758529,76.9125956,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba85eadaa2e8f65:0x8c098785268a2605!8m2!3d10.9758476!4d76.9147843",R.drawable.perur,getString(R.string.perur)));
        words.add(new Word("Dhyanalinga Yogic Temple","Booluvampatti","https://www.google.com/maps/place/Isha+Yoga+Center/@10.9779818,76.7338381,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba866ca6aaaaaab:0xa0356ba16ab25d00!8m2!3d10.9779765!4d76.7360268",R.drawable.isha,getString(R.string.isha)));
        words.add(new Word("Eachanari Vinayagar Temple","Eachanari","https://www.google.com/maps/place/Arulmigu+Eachanari+Vinayagar+Temple/@10.9239203,76.9802133,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba85af5cf94a363:0xc376cb913c50b99d!8m2!3d10.923915!4d76.982402",R.drawable.eacha,getString(R.string.eacha)));
        words.add(new Word("Masani Amman Temple","Pollachi","https://www.google.com/maps/place/Arulmigu+Masani+Amman+Temple/@10.5755754,76.9326599,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba83b9c1a9ecbcf:0x7cec2bb57aee365a!8m2!3d10.5755701!4d76.9348486",R.drawable.masani,getString(R.string.masani)));
        words.add(new Word("Arulmigu Koniamman Temple","Town Hall","https://www.google.com/maps/place/Arulmigu+Koniamman+Temple/@10.9936087,76.9615888,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba8590a9b1c0e71:0x1a063b6824700736!8m2!3d10.9936034!4d76.9637775",R.drawable.koni,getString(R.string.koni)));
        words.add(new Word("Naga Sai Mandir","Tatabad","https://www.google.com/maps/place/Sri+Naga+Sai+Temple/@11.0275083,76.9479593,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba858ee506206ed:0x78b683418ebaba6!8m2!3d11.027503!4d76.950148",R.drawable.sai,getString(R.string.sai)));
        words.add(new Word("Velliangiri Andavar Temple","Poondi","https://www.google.com/maps/place/Velliangiri+Sivan+Temple/@10.988707,76.6850534,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba863082657c5a7:0x16210be88cca4afe!8m2!3d10.9887017!4d76.6872421",R.drawable.velli,getString(R.string.velli)));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_temples);

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

