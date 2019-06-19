package com.example.newjugiyul;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;



import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Random;

import android.graphics.Color;
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




public class MainActivity extends AppCompatActivity {

    private EditText edit1;
    private ImageView imageView1;
    private TextView tv1, text2, textView;
    private Button button, button_home, btn2;
    private ImageView img;



    int[] ids = new int[]{R.drawable.h,R.drawable.he,R.drawable.li,R.drawable.be,R.drawable.b,
            R.drawable.c,R.drawable.n,R.drawable.o,R.drawable.f,R.drawable.ne,R.drawable.na,
            R.drawable.mg,R.drawable.al,R.drawable.si,R.drawable.p,R.drawable.s,R.drawable.cl,
            R.drawable.ar,R.drawable.k,R.drawable.ca};

    String [] answer = {"수소","헬륨","리튬","베릴륨","붕소","탄소","질소","산소","플루오린","네온","나트륨"
            ,"마그네슘","알루미늄","규소","인","황","염소","아르곤","칼륨","칼슘"};

    int rnd2[] = new int[21];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR);

        setTitle("초등학생을 위한 주기율표");

        img = (ImageView) findViewById(R.id.jugi2);
        button_home = (Button) findViewById(R.id.btn11);

        button_home.setOnClickListener(new View.OnClickListener() {
            int count = 1;
            @Override
            public void onClick(View v) {
                if (count%2 != 0 ) {
                    img.setImageResource(R.drawable.jugi4);
                }
                else {
                    img.setImageResource(R.drawable.jugi2);
                }
                count +=1;
            }
        });


        imageView1 = (ImageView) findViewById(R.id.imageView1);
        final Button btn = (Button) findViewById( R.id.button1 );
        final TextView tv1 = (TextView) findViewById( R.id.textView2 );
        final Button button = (Button) findViewById(R.id.btn1);
        final EditText editText = (EditText)findViewById(R.id.ed1);
        final TextView tv2 = (TextView) findViewById(R.id.textView);
        final Button btn2 = (Button) findViewById(R.id.btn2);
        final TextView text2 = (TextView) findViewById(R.id.text2);



        button.setVisibility(View.VISIBLE);
        tv2.setVisibility(View.GONE);
        imageView1.setVisibility(View.GONE);
        editText.setVisibility(View.GONE);
        btn.setVisibility(View.GONE);
        btn2.setVisibility(View.GONE);
        text2.setVisibility(View.GONE);

        Random rnd = new Random();

        for (int i=0;i<20;i++) {
            rnd2[i] = rnd.nextInt(20);
            for (int j=0;j<i;j++){
                if(rnd2[i]==rnd2[j]){
                    i--;
                }
            }
        }

        imageView1.setImageResource(ids[rnd2[0]]);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button.setVisibility(View.GONE);
                tv2.setVisibility(View.VISIBLE);
                imageView1.setVisibility(View.VISIBLE);
                editText.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);
            }
        });

        btn.setOnClickListener( new View.OnClickListener() {
            int count = 0, count2 = 0;



            @Override
            public void onClick(View v) {
                imageView1.setImageResource(ids[rnd2[count2+1]]);
                String st1 = editText.getText().toString();
                edit1 = (EditText) findViewById( R.id.ed1 );

                if (st1.equals( answer[rnd2[count2]] )) {
                    count +=1;
                }

                edit1.setText( "" );
                tv1.setText("현재까지 점수 : "+ count);
                count2 += 1;

                if (count2 == 20) {
                    button.setVisibility(View.GONE);text2.setVisibility(View.VISIBLE);
                    imageView1.setVisibility(View.GONE);
                    editText.setVisibility(View.GONE);
                    btn.setVisibility(View.GONE);
                    tv2.setVisibility(View.GONE);
                    btn2.setVisibility(View.VISIBLE);
                    tv1.setText("최종 점수 : "+ count + "/20 입니다");
                    tv1.setTextSize(30);
                }
            }
        } );


        btn2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                button.setVisibility(View.GONE);
                tv2.setVisibility(View.VISIBLE);
                imageView1.setVisibility(View.VISIBLE);
                editText.setVisibility(View.VISIBLE);
                btn.setVisibility(View.VISIBLE);



            }
        });




        final int[] pic = new int[]{R.drawable.a1, R.drawable.a2, R.drawable.a3, R.drawable.a4, R.drawable.a5, R.drawable.a6, R.drawable.a7, R.drawable.a8, R.drawable.a9, R.drawable.a10,R.drawable.a11,R.drawable.a12,R.drawable.a13,R.drawable.a14,R.drawable.a15,R.drawable.a16,R.drawable.a17,R.drawable.a18,R.drawable.a19,R.drawable.a20,R.drawable.a20};

        final ScrollView sv = (ScrollView)findViewById(R.id.second_bar);
        final LinearLayout li_quiz = (LinearLayout)findViewById(R.id.liquiz);
        final ImageView img_view = (ImageView) findViewById(R.id.img1);
        final TableLayout tableLayout = (TableLayout) findViewById(R.id.table); // 테이블 id 명
        final String[] atom = new String[]{"H", "He", "Li", "Be", "B", "C", "N", "O", "F", "Ne", "Na", "Mg", "Al", "Si", "P", "S", "Cl", "Ar", "K", "Ca"," "};
        final String[] atom_detail = new String[]{"지구상에 존재하는 가장 가벼운 원소로 무색·무미·무취의 기체", "단원자 기체로 반응성이 거의 없어 비활성 기체라고도 하며 무색무취로 지구 대기상에는 매우 미량으로 존재한다.", "은백색 연질금속이지만 나트륨보다 단단하며 고체인 홑원소물질 중에서 가장 가볍다. 불꽃반응에서 빨간색을 나타낸다.", "가볍고 단단하며, 경금속 중에서는 녹는점이 가장 높다.", "붕소는 원자번호 5번의 원소로 원소기호는 B이다. 주기율표에서 13족에 속하는 갈색-검정색 준금속 원소", "동소체로 비결정성 탄소, 결정성인 흑연, 다이아몬드가 있다. 수소, 산소 또는 질소 등과 공유결합을 안정적으로 쉽게 형성할 수 있어 생체분자의 기본요소로 사용", "비금속 원소로 지구의 대기의 약 78% 정도를 차지하고 있으며 지구 생명체의 구성 성분이다.", "질량으로 지각에서 가장 풍부한 화학원소이며 우주에서 수소와 헬륨 다음 세 번째로 많은 원소", "원소들 중에서 전기음성도와 반응성이 가장 커서 거의 모든 원소와 반응하여 화합물을 만든다.", "단원자 분자 기체로 반응성이 거의 없어 비활성 기체라고도 하며 색깔과 냄새가 없고 공기 중에 적은 양이 존재한다.", "칼로 자를 수 있을 정도로 무르고, 은백색이며, 반응성이 아주 크다.", "주기율표의 2족에 속하는 은백색의 가벼운 금속이다.", "은백색의 가볍고 무른 금속으로 지구의 지각을 이루는 주 구성 원소 중 하나이다. 가볍고 내구성이 큰 특성을 이용해 원자재 및 재료로 많이 사용된다.", "암석권의 주요 구성성분으로 지각 내의 존재량은 산소에 이어 제2위로 많아 27.6%를 차지한다.", "자연상태에서 홑원소 상태로는 존재하지 않으며, 여러 개의 동소체 흰색, 붉은색, 검은색 인이 존재한다.", "상온에서 주로노란색의 고체이며 연소할 때 푸른색 불꽃을 내면서 매우 강하고 지독한 냄새가 나는 이산화황(SO2)을 생성하며 많은 동소체와 동위원소가 존재한다.", "전기음성도가 플루오린, 산소 다음으로 크고 자극적인 냄새가 나는 녹황색 기체이다. 염소분자(Cl2)는 강력한 산화제이며 표백제로 쓰인다.", "단원자 분자 기체로 반응성이 거의 없어 비활성 기체라고도 하며  공기 중에 0.94% 존재해 비활성기체 중에서 가장 많이 존재한다.", "무르며 녹는점이 낮고, 화학 반응성이 아주 큰 은백색 고체 금속이다.", "칼슘은 무르고 은회색을 띠며, 다른 알칼리 토금속들과 마찬가지로 반응성이 커서 자연상태에서 원소 그 자체로는 존재하지 않고 화합물로만 존재한다."," "};


        for (int i = 0; i < 21; i++) {
// Creation row
            final TableRow tableRow = new TableRow(this);

            tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.MATCH_PARENT));


            for(int j = 0 ; j < 2 ; j++){
                final Button table_btn = new Button(this);

                if (j == 0){
                    table_btn.setText(atom[i]);
                    table_btn.setTextSize(30);

                }
                else{
                    table_btn.setText(atom_detail[i]);
                }

                table_btn.setBackgroundColor(Color.rgb(255-i*11,255-i*11,255));

                table_btn.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT));
                table_btn.setWidth(60);
                table_btn.setHeight(200);



                tableRow.addView(table_btn);

                final int i2 = i;
                table_btn.setOnClickListener(new Button.OnClickListener(){
                    public void onClick(View v){
                        img_view.setVisibility(View.VISIBLE);
                        img_view.setImageResource(pic[i2]);

                        img_view.setOnClickListener(new View.OnClickListener(){
                            public void onClick(View v){
                                img_view.setVisibility(View.GONE);
                            }
                        });

                    }

                });



            }

            tableLayout.addView(tableRow);
        }


        BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.navigation_home:
                        sv.setVisibility(View.GONE);
                        li_quiz.setVisibility(View.GONE);
                        img.setVisibility(View.VISIBLE);
                        button_home.setVisibility(View.VISIBLE);


                        return true;
                    case R.id.navigation_dashboard:
                        sv.setVisibility(View.VISIBLE);
                        li_quiz.setVisibility(View.GONE);
                        img.setVisibility(View.GONE);
                        button_home.setVisibility(View.GONE);
                        return true;
                    case R.id.navigation_notifications:
                        sv.setVisibility(View.GONE);
                        li_quiz.setVisibility(View.VISIBLE);
                        img.setVisibility(View.GONE);
                        button_home.setVisibility(View.GONE);
                        return true;
                }
                return false;
            }
        };

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
