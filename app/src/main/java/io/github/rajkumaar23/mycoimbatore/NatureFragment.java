package io.github.rajkumaar23.mycoimbatore;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
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
public class NatureFragment extends Fragment {


    public NatureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);



        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Siruvani Waterfalls","Booluvampatti","https://www.google.com/maps/place/Siruvani+Waterfalls/@10.9378065,76.6848147,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba8648a87373e3d:0x9ad9efaf23aff013!8m2!3d10.9378012!4d76.6870034",R.drawable.siruvani,getString(R.string.siruvani)));
        words.add(new Word("Anamalai National Park","Pollachi","https://www.google.com/maps/place/Anamalai+Tiger+Reserve/@10.4241043,77.1233713,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba82a57e32f330b:0x837528b15369b92e!8m2!3d10.424099!4d77.12556",R.drawable.anamalai,getString(R.string.anamalai)));
        words.add(new Word("Monkey Falls","Valparai","https://www.google.com/maps/place/Monkey+falls/@10.4578507,76.966978,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba825cbe9ca20f3:0x41e0a566a27d5264!8m2!3d10.4578454!4d76.9691667",R.drawable.monkey,getString(R.string.monkey)));
        words.add(new Word("Baralikkadu ","Mettupalayam","https://www.google.com/maps/place/Baralikkadu/@11.246677,76.7875098,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba8928da3c8e163:0xa4292ade5b5c322e!8m2!3d11.2466717!4d76.7896985",R.drawable.barali,getString(R.string.barali)));
        words.add(new Word("Kovai Kuttralam","Booluvampatti","https://www.google.com/maps/place/Kovai+Kutralam/@10.9392533,76.7009012,19z/data=!3m1!4b1!4m5!3m4!1s0x3ba86468fb0cdf51:0x5af803c549613a47!8m2!3d10.939252!4d76.7014484",R.drawable.kuttralam,getString(R.string.kuttralam)));
        words.add(new Word("Velliangiri Mountains","Booluvampatti","https://www.google.com/maps/place/Velliangiri+Mountains/@10.9791921,76.6968734,15z/data=!4m8!1m2!2m1!1svelliangiri+mountains!3m4!1s0x3ba863a165245ad1:0xd0434bece410fb63!8m2!3d10.983279!4d76.6926714",R.drawable.vellingiri,getString(R.string.vellingiri)));
        words.add(new Word("TNAU Botanical Garden","Pappanaickenpudur","https://www.google.com/maps/place/TNAU+Botanical+Garden/@11.0147985,76.9293475,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba858d848c28f17:0x84fd16ea5466538!8m2!3d11.0147932!4d76.9315362",R.drawable.tnau,getString(R.string.tnau)));
        words.add(new Word("Sholayar Dam","Valparai","https://www.google.com/maps/place/Sholayar+Dam/@10.3158177,76.7620069,12z/data=!4m8!1m2!2m1!1ssholayar+dam!3m4!1s0x3b078a5700000001:0x539724e9f041f58e!8m2!3d10.2983237!4d76.8804581", R.drawable.shola,getString(R.string.shola)));
        words.add(new Word("Aazhiyaar Dam","Pollachi","https://www.google.com/maps/place/Aliyar+Reservoir/@10.4739208,76.9640452,15z/data=!3m1!4b1!4m5!3m4!1s0x3ba825ae2d0cd4cd:0x6ce8b257888c854a!8m2!3d10.4739!4d76.9728",R.drawable.azhiyar,getString(R.string.azhiyar)));
        words.add(new Word("Parambikulam Wildlife Sanctuary","Palakkad","https://www.google.com/maps/place/Parambikulam+Wildlife+Sanctuary/@10.4449683,76.8106213,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba818ba9f29dceb:0x1d8bd7ff05f48326!8m2!3d10.444963!4d76.81281",R.drawable.parambi,getString(R.string.parambi)));
        words.add(new Word("Bhavani Sagar Dam","Erode","https://www.google.com/maps/place/Bhavanisagar+Reservoir/@11.4391934,77.0006633,12z/data=!3m1!4b1!4m5!3m4!1s0x3ba8dd96593cd45b:0x2dcbca30fb6163fd!8m2!3d11.4458582!4d77.0737149",R.drawable.bhavani,getString(R.string.bhavani)));
        words.add(new Word("Silent Valley","Palakkad","https://www.google.com/maps/place/Silent+Valley+National+Park/@11.0641343,76.5356273,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba62af225691cfd:0xf9e2a321ac787017!8m2!3d11.064129!4d76.537816",R.drawable.silent,getString(R.string.silent)));


        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_nature);

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


