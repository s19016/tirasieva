package com.example.tirasieva;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.github.chrisbanes.photoview.PhotoView;
import com.squareup.picasso.Picasso;

public class button2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);
        PhotoView photoView = (PhotoView) findViewById(R.id.imageView2);


        ImageView image2 = findViewById(R.id.imageView2);

        Picasso.get()

                .load("https://n-naosan.com/wp-content/uploads/2021/02/%E3%81%A1%E3%82%89%E3%81%972-1-2.jpg")
                .resize(1526, 1103) //表示サイズ指定
                .centerCrop() //resizeで指定した範囲になるよう中央から切り出し
                .into(image2); //imageViewに流し込み
    }
}