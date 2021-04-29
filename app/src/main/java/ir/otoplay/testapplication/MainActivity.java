package ir.otoplay.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import ir.otoplay.keydetector.KeyDetector;

public class MainActivity extends AppCompatActivity implements KeyDetector.OnKeyDetectListener {
    KeyDetector keyDetector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        keyDetector =new KeyDetector(this);
        keyDetector.setOnKeyDetectListener(this);

    }

    @Override
    public void Detect(int key) {
        Log.i("ddddddd",key+"");
    }
}