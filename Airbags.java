package com.example.madminipoject;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class Airbags extends AppCompatActivity {
 private Button button2;
 private Button button3;
 private Button button4;
 private Button button5;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_routes);
 button2 = (Button) findViewById(R.id.button2);
 button2.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 openActivity2();
 }
 });
 button3 = (Button) findViewById(R.id.button3);
 button3.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 openActivity3();
 }
 });
 button4 = (Button) findViewById(R.id.button4);
 button4.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 openActivity4();
 }
 });
 button5= (Button) findViewById(R.id.button5);
 button5.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View v) {
 openActivity5();
 }
 });
 }
 public void openActivity2() {
 Intent intent = new Intent(this, twoAirbags.class);
 startActivity(intent);
 }
 public void openActivity3() {
 Intent intent = new Intent(this, fourAirbags.class);
 startActivity(intent);
 }
 public void openActivity4() {
 Intent intent = new Intent(this, sixAirbags.class);
 startActivity(intent);
 }
 public void openActivity5() {
 Intent intent = new Intent(this, eightAirbags.class);
 startActivity(intent);
 }
}

