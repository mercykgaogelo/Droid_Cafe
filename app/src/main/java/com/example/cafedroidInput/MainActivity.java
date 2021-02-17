package com.example.cafedroidInput;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static  final String EXTRA_MESSAGE = "com.example.cafedroidInput.EXTRA_MESSAGE";

    private String mOrderMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              //  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
              //          .setAction("Action", null).show();
                Intent intent = new Intent(MainActivity.this, orderActivity.class);
                intent.putExtra(MainActivity.EXTRA_MESSAGE,mOrderMessage);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
     //   int id = item.getItemId();
        //noinspection SimplifiableIfStatement

     //   if (id == R.id.action_order) {
          //  String stringMessage = (R.string.action_order_message);
         //   displayToast(stringMessage);

    //        return true;
      //  }
        switch (item.getItemId()){
            case R.id.action_order:
              //  displayToast(getString(R.string.action_order_message));
                Intent intent = new Intent(MainActivity.this, orderActivity.class);
                intent.putExtra(EXTRA_MESSAGE, mOrderMessage);
                startActivity(intent);
                return true;
          //  break;
            case R.id.action_status:
                displayToast(getString(R.string.action_status_message));
                break;
            case R.id.action_favorites:
                displayToast(getString(R.string.action_favorites_message));
                break;
            case R.id.action_contact:
                displayToast(getString(R.string.action_contact_message));
                break;
            default:
        }

        return super.onOptionsItemSelected(item);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message,
                Toast.LENGTH_SHORT).show();


    }

    public void showDonutOrder(View view) {
        //displayToast(getString(R.string.donut_order_message));
        mOrderMessage = getString(R.string.donut_order_message);
    }
    public void showIceCreamOrder(View view) {
       // displayToast(getString(R.string.ice_cream_order_message));
        mOrderMessage = getString(R.string.ice_cream_order_message);
    }
    public void showFroyoOrder(View view) {
      //  displayToast(getString(R.string.froyo_order_message));
        mOrderMessage = getString(R.string.froyo_order_message);
    }
}