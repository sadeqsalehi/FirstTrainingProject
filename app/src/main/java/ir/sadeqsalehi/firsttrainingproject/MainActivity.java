package ir.sadeqsalehi.firsttrainingproject;

import android.graphics.Color;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button btn_Show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.editText);
        btn_Show = findViewById(R.id.btn_Show);
        btn_Show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);
                String date = String.format("%d/%02d/%02d", year, month, day);
                textView.setText(date);
                Random random = new Random();
                int r=random.nextInt(256);
                int g =random.nextInt(256);
                int b =random.nextInt(256);
                //textView.setBackgroundColor(Color.rgb(r,g,b));
                textView.setTextColor(Color.rgb(r,g,b));
                //textView.setTextColor(Color.parseColor("#008577"));
                // textView.setTextSize(11);
                //textView.setVisibility(View.INVISIBLE);

            }
        });
       btn_Show.setOnLongClickListener(new View.OnLongClickListener() {
           @Override
           public boolean onLongClick(View v) {
               Random random = new Random();
               int r=random.nextInt(256);
               int g =random.nextInt(256);
               int b =random.nextInt(256);
               textView.setBackgroundColor(Color.rgb(r,g,b));
               return true;
           }
       });

    }
}

