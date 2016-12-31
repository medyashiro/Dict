package com.almokhtasaralmofid.dict;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText txt1 ;
        final EditText txt2 ;
        final EditText txt3 ;
         Button bu ;
        txt1 = (EditText) findViewById(R.id.editText1);
        txt2 = (EditText)findViewById(R.id.editText2);
        txt3 = (EditText)findViewById(R.id.editText3);
        bu = (Button)findViewById(R.id.buAdd);

        bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n1 = Integer.parseInt(txt1.getText().toString());
                int n2 = Integer.parseInt(txt2.getText().toString());
                int nr = n1+n2;

                txt3.setText(String.valueOf(nr));
            }
        });




    }
}
