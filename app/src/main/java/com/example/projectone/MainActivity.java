package com.example.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button infoBtn;
    TextView nameView;
    Spinner richSpinner;
    String[] richName;
    String[] topRich;
    MyAdaptor adapter;
    int[] image={R.drawable.jeffbezos,R.drawable.billgates,R.drawable.bernard,
            R.drawable.warren,R.drawable.larry,R.drawable.amancio,R.drawable.zuckerberg};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        infoBtn = findViewById(R.id.submitBtnId);
        nameView=findViewById(R.id.textViewId);
        richSpinner=findViewById((R.id.spinnerId));

        richName=getResources().getStringArray(R.array.Rich_Man);
        topRich=getResources().getStringArray(R.array.Top);



        infoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               String value = nameView.getText().toString();

                Intent intent=new Intent(MainActivity.this,ProfileActivity.class);
                intent.putExtra("rich_name",value);
                startActivity(intent);
            }
        });





        adapter=new MyAdaptor(MainActivity.this,richName,topRich,image);
        richSpinner.setAdapter(adapter);

        richSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                nameView.setText(richName[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}