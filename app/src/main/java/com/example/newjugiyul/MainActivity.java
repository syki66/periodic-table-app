package com.example.newjugiyul;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private TextView mTextMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final int[] pic = new int[]{R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5};


        final ImageView img_view = (ImageView) findViewById(R.id.img1);
        final TableLayout tableLayout = (TableLayout) findViewById(R.id.table); // 테이블 id 명


        for (int i = 0; i < 20; i++) {
// Creation row
            final TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.WRAP_CONTENT, TableLayout.LayoutParams.WRAP_CONTENT));


            for(int j = 0 ; j < 2 ; j++){
                final Button table_btn = new Button(this);

                table_btn.setText( i*2 + j + "");
                table_btn.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));

                tableRow.addView(table_btn);

                final int i2 = i;
                table_btn.setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v){
                        img_view.setImageResource(pic[i2]);
                    }
                });

            }

            tableLayout.addView(tableRow);
        }







        final ScrollView sv = (ScrollView)findViewById(R.id.second_bar);

        final ImageView img_view = (ImageView) findViewById(R.id.img1);
        BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:

                        sv.setVisibility(View.GONE);
                        img_view.setVisibility(View.GONE);
                        return true;
                    case R.id.navigation_dashboard:
                        sv.setVisibility(View.VISIBLE);
                        img_view.setVisibility(View.GONE);
                        return true;
                    case R.id.navigation_notifications:
                        sv.setVisibility(View.GONE);
                        img_view.setVisibility(View.GONE);
                        return true;
                }
                return false;
            }
        };
        int[] ids = new int[]{R.id.H, R.id.He, R.id.Li, R.id.Be, R.id.B};
        int[] ids4 = new int[]{R.id.H2, R.id.He2, R.id.Li2, R.id.Be2, R.id.B2};
        //Button ab1 = (Button)findViewById(R.id.H);
        //Button ab2 = (Button)findViewById(R.id.He);
        //ab1.setOnClickListener(this);
       // ab2.setOnClickListener(this);



        Button[] btn = new Button[5];
        Button[] btn2 = new Button[5];

        for(int i=0; i<5; i++){
            btn[i] = (Button)findViewById(ids[i]);
            btn[i].setOnClickListener(this);
            btn2[i] = (Button)findViewById(ids4[i]);
            btn2[i].setOnClickListener(this);
        }


        /*ab1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                ab1.setVisibility(View.GONE);
            }
        });*/


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    //Button ab1 = (Button)findViewById(R.id.H);


    @Override
    public void onClick(View v){


        ImageView img_view = (ImageView) findViewById(R.id.img1);
        //ImageView[] img_view = new ImageView[5];

        /*
        for(int i=0; i<5; i++){
            img_view[i] = (ImageView) findViewById(R.id.img1);
            img_view[i].setOnClickListener(this);

        }
        */
        /*int[] ids = new int[]{R.drawable.h,R.drawable.he,R.drawable.li,R.drawable.be,R.drawable.b,
                R.drawable.c,R.drawable.n,R.drawable.o,R.drawable.f,R.drawable.ne,R.drawable.na,
                R.drawable.mg,R.drawable.al,R.drawable.si,R.drawable.p,R.drawable.s,R.drawable.cl,
                R.drawable.ar,R.drawable.k,R.drawable.ca,};*/



        int[] pic = new int[]{R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5};
        int[] ids2 = new int[]{R.id.H, R.id.He, R.id.Li, R.id.Be, R.id.B};
        int[] ids4 = new int[]{R.id.H2, R.id.He2, R.id.Li2, R.id.Be2, R.id.B2};


        for (int i=0; i<5;i++){
            if(v.getId() == ids2[i] | v.getId() == ids4[i]){
                img_view.setImageResource(pic[i]);
                img_view.setVisibility(View.VISIBLE);
            }
        }






/*
        switch (v.getId()){
            case R.id.r1:
                img_view.setImageResource(pic[2]);
                img_view.setVisibility(View.VISIBLE);
                break;
        }
*/
    }
}
