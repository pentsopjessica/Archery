package com.example.pents.archery;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public abstract class MainActivity extends AppCompatActivity {
Button Archery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Archery=(Button)findViewById(R.id.Link);
        //see tegevus võimaldab sul nuppule vajutamsiel avada veebileht
        Archery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "http://en.Wikipedia.org/wiki/Archery";

                Intent intent = new Intent(Intent.ACTION_VIEW);
                Intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
    }
    //see tegevus võimaldab sul liikuda edasi uue activity peale/ lehele kus on näha pildid
    public void Pildid(View view){
        Intent intent =new Intent (MainActivity.this, PildidActivity.class);
    }