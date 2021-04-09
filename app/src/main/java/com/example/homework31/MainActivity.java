package com.example.homework31;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


   @Override
    public void onBackPressed(){

       AlertDialog.Builder builder = new AlertDialog.Builder(this);

       builder.setMessage("вы уверенны что хотите выйти?");
              builder.setCancelable(false)
              .setPositiveButton("Да", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialog, int which) {
                      MainActivity.super.onBackPressed();
                  }
              });

              builder.setNegativeButton("Нет", new DialogInterface.OnClickListener() {
                  @Override
                  public void onClick(DialogInterface dialog, int which) {


                      dialog.cancel();
                  }
              });
              AlertDialog alertDialog = builder.create();
              alertDialog.show();




    }
}