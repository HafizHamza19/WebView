package com.hafizhamza.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    webView=(WebView)findViewById(R.id.webview);
    webView.getSettings().setJavaScriptEnabled(true);
    webView.setWebViewClient(new WebViewClient());
    ////Load Web through link
    webView.loadUrl("https://hhidea.blogspot.com");
        //Run Html Code
   // webView.loadData("<html><body><h1>Hello World</h1><p>Wellcome to my Web</p></body></html>","text/html","UTF-8");
    }
}
