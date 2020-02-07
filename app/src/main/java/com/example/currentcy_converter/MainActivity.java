package com.example.currentcy_converter;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import java.text.DecimalFormat;
public class MainActivity extends AppCompatActivity {
    public void clickFunction (View view){
        //Log.i("Info", "Nuclear Missle Launched");
        EditText Dollar  = (EditText) findViewById(R.id.Dollar);
        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        String str  = Dollar.getText().toString();

        //System.out.print("xxxxxxx"+str);
        goToActivity2(str);
    }

    public void goToActivity2(String s){
        Double flt = Integer.parseInt(s)*0.77;
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        String pnd = "£" + numberFormat.format(flt);
        //String pnd = "£" + Double.toString(flt);
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("m", pnd);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}