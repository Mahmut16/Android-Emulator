package com.mahmutsaglam.androidemulator;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.info_text);
        textView.setText("Device Model: " + EmulatorUtils.getDeviceModel() + 
                         "\nNative Message: " + EmulatorUtils.getNativeMessage());
    }
}
