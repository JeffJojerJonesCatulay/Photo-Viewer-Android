package com.example.exer4catulayjeffjojerjones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ResultPhotoLibrary extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_photo_library);

        ImageView imgVAL = findViewById(R.id.img);
        TextView nameVAL = findViewById(R.id.name);
        TextView dateVAL = findViewById(R.id.date);
        TextView desVAL = findViewById(R.id.des);


        Intent intent = getIntent();
        String value = intent.getStringExtra("indexValue");
        int indexValueChoice = Integer.parseInt(value);

        switch (indexValueChoice){
            case 1:
                imgVAL.setImageResource(R.drawable.img_one);
                nameVAL.setText(getString(R.string.l1_name));
                dateVAL.setText(getString(R.string.l1_date));
                desVAL.setText(getString(R.string.l1_des));
                break;
            case 2:
                imgVAL.setImageResource(R.drawable.img_two);
                nameVAL.setText(getString(R.string.l2_name));
                dateVAL.setText(getString(R.string.l2_date));
                desVAL.setText(getString(R.string.l2_des));
                break;
            case 3:
                imgVAL.setImageResource(R.drawable.img_three);
                nameVAL.setText(getString(R.string.l3_name));
                dateVAL.setText(getString(R.string.l3_date));
                desVAL.setText(getString(R.string.l3_des));
                break;
            case 4:
                imgVAL.setImageResource(R.drawable.img_four);
                nameVAL.setText(getString(R.string.l4_name));
                dateVAL.setText(getString(R.string.l4_date));
                desVAL.setText(getString(R.string.l4_des));
                break;
            case 5:
                imgVAL.setImageResource(R.drawable.img_five);
                nameVAL.setText(getString(R.string.l5_name));
                dateVAL.setText(getString(R.string.l5_date));
                desVAL.setText(getString(R.string.l5_des));
                break;
            case 6:
                imgVAL.setImageResource(R.drawable.img_six);
                nameVAL.setText(getString(R.string.l6_name));
                dateVAL.setText(getString(R.string.l6_date));
                desVAL.setText(getString(R.string.l6_des));
                break;
            case 7:
                imgVAL.setImageResource(R.drawable.img_seven);
                nameVAL.setText(getString(R.string.l7_name));
                dateVAL.setText(getString(R.string.l7_date));
                desVAL.setText(getString(R.string.l7_des));
                break;
            case 8:
                imgVAL.setImageResource(R.drawable.img_eight);
                nameVAL.setText(getString(R.string.l8_name));
                dateVAL.setText(getString(R.string.l8_date));
                desVAL.setText(getString(R.string.l8_des));
                break;
            case 9:
                imgVAL.setImageResource(R.drawable.img_nine);
                nameVAL.setText(getString(R.string.l9_name));
                dateVAL.setText(getString(R.string.l9_date));
                desVAL.setText(getString(R.string.l9_des));
                break;
            case 10:
                imgVAL.setImageResource(R.drawable.img_ten);
                nameVAL.setText(getString(R.string.l10_name));
                dateVAL.setText(getString(R.string.l10_date));
                desVAL.setText(getString(R.string.l10_des));
                break;
            case 11:
                imgVAL.setImageResource(R.drawable.img_eleven);
                nameVAL.setText(getString(R.string.l11_name));
                dateVAL.setText(getString(R.string.l11_date));
                desVAL.setText(getString(R.string.l11_des));
                break;
            case 12:
                imgVAL.setImageResource(R.drawable.img_twelve);
                nameVAL.setText(getString(R.string.l12_name));
                dateVAL.setText(getString(R.string.l12_date));
                desVAL.setText(getString(R.string.l12_des));
                break;
            case 13:
                imgVAL.setImageResource(R.drawable.img_thirteen);
                nameVAL.setText(getString(R.string.l13_name));
                dateVAL.setText(getString(R.string.l13_date));
                desVAL.setText(getString(R.string.l13_des));
                break;
            case 14:
                imgVAL.setImageResource(R.drawable.img_fourteen);
                nameVAL.setText(getString(R.string.l14_name));
                dateVAL.setText(getString(R.string.l14_date));
                desVAL.setText(getString(R.string.l14_des));
                break;
            case 15:
                imgVAL.setImageResource(R.drawable.img_fifteen);
                nameVAL.setText(getString(R.string.l15_name));
                dateVAL.setText(getString(R.string.l15_date));
                desVAL.setText(getString(R.string.l15_des));
                break;
        }
    }
}