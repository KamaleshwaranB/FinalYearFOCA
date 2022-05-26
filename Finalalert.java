package com.example.madminipoject;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
package com.example.madminipoject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class PERAMBUR extends AppCompatActivity {

    EditText number1;
    Button Add_button;
    TextView result;
    int ans=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_e_r_a_m_b_u_r);

        // by ID we can use each component which id is assign in xml file
        number1=(EditText) findViewById(R.id.editText_first_no);
        Add_button=(Button) findViewById(R.id.add_button);


        // Add_button add clicklistener
        Add_button.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                // num1 or num2 double type
                // get data which is in edittext, convert it to string
                // using parse Double convert it to Double type
                double num1 = Double.parseDouble(number1.getText().toString());
                // add both number and store it to sum
                if(num1 == 0000){
                    Toast.makeText(getApplicationContext(),"Ride peacefully , No accident ahead",Toast.LENGTH_SHORT).show();
                }else{
                    openActivityFour();
                }
            }
        });
    }
    public void openActivityFour() {
        Intent intent = new Intent(this, Alert.class);
        startActivity(intent);
    }

}