package com.srm.dixitsoham.instantsearch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = findViewById(R.id.search);
        b1 = findViewById(R.id.s_btn);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String search = e1.getText().toString();
                Uri uri = Uri.parse("https://www.google.com/search?q=" + search);
                Intent gSearch = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(gSearch);
            }
        });
    }
}
