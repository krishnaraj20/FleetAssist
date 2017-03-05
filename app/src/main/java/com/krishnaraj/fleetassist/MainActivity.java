package com.krishnaraj.fleetassist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import static android.R.id.empty;
import static android.os.Build.VERSION_CODES.N;

public class MainActivity extends AppCompatActivity {
    EditText loan, truck, starting, ending;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.button);
        starting = (EditText)
                findViewById(R.id.start);
        loan = (EditText)findViewById(R.id.load);
        truck = (EditText)findViewById(R.id.truckid);
        ending = (EditText) findViewById(R.id.end);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (starting.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), "field can't be empty", Toast.LENGTH_LONG).show();
                    starting.setError("field Cannot be empty");
                    return;
                } else if (ending.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), " field can't be empty", Toast.LENGTH_LONG).show();
                    ending.setError("field Cannot be empty");
                    return;
                } else if (loan.getText().toString().length() == 0) {
                    Toast.makeText(getApplicationContext(), "field can't be empty", Toast.LENGTH_LONG).show();
                    loan.setError("field Cannot be empty");
                    return;
                }
                else if(truck.getText().toString().length()==0)
                {
                    Toast.makeText(getApplicationContext(),"field can't be empty", Toast.LENGTH_LONG).show();
                    truck.setError("field Cannot be empty");
                    return;
                }
            }
        });


    }
}