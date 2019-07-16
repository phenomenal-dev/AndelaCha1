package com.andela.andelacha1;

import android.app.ProgressDialog;
import android.net.http.SslError;
import android.os.Bundle;
import android.support.v4.widget.CircularProgressDrawable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AlcWeb extends AppCompatActivity {

    private WebView acweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alcweb);

        acweb = findViewById(R.id.webview);

        acweb.getSettings().setJavaScriptEnabled(true);
       acweb.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error){
                handler.proceed();

            }

        });

        acweb.loadUrl("https://andela.com/alc/");

    }
}
