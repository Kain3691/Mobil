package ua.kpi.comsys.iv7103;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import java.sql.Time;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            //task 8
            TimeAB t1 = new TimeAB();
            TimeAB t2 = new TimeAB(13, 12, 11);;
            TimeAB t3 = new TimeAB(new Time(13, 12,12));

            //task 9
            //Note : format 1:12:11 PM is correct (I sent a message to you in Telegram about it)
            // You tell that I need remind you this thing when I will send a link for checking
            Log.i("toString", t2.toString()); //1:12:11 PM
            Log.i("sum", t1.sum(t2).toString()); // 1:12:11 PM
            Log.i("diff", t1.diff(t3).toString()); //10:47:48 AM
            Log.i("static sum", TimeAB.sum(t2, t3).toString()); // 2:24:23 AM
            Log.i("static diff", TimeAB.diff(t2, t3).toString()); //11:59:59 PM
            // task 10 : output is correct
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}