package com.example.kumat;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    VideoView mVideoView3;
    TextView aaDeskripsi;
    TextView bbDeskripsi;
    TextView ccDeskripsi;
    TextView ddDeskripsi;
    TextView eeDeskripsi;
    TextView ffDeskripsi;
    TextView ggDeskripsi;
    MediaController mediaController;
    Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mVideoView3 = findViewById(R.id.mVideoView3);
        aaDeskripsi=(TextView) findViewById(R.id.textView12);
        aaDeskripsi.setText("a.Mempunyai dua pasang sisi berhadapan,setiap pasangnya sejajar dan sama panjang\n"+"b.Diagonal-diagonalnya sama panjang dan berpotongan saling membagi dua sama panjang\n"+
                "c.Sudut-sudutnya sama besar");

        bbDeskripsi=(TextView) findViewById(R.id.textView13);
        bbDeskripsi.setText("a.Sisi-sisi yang berhadapan mempunyai panjang yang sama\n"+"b.Kedua diagonalnya sama panjang dan berpotongan untuk saling membagi dua sama panjang.");

        ccDeskripsi=(TextView) findViewById(R.id.textView14);
        ccDeskripsi.setText("a.Terdiri dari 3 sisi garis lurus\n"+"b.Terdiri dari 3 titik disetiap sudutnya dengan total 180 derajat.");

        ddDeskripsi=(TextView) findViewById(R.id.textView15);
        ddDeskripsi.setText("a.Berbentuk segi empat\n"+"b.Sisi-sisi yang berhadapan sama besar\n"+"c.Diagonal-diagonalnya berpotongan untuk saling membagi dua sama panjang.");

        eeDeskripsi=(TextView) findViewById(R.id.textView16);
        eeDeskripsi.setText("a.Sudut yang berbentuk 180 derajat saling berdekatan yang terdapat diantara dua buah sisi(sejajar)\n"+"b.Sudut yang terbentuk sama besarnya\n"+"c.Ukuran diagonal sama panjang, kakinya juga memiliki ukuran yang sama panjang ");

        ffDeskripsi=(TextView) findViewById(R.id.textView17);
        ffDeskripsi.setText("a.Sumbu simetri tak terhingga dan simetri putar\n"+"b.Bentuknya bulat\n"+"c.Jika nilai diameter atau jari-jarinya Kelipatan 7 maka digunakan phi dengan nilai 22/7 agar lebih mudah menyelesaikan soal. Kebalikannya jika nilainya bukan kelipatan 7 gunakan phi dengan nilai 3,14");

        ffDeskripsi=(TextView) findViewById(R.id.textView18);
        ffDeskripsi.setText("a.Memiliki panjang sisi yang sama sebanyak 2 buah\n"+"b.Memiliki diagonal yang berpotongan sebanyak 2 buah(tegak lurus)\n"+"c.Memiliki sumbu simetri 1 buah\n"+"d.Memiliki simetri putar 1 buah.");

        ggDeskripsi=(TextView) findViewById(R.id.textView19);
        ggDeskripsi.setText("a.Mempunyai 4 sisi dengan panjang yang sama\n"+"b.Mempunyai 4 sudut dengan besar yang sama\n"+"c.Kedua diagonalnya tegak lurus berpotongan untuk membagi 2 sama panjang dan membagi 2 sudut yang berhadapan 2 sama besar.");

        mediaController = new MediaController(this);
        mVideoView3 = findViewById(R.id.mVideoView);
        play = findViewById(R.id.play3);

        mediaController.setAnchorView(mVideoView3);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Uri localUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.bangun_ruang);
                mVideoView3.start();
                mVideoView3.setVideoURI(localUri);
                mVideoView3.setMediaController(mediaController);
            }
        });
    }
}
