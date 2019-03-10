package com.example.rishabh.parking;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static android.R.attr.button;
import static android.R.attr.fingerprintAuthDrawable;
import static android.R.attr.onClick;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;
import static com.example.rishabh.parking.R.id.info1;

public class MainActivity extends AppCompatActivity {



      TextView avai,fac,hand;
        int a=8,f=2,h=1,t=8;
     TextView p[];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        p=new TextView[9];
        avai=(TextView)findViewById(R.id.info1);
        fac=(TextView)findViewById(R.id.info2);
        hand=(TextView)findViewById(R.id.info3);
        p[1]=(TextView) findViewById(R.id.textView3);
        p[2]=(TextView) findViewById(R.id.textView4);
        p[3]=(TextView) findViewById(R.id.textView5);
        p[4]=(TextView)findViewById(R.id.textView6);
        p[5]=(TextView)findViewById(R.id.textView7);
        p[6]=(TextView) findViewById(R.id.textView8);
        p[7]=(TextView) findViewById(R.id.textView9);
        p[8]=(TextView) findViewById(R.id.textView10);
        avai.setText(Integer.toString(a));
        fac.setText(Integer.toString(f));
        hand.setText(Integer.toString(h));




    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void setAvailable(View v)
    {
        for(int i=1;i<=t;i++)
        {
            p[i].setBackgroundColor(Color.GREEN);
        }



    }
    

    

    public void setBooked(View v)
    {
        p[t].setBackgroundColor(Color.RED);
        t--;
    }


}
