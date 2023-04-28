package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    MediaController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //video
        final VideoView videoView = (VideoView) findViewById(R.id.videoView);

        //controller
        controller = new MediaController(this);
        controller.setAnchorView(videoView);
        controller.setMediaPlayer(videoView); //cac nut nhu play, foward, backward...
        videoView.setMediaController(controller);

        //set duong dan cua video
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video1);
        videoView.setVideoURI(uri);
        //start
        videoView.start();
    }
}