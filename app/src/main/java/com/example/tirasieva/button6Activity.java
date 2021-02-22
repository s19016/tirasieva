package com.example.tirasieva;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;
import com.squareup.picasso.Picasso;

public class button6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button6);
        PhotoView photoView = (PhotoView) findViewById(R.id.imageView6);


        ImageView image2 = findViewById(R.id.imageView6);

        Picasso.get()

                .load("https://n-naosan.com/wp-content/uploads/2021/02/6718100-dragon_ball_super_broly.jpg")
                .resize(700, 1020) //表示サイズ指定
                .centerCrop() //resizeで指定した範囲になるよう中央から切り出し
                .into(image2); //imageViewに流し込み
    }
}