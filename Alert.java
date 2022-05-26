package com.example.madminipoject;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class alert extends AppCompatActivity {
 private Button button;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_bill);
 button = (Button) findViewById(R.id.button6);
 button.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 openActivity2();
 }
 });
 }
 public void openActivity2() {
 Intent intent = new Intent(this, Finalalert.class);
 startActivity(intent);
 }
}

