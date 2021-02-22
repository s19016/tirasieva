
package com.example.tirasieva;


import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;


import com.github.chrisbanes.photoview.PhotoView;
import com.squareup.picasso.Picasso;



public class buttonActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);

        PhotoView photoView = (PhotoView) findViewById(R.id.imageView1);


        ImageView image = findViewById(R.id.imageView1);

        Picasso.get()

                .load("https://n-naosan.com/wp-content/uploads/2021/02/conan2-1.jpg")
                        .resize(700, 1020) //表示サイズ指定
                        .centerCrop() //resizeで指定した範囲になるよう中央から切り出し
                        .into(image); //imageViewに流し込み
    }

}