package com.example.hcfandlcm;

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

        Button hcfButton = (Button) findViewById(R.id.hcfButton);
        hcfButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firtNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firtNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());

                int a,b,t, hcf;
                a = num1;
                b = num2;

                while(b != 0)
                {
                    t = b;
                    b = a%b;
                    a = t;
                }

                hcf = a;
                int result = hcf;
                resultTextView.setText(result + "");
            }
        });

        Button lcmButton = (Button) findViewById(R.id.lcmButton);
        lcmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firtNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firtNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());

                int a,b,t,hcf,lcm;
                a = num1;
                b = num2;

                while(b != 0)
                {
                    t = b;
                    b = a%b;
                    a = t;
                }

                hcf = a;
                lcm = (num1*num2)/hcf;
                int result = lcm;
                resultTextView.setText(result + "");
            }
        });
    }
}
