package com.imlhx.saolei_android;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.content.Intent;
import android.os.Environment;
import android.os.StrictMode;
import android.support.v7.app.AlertDialog;
import android.widget.EditText;
import android.widget.ImageButton;
import android.view.View;
import android.view.View.OnClickListener;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.view.MenuItem;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        ImageButton lbtn = (ImageButton) findViewById(R.id.buttonl);
        lbtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, game.class);
                Bundle bundle = new Bundle();
                bundle.putInt("h", 9);
                bundle.putInt("l", 9);
                bundle.putInt("lei", 10);
                bundle.putString("title", "扫雷-初级(9*9)");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        ImageButton mbtn=(ImageButton)findViewById(R.id.buttonm);
        mbtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, game.class);
                Bundle bundle = new Bundle();
                bundle.putInt("h", 16);
                bundle.putInt("l", 16);
                bundle.putInt("lei",40);
                bundle.putString("title", "扫雷-中级(16*16)");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        ImageButton hbtn = (ImageButton)findViewById(R.id.buttonh);
        hbtn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, game.class);
                Bundle bundle = new Bundle();
                bundle.putInt("h", 21);
                bundle.putInt("l", 16);
                bundle.putInt("lei",90);
                bundle.putString("title", "扫雷-高级(20*16)");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }

}
