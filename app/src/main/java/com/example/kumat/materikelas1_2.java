package com.example.kumat;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class materikelas1_2 extends AppCompatActivity {
    VideoView mVideoView;
    MediaController mediaController;
    Button play;
    TextView tvDescripsi;
    TextView ttDescripsi;
    TextView tiDescripsi;
    TextView tuDescripsi;
    TextView taDescripsi;
    TextView tcDescripsi;
    TextView tbDescripsi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materikelas12);

        mVideoView = findViewById(R.id.mVideoView);
        ttDescripsi = (TextView) findViewById(R.id.textView3);
        tvDescripsi = (TextView) findViewById(R.id.textView14);
        tiDescripsi = (TextView) findViewById(R.id.textView16);
        tuDescripsi = (TextView) findViewById(R.id.textView17);
        taDescripsi = (TextView) findViewById(R.id.textView18);
        tcDescripsi = (TextView) findViewById(R.id.textView20);
        tbDescripsi = (TextView) findViewById(R.id.textView22);


        ttDescripsi.setText("Pengurangan adalah proses mengurangkan total dua bilangan a dan b " +
                "atau lebih dengan menggunakan tanda simbol (-)");
        tvDescripsi.setText("Novi memiliki 4 buah jeruk lalu jeruk tersebut diminta oleh ibunya satu buah," +
                "\n" +
                "Berapakah jeruk yang tersisa yang dimiliki Novi?" +
                "\n\n" +
                "Penyelesaian:");
        tiDescripsi.setText("Selesaikan pengurangan 4 - 6 dengan menggunakan garis bilangan?" +
                "\n\n" +
                "Penyelesaian:");
        tuDescripsi.setText("Langkah - langkah " +
                "\n\n" +
                "1. Buatlah garis bilangan" +
                "\n" +
                "2. Buat garis I : tarik garis dari angka 0 ke kanan sepanjang 4 satuan (4)" +
                "\n" +
                "3. Buat garis II: tarik garis ke kiri dan akhir garis I sepanjang 6 satuan (6)" +
                "\n" +
                "4. Buat garis III : tarik garis dari fari angka 0 hingga akhir garis II" +
                "\n" +
                "5. Hasil pengurangan di tunjukkan oleh garis III, 4 - 6 = (-2)  ");
        taDescripsi.setText("Selesaikan pengurangan 186 - 98 = ?, Dengan cara metode bersusun?" +
                "\n\n" +
                "Penyelesaian:");
        tcDescripsi.setText("Langkah - langkah" +
                "\n\n" +
                "1.Tulis angka yang di kurangkan secara berjejer, satuan sejajar dengan satuan, pulihan" +
                "sejajar dengan puluhan, dan seterusnya." +
                "\n" +
                "2. Lakukan pengurangan dari kanan (satuan) ke kiri." +
                "\n" +
                "3. Pengurangan satuan 6 - 8 hasilnya minus, sehingga perlu mengambil satu nilai puluhan pada angka 80, menjadi 70" +
                " Diperoleh (6 + 10)-8 = 16 - 8 = 8." +
                "\n" +
                "4. Pengurangan puluhan 70 - 90 hasilnay minus, sehingga perlu di ambil 1 nilai ratusan, " +
                "Ambil 1 ratusan pada angka 100, menjadi 0, sehingga (70 - 100 )-90 = 80" +
                "\n" +
                "5. Jadi 186 - 98 = 88." +
                "");
        tbDescripsi.setText("Berapakah hasil pengurangan dari 452 - 328 ?" +
                "\n\n" +
                "Penyelesaian:");


        mediaController = new MediaController(this);
        mVideoView = findViewById(R.id.mVideoView);
        play = findViewById(R.id.play1);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri localUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.novi2);
                mVideoView.start();
                mVideoView.setVideoURI(localUri);
                mediaController.setAnchorView(mVideoView);
                mVideoView.setMediaController(mediaController);


                ImageView lefticon = findViewById(R.id.lefticon);
                TextView title = findViewById(R.id.toolbartitle);

                lefticon.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(materikelas1_2.this, "You clicked in left ico", Toast.LENGTH_SHORT).show();
                    }
                });

            }
        });
    }

}