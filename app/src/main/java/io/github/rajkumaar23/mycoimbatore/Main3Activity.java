package io.github.rajkumaar23.mycoimbatore;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main3Activity extends AppCompatActivity {

     String geo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent i=getIntent();
        Bundle b=i.getExtras();
        String str=(String) b.get("Desc");
        TextView textView= findViewById(R.id.desc);
        textView.setText(str);
        int pic=(int)b.get("Pic");
        ImageView imageView=(ImageView)findViewById(R.id.image);
        imageView.setImageResource(pic);
        final String url=(String)b.get("url");

        Button button=findViewById(R.id.maps);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                if (i.resolveActivity(getPackageManager()) != null) {
                    startActivity(i);
                }
            }
        });

    }



    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                Intent parentIntent = NavUtils.getParentActivityIntent(this);
                parentIntent.setFlags(Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT | Intent.FLAG_ACTIVITY_SINGLE_TOP | Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(parentIntent);
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
