package com.example.aarya.foodie;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class KolkataActivity extends AppCompatActivity {

    private ListView lv;
    private KolkataCustomeAdapter customeAdapter;
    private ArrayList<KolkataImageModel> imageModelArrayList;
    private int[] myImageList = new int[]{R.drawable.im1, R.drawable.im2,
            R.drawable.im3,R.drawable.im4
            ,R.drawable.im5,R.drawable.im6,
            R.drawable.im7,R.drawable.im8,R.drawable.im9,R.drawable.im10};
    private String[] myImageNameList = new String[]{"Tandoor House", "Shaima Restuarent","Aliya Biriyani House","Ali Baba"
            ,"Shiraz Restuarent","Zeeshan Restaurent","Royal India Restaurent","Arsalan ","Cafe 18+","Tandoor Darbaar"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kolkata);

        lv = (ListView) findViewById(R.id.listView);

        imageModelArrayList = populateList();
        Log.d("hjhjh",imageModelArrayList.size()+"");
        customeAdapter = new KolkataCustomeAdapter(this,imageModelArrayList);
        lv.setAdapter(customeAdapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0) {
                    Intent intent=new Intent(view.getContext(),Kol1.class);
                    startActivityForResult(intent,0);
                }
                if(position==1) {
                    Intent intent1=new Intent(view.getContext(),Kol2.class);
                    startActivityForResult(intent1,1);
                }
                if(position==2) {
                    Intent intent2=new Intent(view.getContext(),Kol3.class);
                    startActivityForResult(intent2,2);
                }
                if(position==3) {
                    Intent intent3=new Intent(view.getContext(),Kol4.class);
                    startActivityForResult(intent3,3);
                }
                if(position==4) {
                    Intent intent4=new Intent(view.getContext(),Kol5.class);
                    startActivityForResult(intent4,4);
                }
                if(position==5) {
                    Intent intent5=new Intent(view.getContext(),Kol6.class);
                    startActivityForResult(intent5,5);
                }
                if(position==6) {
                    Intent intent6=new Intent(view.getContext(),Kol7.class);
                    startActivityForResult(intent6,6);
                }
                if(position==7) {
                    Intent intent7=new Intent(view.getContext(),Kol8.class);
                    startActivityForResult(intent7,7);
                }
                if(position==8) {
                    Intent intent8=new Intent(view.getContext(),Kol9.class);
                    startActivityForResult(intent8,8);
                }
                if(position==9) {
                    Intent intent9=new Intent(view.getContext(),Kol10.class);
                    startActivityForResult(intent9,9);
                }
            }
        });


    }

    private ArrayList<KolkataImageModel> populateList(){

        ArrayList<KolkataImageModel> list = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            KolkataImageModel imageModel = new KolkataImageModel();
            imageModel.setName(myImageNameList[i]);
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);
        }

        return list;

    }

}

