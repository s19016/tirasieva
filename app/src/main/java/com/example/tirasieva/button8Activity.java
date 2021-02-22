package com.example.tirasieva;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;
import com.squareup.picasso.Picasso;

public class button8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button8);
        PhotoView photoView = (PhotoView) findViewById(R.id.imageView8);


        ImageView image2 = findViewById(R.id.imageView8);

        Picasso.get()

                .load("https://n-naosan.com/wp-content/uploads/2021/02/kami1-1.jpg")
                .resize(700, 1020) //表示サイズ指定
                .centerCrop() //resizeで指定した範囲になるよう中央から切り出し
                .into(image2); //imageViewに流し込み
    }
}