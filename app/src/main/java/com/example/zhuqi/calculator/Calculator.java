package com.example.zhuqi.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Selection;
import android.text.Spannable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity{

//    private Button button_0;

    private TextView text;
    int flag = 0;
    double prenum ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        text = (TextView)this.findViewById(R.id.editText);


        //0
        this.findViewById(R.id.button_0).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s ;
                s = text.getText()+"0";
                text.setText(s);
                Spannable spanText = (Spannable)text.getText();
                Selection.setSelection(spanText, text.length());
            }
        });

        //1
        this.findViewById(R.id.button_1).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s ;
                s = text.getText()+"1";
                text.setText(s);
                Spannable spanText = (Spannable)text.getText();
                Selection.setSelection(spanText, text.length());
            }
        });

        //2
        this.findViewById(R.id.button_2).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s ;
                s = text.getText()+"2";
                text.setText(s);
                Spannable spanText = (Spannable)text.getText();
                Selection.setSelection(spanText, text.length());
            }
        });

        //3
        this.findViewById(R.id.button_3).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s ;
                s = text.getText()+"3";
                text.setText(s);
                Spannable spanText = (Spannable)text.getText();
                Selection.setSelection(spanText, text.length());
            }
        });

        //4
        this.findViewById(R.id.button_4).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s ;
                s = text.getText()+"4";
                text.setText(s);
                Spannable spanText = (Spannable)text.getText();
                Selection.setSelection(spanText, text.length());
            }
        });

        //5
        this.findViewById(R.id.button_5).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s ;
                s = text.getText()+"5";
                text.setText(s);
                Spannable spanText = (Spannable)text.getText();
                Selection.setSelection(spanText, text.length());
            }
        });

        //6
        this.findViewById(R.id.button_6).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s ;
                s = text.getText()+"6";
                text.setText(s);
                Spannable spanText = (Spannable)text.getText();
                Selection.setSelection(spanText, text.length());
            }
        });

        //7
        this.findViewById(R.id.button_7).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s ;
                s = text.getText()+"7";
                text.setText(s);
                Spannable spanText = (Spannable)text.getText();
                Selection.setSelection(spanText, text.length());
            }
        });

        //8
        this.findViewById(R.id.button_8).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s ;
                s = text.getText()+"8";
                text.setText(s);
                Spannable spanText = (Spannable)text.getText();
                Selection.setSelection(spanText, text.length());
            }
        });

        //9
        this.findViewById(R.id.button_9).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                String s ;
                s = text.getText()+"9";
                text.setText(s);
                Spannable spanText = (Spannable)text.getText();
                Selection.setSelection(spanText, text.length());
            }
        });

        //  .
        this.findViewById(R.id.button_point).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(!text.getText().toString().contains(".")){
                    String s;
                    s = text.getText()+".";
                    text.setText(s);
                    Spannable spanText = (Spannable)text.getText();
                    Selection.setSelection(spanText, text.length());
                }
            }
        });

        //  +
        this.findViewById(R.id.button_plus).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(text.getText().toString().isEmpty()){
                    Toast.makeText(Calculator.this,"Please enter number",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(flag == 0){
                    flag = 1;
                    prenum = Double.parseDouble(text.getText().toString());
                    text.setText("");
                }
                else{
                    switch (flag){
                        case 1:{
                            prenum += Double.parseDouble(text.getText().toString());
                            break;
                        }
                        case 2:{
                            prenum -= Double.parseDouble(text.getText().toString());
                            break;
                        }
                        case 3:{
                            prenum *= Double.parseDouble(text.getText().toString());
                            break;
                        }
                        case 4:{
                            if( Double.parseDouble(text.getText().toString()) != 0){
                                prenum /= Double.parseDouble(text.getText().toString());
                            }
                            else{
                                Toast.makeText(Calculator.this,"Cannot divide by zero",Toast.LENGTH_SHORT).show();
                                return;
                            }
                            break;
                        }
                        default:return;
                    }
                    flag = 1;
                    text.setText("");
                }
            }
        });

        //  -
        this.findViewById(R.id.button_minus).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(text.getText().toString().isEmpty()){
                    Toast.makeText(Calculator.this,"Please enter number",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(flag == 0){
                    flag = 2;
                    prenum = Double.parseDouble(text.getText().toString());
                    text.setText("");
                }
                else{
                    switch (flag){
                        case 1:{
                            prenum += Double.parseDouble(text.getText().toString());
                            break;
                        }
                        case 2:{
                            prenum -= Double.parseDouble(text.getText().toString());
                            break;
                        }
                        case 3:{
                            prenum *= Double.parseDouble(text.getText().toString());
                            break;
                        }
                        case 4:{
                            if( Double.parseDouble(text.getText().toString()) != 0){
                                prenum /= Double.parseDouble(text.getText().toString());
                            }
                            else{
                                Toast.makeText(Calculator.this,"Cannot divide by zero",Toast.LENGTH_SHORT).show();
                                return;
                            }
                            break;
                        }
                        default:return;
                    }
                    flag = 2;
                    text.setText("");
                }
            }
        });

        //  *
        this.findViewById(R.id.button_multiple).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(text.getText().toString().isEmpty()){
                    Toast.makeText(Calculator.this,"Please enter number",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(flag == 0){
                    flag = 3;
                    prenum = Double.parseDouble(text.getText().toString());
                    text.setText("");
                }
                else{
                    switch (flag){
                        case 1:{
                            prenum += Double.parseDouble(text.getText().toString());
                            break;
                        }
                        case 2:{
                            prenum -= Double.parseDouble(text.getText().toString());
                            break;
                        }
                        case 3:{
                            prenum *= Double.parseDouble(text.getText().toString());
                            break;
                        }
                        case 4:{
                            if( Double.parseDouble(text.getText().toString()) != 0){
                                prenum /= Double.parseDouble(text.getText().toString());
                            }
                            else{
                                Toast.makeText(Calculator.this,"Cannot divide by zero",Toast.LENGTH_SHORT).show();
                                return;
                            }
                            break;
                        }
                        default:return;
                    }
                    flag = 3;
                    text.setText("");
                }
            }
        });

        //  /
        this.findViewById(R.id.button_divide).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(text.getText().toString().isEmpty()){
                    Toast.makeText(Calculator.this,"Please enter number",Toast.LENGTH_SHORT).show();
                    return;
                }
                if(flag == 0){
                    flag = 4;
                    prenum = Double.parseDouble(text.getText().toString());
                    text.setText("");
                }
                else{
                    switch (flag){
                        case 1:{
                            prenum += Double.parseDouble(text.getText().toString());
                            break;
                        }
                        case 2:{
                            prenum -= Double.parseDouble(text.getText().toString());
                            break;
                        }
                        case 3:{
                            prenum *= Double.parseDouble(text.getText().toString());
                            break;
                        }
                        case 4:{
                            if( Double.parseDouble(text.getText().toString()) != 0){
                                prenum /= Double.parseDouble(text.getText().toString());
                            }
                            else{
                                Toast.makeText(Calculator.this,"Cannot divide by zero",Toast.LENGTH_SHORT).show();
                                return;
                            }
                            break;
                        }
                        default:return;
                    }
                    flag = 4;
                    text.setText("");
                }
            }
        });

        //  =
        this.findViewById(R.id.button_equal).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                if(text.getText().toString().isEmpty()){
                    Toast.makeText(Calculator.this,"Please enter number",Toast.LENGTH_SHORT).show();
                    return;
                }
                switch (flag){
                    case 1:{
                        prenum += Double.parseDouble(text.getText().toString());
//                        float now = Float.parseFloat(prenum) + Float.parseFloat(text.getText().toString());
//                        text.setText(String.valueOf(now));
                        break;
                    }
                    case 2:{
                        prenum -= Double.parseDouble(text.getText().toString());
//                        float now = Float.parseFloat(prenum) - Float.parseFloat(text.getText().toString());
//                        text.setText(String.valueOf(now));
                        break;
                    }
                    case 3:{
                        prenum *= Double.parseDouble(text.getText().toString());
//                        float now = Float.parseFloat(prenum) * Float.parseFloat(text.getText().toString());
//                        text.setText(String.valueOf(now));
                        break;
                    }
                    case 4:{
                        if( Double.parseDouble(text.getText().toString()) != 0){
                            prenum /= Double.parseDouble(text.getText().toString());
//                            float now = Float.parseFloat(prenum) / Float.parseFloat(text.getText().toString());
//                            text.setText(String.valueOf(now));
                        }
                        else{
                            Toast.makeText(Calculator.this,"Cannot divide by zero",Toast.LENGTH_SHORT).show();
                            return;
                        }
                        break;
                    }
                    default:return;
                }
                text.setText(String.valueOf(prenum));
                Spannable spanText = (Spannable)text.getText();
                Selection.setSelection(spanText, text.length());
                flag = 0;
                prenum = 0;
            }
        });

        //  del
        this.findViewById(R.id.button_delete).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                //delete
                String s = text.getText().toString();
                if(s.length()!=0){
                    s = s.substring(0,s.length()-1);
                    text.setText(s);
                    Spannable spanText = (Spannable)text.getText();
                    Selection.setSelection(spanText, text.length());
                }
            }
        });

        //  C
        this.findViewById(R.id.button_clear).setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                //C
                prenum = 0;
                text.setText("");
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_calculator, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
