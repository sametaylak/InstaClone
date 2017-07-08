package com.gelecegiyazankadinlar.instaclone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SignUpActivity extends AppCompatActivity {

    private EditText username, email, password, confirmPassword;
    private Button signUpButton;
    private ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        username = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        confirmPassword = (EditText) findViewById(R.id.confirm_password);

        photo = (ImageView) findViewById(R.id.photo);
        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 07/07/2017 Galeriden fotoğraf seçilecek ve gelen uri global bir değişkene aktarılacak
                // Değişkende ki uri kayıt ol butonuna tıklandığı zaman upload edilecek
            }
        });

        signUpButton = (Button) findViewById(R.id.sign_up_button);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // TODO: 07/07/2017 Girilen parolaların uyuşmazlığı kontrol edildikten sonra
                // eğer sorun yok ise verilen bilgiler doğrultusunda kayıt işlemi yapılacak
                // Dikkat! Önce fotoğraf upload işlemini yapın upload tamamlandığı taktirde kayıtı gerçekleştirin
                // Kayıt işlemi tamamlandıktan sonra kullanıcı ekranına yönlendirilecek
            }
        });
    }
}
