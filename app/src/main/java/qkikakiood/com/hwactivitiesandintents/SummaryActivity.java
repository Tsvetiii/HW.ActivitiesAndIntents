package qkikakiood.com.hwactivitiesandintents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SummaryActivity extends AppCompatActivity {

    TextView txtInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        txtInfo = (TextView) findViewById(R.id.txt_info);
        txtInfo.setText(String.valueOf(MainActivity.edtName.getText().toString() + ", "
                + DetailActivity.edtYears.getText().toString() + "\n"
                + DetailActivity.edtAddress.getText().toString()
                + ", \nCity " + DetailActivity.edtCity.getText().toString()));

    }
}
