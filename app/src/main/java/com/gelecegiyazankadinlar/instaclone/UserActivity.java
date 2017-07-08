package com.gelecegiyazankadinlar.instaclone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class UserActivity extends AppCompatActivity {

    private RecyclerView recyclerPhotos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        recyclerPhotos = (RecyclerView) findViewById(R.id.recycler_photos);

        // TODO: 08/07/2017 RecyclerView'i hazırlamanız ve Firebase üzerinden verileri çekip
        // Adaptere göndermeniz gerekiyor. recyclerview için layout hazır @layout/item_photo
    }
}
