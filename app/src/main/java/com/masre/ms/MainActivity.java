package com.masre.ms;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    Button button;
    EditText editText;
    TextView textView;
    ToggleButton toggleButton;
    Toolbar toolbar;
    Switch aSwitch;
    ArrayList data;
    Spinner spinner;
    ListView list;
    CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button = findViewById(R.id.button);
        editText = findViewById(R.id.edt);
        checkBox = findViewById(R.id.checkBox4);
        textView = findViewById(R.id.textView);
        toggleButton = findViewById(R.id.toggleButton3);
        toolbar = findViewById(R.id.toolbar);
        aSwitch = findViewById(R.id.switch2);
        spinner = findViewById(R.id.spinner);
        list = findViewById(R.id.list);

        toolbar.setTitle("Hi Ethiopia ");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


        data = new ArrayList<>();
        data.add("AAAAA");
        data.add("BBBBB");
        data.add("CCCCC");
        data.add("DDDDD");


        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.lists, R.id.textView, data);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0) {

                } else if (i == 1) {
                    Toast.makeText(MainActivity.this, "11111" + data.get(i), Toast.LENGTH_SHORT).show();
                }


            }
        });


        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, data);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_list_item_checked);
        spinner.setAdapter(dataAdapter);


        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity.this, "" + data.get(i), Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                boolean msan = aSwitch.isChecked();
                if (msan) {
                    Toast.makeText(MainActivity.this, "On ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "OF ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Button Is Clicked ", Toast.LENGTH_SHORT).show();
            }
        });


    }


    @Override
    protected void onStart() {
        super.onStart();

    }

    /**
     * Called when the activity has become visible.
     */
    @Override
    protected void onResume() {
        super.onResume();

    }

    /**
     * Called when another activity is taking focus.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "pause", Toast.LENGTH_SHORT).show();
    }

    /**
     * Called when the activity is no longer visible.
     */
    @Override
    protected void onStop() {
        super.onStop();

    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "destroy ", Toast.LENGTH_SHORT).show();
    }


    public void msan(View view) {

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                boolean msan = checkBox.isChecked();
                if (msan) {
                    Toast.makeText(MainActivity.this, "CheckBox On ", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "CheckBox OF ", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}