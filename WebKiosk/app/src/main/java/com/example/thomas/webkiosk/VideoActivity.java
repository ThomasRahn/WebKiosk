package com.example.thomas.webkiosk;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {

    VideoView vv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);


        vv = (VideoView) findViewById(R.id.videoview);

        Intent intent = getIntent();
        String value = intent.getStringExtra("key");


        vv.setVideoPath("rtsp://mpv.cdn3.bigCDN.com:554/bigCDN/_definst_/mp4:bigbuckbunnyiphone_400.mp4");
        //mVideoView.setVideoURI(Uri.parse(path), options);
        vv.setMediaController(new MediaController(this));
        vv.requestFocus();

        Toast.makeText(getApplicationContext(),value, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();

        ActivityManager activityManager = (ActivityManager) getApplicationContext()
                .getSystemService(Context.ACTIVITY_SERVICE);

        activityManager.moveTaskToFront(getTaskId(), 0);
    }
}
