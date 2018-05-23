package io.github.rajkumaar23.mycoimbatore;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=(Button) findViewById(R.id.start);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent start=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(start);
            }
        });
        Button button2=(Button) findViewById(R.id.about);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent start=new Intent(MainActivity.this,Main4Activity.class);
                startActivity(start);
            }
        });
    }
}
