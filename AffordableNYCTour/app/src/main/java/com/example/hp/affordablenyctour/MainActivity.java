package com.example.hp.affordablenyctour;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button budgetButton = (Button) findViewById(R.id.budget_button_test);
        budgetButton.setOnClickListener(new View.OnClickListener() {
            //!<  Go to budget activity.
            @Override
            public void onClick(View v) {
                Log.v("BUDGET", "Clicked test button");
//                Toast.makeText(getBaseContext(), "Clicked button!", Toast.LENGTH_SHORT).show();
                Intent budgetIntent = new Intent(MainActivity.this, BudgetActivity.class);
//                Bundle budgetIntentBundle = new Bundle();
//                budgetIntentBundle.putString("", "");     //  Transfer info from APP to the budget activity with bundle on intent.
//                budgetIntent.putExtras(budgetIntentBundle);
                startActivity(budgetIntent);
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
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

