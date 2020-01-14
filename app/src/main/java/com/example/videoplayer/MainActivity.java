package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView cricket=findViewById(R.id.cricket);
        cricket.setVideoPath("andriod.resource://" + getPackageName() + "/" + R.raw.birdsofprey);
        MediaController mediaController = new MediaController(this);
        cricket.setMediaController(mediaController);
        mediaController.setAnchorView(cricket);
        cricket.start();
    }
}
