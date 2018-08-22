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

public class ChennaiActivity extends AppCompatActivity {

    private ListView lv;
    private ChennaiCustomeAdapter customeAdapter;
    private ArrayList<ChennaiImageModel> imageModelArrayList;
    private int[] myImageList = new int[]{R.drawable.im1, R.drawable.im2,
            R.drawable.im3,R.drawable.im4
            ,R.drawable.im5,R.drawable.im6,
            R.drawable.im7,R.drawable.im8,R.drawable.im9,R.drawable.im10};
    private String[] myImageNameList = new String[]{"Seasonal Tastes", "Southern Spice","The Marina","Murugans Idli Shop"
            ,"On The Rocks","Indian Accent","Paprika","Madras Pavillion","Cafe Mercara","Anna Maya"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chennai);

        lv = (ListView) findViewById(R.id.listView);

        imageModelArrayList = populateList();
        Log.d("hjhjh",imageModelArrayList.size()+"");
        customeAdapter = new ChennaiCustomeAdapter(this,imageModelArrayList);
        lv.setAdapter(customeAdapter);


        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==0) {
                    Intent intent=new Intent(view.getContext(),Chen1.class);
                    startActivityForResult(intent,0);
                }
                if(position==1) {
                    Intent intent1=new Intent(view.getContext(),Chen2.class);
                    startActivityForResult(intent1,1);
                }
                if(position==2) {
                    Intent intent2=new Intent(view.getContext(),Chen3.class);
                    startActivityForResult(intent2,2);
                }
                if(position==3) {
                    Intent intent3=new Intent(view.getContext(),Chen4.class);
                    startActivityForResult(intent3,3);
                }
                if(position==4) {
                    Intent intent4=new Intent(view.getContext(),Chen5.class);
                    startActivityForResult(intent4,4);
                }
                if(position==5) {
                    Intent intent5=new Intent(view.getContext(),Chen6.class);
                    startActivityForResult(intent5,5);
                }
                if(position==6) {
                    Intent intent6=new Intent(view.getContext(),Chen7.class);
                    startActivityForResult(intent6,6);
                }
                if(position==7) {
                    Intent intent7=new Intent(view.getContext(),Chen8.class);
                    startActivityForResult(intent7,7);
                }
                if(position==8) {
                    Intent intent8=new Intent(view.getContext(),Chen9.class);
                    startActivityForResult(intent8,8);
                }
                if(position==9) {
                    Intent intent9=new Intent(view.getContext(),Chen10.class);
                    startActivityForResult(intent9,9);
                }
            }
        });


    }

    private ArrayList<ChennaiImageModel> populateList(){

        ArrayList<ChennaiImageModel> list = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            ChennaiImageModel imageModel = new ChennaiImageModel();
            imageModel.setName(myImageNameList[i]);
            imageModel.setImage_drawable(myImageList[i]);
            list.add(imageModel);
        }

        return list;

    }

}

