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

public class HyderabadActivity extends AppCompatActivity {

    private ListView lv;
    private HyderabadCustomeAdapter customeAdapter;
    private ArrayList<HyderabadImageModel> imageModelArrayList;
    private int[] myImageList = new int[]{R.drawable.im1, R.drawable.im2,
            R.drawable.im3,R.drawable.im4
            ,R.drawable.im5,R.drawable.im6,
            R.drawable.im7,R.drawable.im8,R.drawable.im9,R.drawable.im10};
    private String[] myImageNameList = new String[]{"Bawarchi Restuarent", "Jonathon's Kitchen","Prego","Okra"
            ,"Seasonal Tastes","Momo Cafe","United Kitchens india","Ohri's Jiva Imperia","Chutneys","Angeethi"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hyderabad);

        lv = (ListView) findViewById(R.id.listView);

        imageModelArrayList = populateList();
        Log.d("hjhjh",imageModelArrayList.size()+"");
        customeAdapter = new HyderabadCustomeAdapter(this,imageModelArrayList);
        lv.setAdapter(customeAdapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0) {
                    Intent intent=new Intent(view.getContext(),Hyd1.class);
                    startActivityForResult(intent,0);
                }
                if(position==1) {
                    Intent intent1=new Intent(view.getContext(),Hyd2.class);
                    startActivityForResult(intent1,1);
                }
                if(position==2) {
                    Intent intent2=new Intent(view.getContext(),Hyd3.class);
                    startActivityForResult(intent2,2);
                }
                if(position==3) {
                    Intent intent3=new Intent(view.getContext(),Hyd4.class);
                    startActivityForResult(intent3,3);
                }
                if(position==4) {
                    Intent intent4=new Intent(view.getContext(),Hyd5.class);
                    startActivityForResult(intent4,4);
                }
                if(position==5) {
                    Intent intent5=new Intent(view.getContext(),Hyd6.class);
                    startActivityForResult(intent5,5);
                }
                if(position==6) {
                    Intent intent6=new Intent(view.getContext(),Hyd7.class);
                    startActivityForResult(intent6,6);
                }
                if(position==7) {
                    Intent intent7=new Intent(view.getContext(),Hyd8.class);
                    startActivityForResult(intent7,7);
                }
                if(position==8) {
                    Intent intent8=new Intent(view.getContext(),Hyd9.class);
                    startActivityForResult(intent8,8);
                }
                if(position==9) {
                    Intent intent9=new Intent(view.getContext(),Hyd10.class);
                    startActivityForResult(intent9,9);
                }
            }
        });


    }

    private ArrayList<HyderabadImageModel> populateList(){

        ArrayList<HyderabadImageModel> list = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            HyderabadImageModel imageModel = new HyderabadImageModel();
            imageModel.setName(myImageNameList[i]);
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);
        }

        return list;

    }

}

