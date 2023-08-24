package com.example.design;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int items = item.getItemId();
        if(items == R.id.action_login){
            Toast.makeText(this, "Login attempted", Toast.LENGTH_SHORT).show();
        }
        else if(items == R.id.action_logout)
            Toast.makeText(this, "Logged Out Succesfully", Toast.LENGTH_SHORT).show();
        return super.onOptionsItemSelected(item);
    }

}