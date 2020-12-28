package com.gavankennedy.week1lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText UsersName=null;
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        UsersName=findViewById(R.id.EditName);
    }

    public void DoName(View view) {

        String name=null;
         name=UsersName.getText().toString();
        Toast.makeText(this, "Hello" + name + "It's Pizza Time", Toast.LENGTH_SHORT).show();
       // if(player==null)
       // {
          //player=MediaPlayer.create(this,R.raw.PizzaTime);
       //}
       // player.start();
    }
   // public void Stop(View v)
    //{

    //}
}