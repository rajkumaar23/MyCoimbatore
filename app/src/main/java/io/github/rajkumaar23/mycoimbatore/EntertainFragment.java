package io.github.rajkumaar23.mycoimbatore;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EntertainFragment extends Fragment {


    public EntertainFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);



        // Create a list of words
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Brookefields Mall","R.S.Puram","https://www.google.com/maps/place/Brookefields+Mall/@11.0096899,76.9570378,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba859015dcbbe93:0x48ced40a587ca58e!8m2!3d11.0096846!4d76.9592265",R.drawable.brooks,getString(R.string.brooks)));
        words.add(new Word("Fun Republic Mall","Peelamedu","https://www.google.com/maps/place/Fun+Republic+Mall/@11.0243886,77.0085884,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba857808ae76bb5:0xc3c0586384052a74!8m2!3d11.0243833!4d77.0107771",R.drawable.fun,getString(R.string.fun)));
        words.add(new Word("Prozone Mall","Saravanampatty","https://www.google.com/maps/place/Prozone+Mall/@11.0556136,76.9917911,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba85809ea26fe25:0x7181e3143a519087!8m2!3d11.0556083!4d76.9939798",R.drawable.prozone,getString(R.string.prozone)));
        words.add(new Word("Black Thunder","Mettupalayam","https://www.google.com/maps/place/Black+Thunder/@11.3238597,76.9108364,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba8f660d83ee489:0x196424a05321db72!8m2!3d11.3238544!4d76.9130251",R.drawable.black,getString(R.string.black)));
        words.add(new Word("Kovai Kondattam","Kalampalyam","https://www.google.com/maps/place/Kovai+Kondattam+Amusement+Park+Pvt+Ltd/@10.9713117,76.8856436,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba85e9cedef11e5:0xe9eb7342f2325ca6!8m2!3d10.9713064!4d76.8878323",R.drawable.kondattam,getString(R.string.kondattam)));
        words.add(new Word("Maharaja Theme Park","Neelaambur","https://www.google.com/maps/place/Maharaja+Theme+Park/@11.059397,77.0930338,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba85603c026c03f:0xdd1ff606ce8367dd!8m2!3d11.0596339!4d77.0954147",R.drawable.maharaja,getString(R.string.maharaja)));
        words.add(new Word("Apex Racing Academy","Chettipalayam","https://www.google.com/maps/place/Apex+Racing+Academy/@10.9007203,77.0486883,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba85033fcdf33c3:0x5fbbcd454bfc9507!8m2!3d10.900715!4d77.050877",R.drawable.apex,getString(R.string.apex)));
        words.add(new Word("Coimbatore Golf Club","Chettipalayam","https://www.google.com/maps/place/Coimbatore+Golf+Club/@10.9107583,77.0226563,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba8506c2d26c7a7:0x90c29e8f19c96820!8m2!3d10.910753!4d77.024845",R.drawable.golf,getString(R.string.golf)));
        words.add(new Word("Off Road Adventures","Muthugoundanputhur","https://www.google.com/maps/place/OFF+ROAD+ADVENTURES/@11.0880287,77.0990908,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba8ff53dc4e5007:0x11024ebc6376f13a!8m2!3d11.061751!4d77.111045",R.drawable.offroad,getString(R.string.offroad)));
        words.add(new Word("Kart Attack","Peelamedu","https://www.google.com/maps/place/Kart+Attack/@11.044826,77.0492427,17z/data=!3m1!4b1!4m5!3m4!1s0x3ba857cbfaa128dd:0x11692830a996fcca!8m2!3d11.0448207!4d77.0514314",R.drawable.kart,getString(R.string.kart)));








        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), words, R.color.category_sports);

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

