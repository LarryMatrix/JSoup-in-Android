package tz.co.matrixhub.jsoup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.jsoup.parser.Parser;

public class MainActivity extends AppCompatActivity {

    static Parser parser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
