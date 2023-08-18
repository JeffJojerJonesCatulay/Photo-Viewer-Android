package com.example.exer4catulayjeffjojerjones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> photoListName= new ArrayList<>();
        photoListName.add("Chariot");
        photoListName.add("Temple");
        photoListName.add("Hallway");
        photoListName.add("Marching Band");
        photoListName.add("The Statue");
        photoListName.add("Lone Cat");
        photoListName.add("Dream Catcher");
        photoListName.add("Pizza Party");
        photoListName.add("Angel of Dark");
        photoListName.add("Light");
        photoListName.add("National Museum");
        photoListName.add("Fav Food");
        photoListName.add("Empty Bed");
        photoListName.add("Fortune Fountain");
        photoListName.add("Cat Love");

        ArrayList<String> photoListDate= new ArrayList<>();
        photoListDate.add("May 1, 2019");
        photoListDate.add("May 1, 2019");
        photoListDate.add("May 1, 2019");
        photoListDate.add("May 1, 2019");
        photoListDate.add("May 1, 2019");
        photoListDate.add("June 8, 2019");
        photoListDate.add("June 8, 2019");
        photoListDate.add("Dec 16, 2019");
        photoListDate.add("Sept 1, 2019");
        photoListDate.add("Sept 1, 2019");
        photoListDate.add("June 8, 2019");
        photoListDate.add("May 1, 2019");
        photoListDate.add("Dec 7, 2019");
        photoListDate.add("Dec 7, 2019");
        photoListDate.add("Dec 8, 2019");

        ArrayList<Integer> photoListImage = new ArrayList<>();
        photoListImage.add(R.drawable.img_one);
        photoListImage.add(R.drawable.img_two);
        photoListImage.add(R.drawable.img_three);
        photoListImage.add(R.drawable.img_four);
        photoListImage.add(R.drawable.img_five);
        photoListImage.add(R.drawable.img_six);
        photoListImage.add(R.drawable.img_seven);
        photoListImage.add(R.drawable.img_eight);
        photoListImage.add(R.drawable.img_nine);
        photoListImage.add(R.drawable.img_ten);
        photoListImage.add(R.drawable.img_eleven);
        photoListImage.add(R.drawable.img_twelve);
        photoListImage.add(R.drawable.img_thirteen);
        photoListImage.add(R.drawable.img_fourteen);
        photoListImage.add(R.drawable.img_fifteen);

        List<HashMap<String,String>> aList = new ArrayList<HashMap<String, String>>();
        for (int x = 0; x < 15; x++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("photoListName", photoListName.get(x));
            hm.put("photoListDate", photoListDate.get(x));
            hm.put("photoListImage",Integer.toString(photoListImage.get(x)));
            aList.add(hm);
        }
        String[] from = {
                "photoListName","photoListDate","photoListImage"
        };
        int[] to = {
                R.id.name,R.id.date,R.id.img
        };

        SimpleAdapter photoListAdap = new SimpleAdapter(getBaseContext(),aList, R.layout.listview,from,to);
        ListView photoLib = (ListView)findViewById(R.id.photoList);
        photoLib.setAdapter(photoListAdap);

        photoLib.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case  0:
                        Toast.makeText(getApplicationContext(),
                                getString(R.string.l1_name),
                                Toast.LENGTH_LONG).show();
                        openResultintent("1");
                        break;
                    case  1:
                        Toast.makeText(getApplicationContext(),
                                getString(R.string.l2_name),
                                Toast.LENGTH_LONG).show();
                        openResultintent("2");
                        break;
                    case  2:
                        Toast.makeText(getApplicationContext(),
                                getString(R.string.l3_name),
                                Toast.LENGTH_LONG).show();
                        openResultintent("3");
                        break;
                    case  3:
                        Toast.makeText(getApplicationContext(),
                                getString(R.string.l4_name),
                                Toast.LENGTH_LONG).show();
                        openResultintent("4");
                        break;
                    case  4:
                        Toast.makeText(getApplicationContext(),
                                getString(R.string.l5_name),
                                Toast.LENGTH_LONG).show();
                        openResultintent("5");
                        break;
                    case  5:
                        Toast.makeText(getApplicationContext(),
                                getString(R.string.l6_name),
                                Toast.LENGTH_LONG).show();
                        openResultintent("6");
                        break;
                    case  6:
                        Toast.makeText(getApplicationContext(),
                                getString(R.string.l7_name),
                                Toast.LENGTH_LONG).show();
                        openResultintent("7");
                        break;
                    case  7:
                        Toast.makeText(getApplicationContext(),
                                getString(R.string.l8_name),
                                Toast.LENGTH_LONG).show();
                        openResultintent("8");
                        break;
                    case  8:
                        Toast.makeText(getApplicationContext(),
                                getString(R.string.l9_name),
                                Toast.LENGTH_LONG).show();
                        openResultintent("9");
                        break;
                    case  9:
                        Toast.makeText(getApplicationContext(),
                                getString(R.string.l10_name),
                                Toast.LENGTH_LONG).show();
                        openResultintent("10");
                        break;
                    case  10:
                        Toast.makeText(getApplicationContext(),
                                getString(R.string.l11_name),
                                Toast.LENGTH_LONG).show();
                        openResultintent("11");
                        break;
                    case  11:
                        Toast.makeText(getApplicationContext(),
                                getString(R.string.l12_name),
                                Toast.LENGTH_LONG).show();
                        openResultintent("12");
                        break;
                    case  12:
                        Toast.makeText(getApplicationContext(),
                                getString(R.string.l13_name),
                                Toast.LENGTH_LONG).show();
                        openResultintent("13");
                        break;
                    case  13:
                        Toast.makeText(getApplicationContext(),
                                getString(R.string.l14_name),
                                Toast.LENGTH_LONG).show();
                        openResultintent("14");
                        break;
                    case  14:
                        Toast.makeText(getApplicationContext(),
                                getString(R.string.l15_name),
                                Toast.LENGTH_LONG).show();
                        openResultintent("15");
                        break;
                }
            }
        });
    }

    public  void openResultintent(String choiceindex){
        Intent intent = new Intent(MainActivity.this, ResultPhotoLibrary.class);
        intent.putExtra("indexValue", choiceindex);
        startActivity(intent);
    }
}