package com.swdm.mp.minicalculator;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

/*
*Implement event Listener of buttons using "implements” interface on the Activity
*
* */
public class MainActivity extends AppCompatActivity implements OnClickListener {
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0;
    private Button plus,devide,clear,result,minus,multiply;
    private int num;
    private int op=0;
    private TextView screen;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(this);

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(this);

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(this);

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(this);

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(this);

        button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(this);

        plus = (Button) findViewById(R.id.plus);
        plus.setOnClickListener(this);

        devide = (Button) findViewById(R.id.devide);
        devide.setOnClickListener(this);

        minus = (Button) findViewById(R.id.minus);
        minus.setOnClickListener(this);

        multiply = (Button) findViewById(R.id.multiply);
        multiply.setOnClickListener(this);

        clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(this);

        result = (Button) findViewById(R.id.result);
        result.setOnClickListener(this);

        screen = (TextView) findViewById(R.id.screen);

    }
/*
* IN Landscape mode, Screen data initialize, So Use this function process
*
* */
    @Override
    public void onConfigurationChanged(Configuration newConfig){
        super.onConfigurationChanged(newConfig);

    }
/*
* Button process function
*예외처리는 그냥 발생하면 아무일도 없던것처럼 되게 했음
*
* */
           @Override

            public void onClick(View v) {

                // TODO Auto-generated method stub

               //Layout one section
                if(v==button1){
                    screen.setText(screen.getText().toString()+1);
                }

                else if(v==button2){
                    screen.setText(screen.getText().toString()+2);
                }

                else if(v==button3){
                    screen.setText(screen.getText().toString()+3);
                }

                else if(v==plus){

                    // 연산자만 눌렀을 때 예외 처리
                    // + 누르기 전까지의 값을 스트링으로 받아 정수만 추출
                    if(!(screen.getText().toString().equals(""))) {
                        num = Integer.valueOf(screen.getText().toString().trim());


                        screen.setText("");
                        op = 1;
                    }
                    else{



                    }

                }

                //Layout two section

                else if(v==button4){
                    screen.setText(screen.getText().toString() +4);
                }

                else if(v==button5){
                    screen.setText(screen.getText().toString()+5);
                }

                else if(v==button6){
                    screen.setText(screen.getText().toString()+6);
                }

                else if(v==minus){
                    // 연산자만 눌렀을 때 예외 처리
                    // - 누르기 전까지의 값을 스트링으로 받아 정수만 추출
                    if(!(screen.getText().toString().equals(""))) {
                        num = Integer.valueOf(screen.getText().toString().trim());


                        screen.setText("");
                        op = 2;
                    }
                    else{




                    }
                }

                //Layout three section

                else if(v==button7){
                    screen.setText(screen.getText().toString()+7);
                }

                else if(v==button8){
                    screen.setText(screen.getText().toString()+8);
                }

                else if(v==button9){
                    screen.setText(screen.getText().toString()+9);
                }

                else if(v==multiply){

                    // 연산자만 눌렀을 때 예외 처리
                    // * 누르기 전까지의 값을 스트링으로 받아 정수만 추출
                    if(!(screen.getText().toString().equals(""))) {
                        num = Integer.valueOf(screen.getText().toString().trim());


                        screen.setText("");
                        op = 3;
                    }
                    else{



                    }
                }


                //Layout four section
                else if(v==button0){
                    screen.setText(screen.getText().toString()+0);
                }

                else if(v==result){

                    // 연산자만 눌렀을 때 예외 처리
                    // + 누르기 전까지의 값을 스트링으로 받아 정수만 추출
                    if(!(screen.getText().toString().equals(""))) {


                        //계산 결과

                        //plus
                        if (op == 1) {
                            num = num + Integer.valueOf(screen.getText().toString().trim());
                            screen.setText(Integer.toString(num));
                        }

                        // minus
                        else if (op == 2) {

                            num = num - Integer.valueOf(screen.getText().toString().trim());
                            screen.setText(Integer.toString(num));

                        }
                        // multyply
                        else if (op == 3) {
                            num = num * Integer.valueOf(screen.getText().toString().trim());
                            screen.setText(Integer.toString(num));
                        }
                        // devision
                        else if (op == 4) {
                            if(Integer.valueOf(screen.getText().toString().trim())!=0){
                            num = num / Integer.valueOf(screen.getText().toString().trim());
                            screen.setText(Integer.toString(num));
                            }
                        }


                    }
                    else{

                    }

                }

                else if(v==clear){
                    //when click Clear the screen
                    screen.setText("");
                }

                else if(v==devide){
                    // 연산자만 눌렀을 때,0 입력됐을 때 예외 처리
                    // / 누르기 전까지의 값을 스트링으로 받아 정수만 추출
                    if(!(screen.getText().toString().equals(""))||Integer.valueOf(screen.getText().toString().trim())!=0) {

                        num = Integer.valueOf(screen.getText().toString().trim());


                        screen.setText("");
                        op = 4;
                    }
                    else{




                    }
                }
            }



        };

















