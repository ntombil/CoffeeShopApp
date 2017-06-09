package com.example.lisbeth.sophiecoffeeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*this method is used when order button is clicked*/
    public void submitOrder(View view ){
        display(1);
        displayPrice(2*5);
    }
    /*this method is used to display the given quantity value on the screen*/
    private void display(int number){
        TextView quantityTextView=(TextView)findViewById(R.id.textView2);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number){
        TextView priceTextView=(TextView)findViewById(R.id.textView4) ;
        priceTextView .setText(number )
    }
}
