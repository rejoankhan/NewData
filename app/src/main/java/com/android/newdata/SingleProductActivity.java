package com.android.newdata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Placeholder;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class SingleProductActivity extends AppCompatActivity {

    TextView singleHeadline, singlePrice,singleBrand, singleProductType,singleAboutProduct, singleOrigin;
    ImageView singleImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_product);

        singleHeadline = findViewById(R.id.singleHeadLine);
        singlePrice = findViewById(R.id.singlePrice);
        singleBrand = findViewById(R.id.singleBrand);
        singleProductType = findViewById(R.id.singleProductType);
        singleAboutProduct = findViewById(R.id.singleAboutProduct);
        singleOrigin = findViewById(R.id.singleOrigin);

        singleImage = findViewById(R.id.singleImage);

        Picasso.get().load(getIntent().getStringExtra("singleImage"))
                .placeholder(R.drawable.carrot2)
                .into(singleImage);


        singleHeadline.setText(getIntent().getStringExtra("singleHeadLine"));
        singlePrice.setText(getIntent().getStringExtra("singlePrice"));
        singleBrand.setText(getIntent().getStringExtra("singleBrand"));
        singleProductType.setText(getIntent().getStringExtra("singleProductType"));
        singleAboutProduct.setText(getIntent().getStringExtra("singleAboutProduct"));
        singleOrigin.setText(getIntent().getStringExtra("singleOrigin"));



    }
}