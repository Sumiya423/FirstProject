package com.example.projectone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    TextView heading,details;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        heading=findViewById(R.id.headingId);
        details=findViewById(R.id.detailsId);
        image=findViewById(R.id.imageViewId);

        String value= getIntent().getStringExtra("rich_name");

        if(value.equals("Jeff Bezos")){
            setTitle("Jeff Bezos");
            heading.setText("Jeff Bezos Details");
            details.setText(R.string.Jeff_Bezos);
            image.setImageResource(R.drawable.jeffbezos);
        }
        else if(value.equals("Bill Gates")){
            setTitle("Bill Gates");
            heading.setText("Bill Gates Details");
            details.setText(R.string.Bill_Gates);
            image.setImageResource(R.drawable.billgates);
        }
        else if(value.equals("Bernard Arnault")){
            setTitle("Bernard Arnault");
            heading.setText("Bernard Arnault Details");
            details.setText(R.string.Bernard_Arnault);
            image.setImageResource(R.drawable.bernard);
        }
        else if(value.equals("Warren Buffett")){
            setTitle("Warren Buffett");
            heading.setText("Warren Buffett Details");
            details.setText(R.string.Warren_Buffett);
            image.setImageResource(R.drawable.warren);
        }
        else if(value.equals("Larry Ellison")){
            setTitle("Larry Ellison");
            heading.setText("Larry Ellison Details");
            details.setText(R.string.Larry_Ellison);
            image.setImageResource(R.drawable.larry);
        }
        else if(value.equals("Amancio Ortega")){
            setTitle("Amancio Ortega");
            heading.setText("Amancio Ortega Details");
            details.setText(R.string.Amancio_Ortega);
            image.setImageResource(R.drawable.amancio);
        }
        else if(value.equals("Mark Zuckerberg")){
            setTitle("Mark Zuckerberg");
            heading.setText("Mark Zuckerberg Details");
            details.setText(R.string.Mark_Zuckerberg);
            image.setImageResource(R.drawable.zuckerberg);
        }
    }
}