package com.example.android.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitOrder(View view) {
        String priceMessage = "Total: $" + quantity * 5;
        priceMessage = priceMessage + "\nThank you!";
        displayMessage(priceMessage);
    }

    private void displayMessage(String message) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);
    }

    public void decrement(View view) {
        if (quantity > 0) {
            quantity = quantity - 1;
            display(quantity);
        }
    }

    private void displayPrice(int number) {
        TextView priceTextView = findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    private void display(int number) {
        TextView quantityTextView = findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

}
