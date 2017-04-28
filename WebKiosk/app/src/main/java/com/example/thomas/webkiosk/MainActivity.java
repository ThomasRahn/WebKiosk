package com.example.thomas.webkiosk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView webv = (WebView) findViewById(R.id.webview);
        webv.loadUrl("http://www.example.com");
        webv.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webv.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed(){
        Toast.makeText(getApplicationContext(),"You Are Not Allowed to Exit the App", Toast.LENGTH_SHORT).show();
    }
}
