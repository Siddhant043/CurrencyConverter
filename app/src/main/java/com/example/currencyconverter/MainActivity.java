package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

//import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view){
        Log.i("Info", "It works!");
        EditText dollarAmt = (EditText) findViewById(R.id.dollarValue);
        Boolean numeric = true;
        try{
            double dollarAmtInDouble = Double.parseDouble(dollarAmt.getText().toString());
        }catch(NumberFormatException e){
            numeric = false;
        }

        if(numeric){
            double dollarAmtInDouble = Double.parseDouble(dollarAmt.getText().toString());
            double tempValue = dollarAmtInDouble * 72.96;
//        DecimalFormat df = new DecimalFormat("#.##");
//        double rupeesAmtInDouble = Double.valueOf(df.format(tempValue));
            String rupeesAmtInDouble = String.format("%.2f", tempValue);
            Log.i("Values", "Rs. " + rupeesAmtInDouble);
            Toast.makeText(this, "Rs. " + rupeesAmtInDouble, Toast.LENGTH_LONG).show();
        }else {
            Log.i("text", "Wrong Value entered.");
            Toast.makeText(this, "Wrong Value Entered", Toast.LENGTH_LONG).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}