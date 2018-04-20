package com.mr_abdali.confirmationdialog;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //
    AlertDialog dialog;
    AlertDialog.Builder builder;
    String[] items = {"Easy", "Medium", "Hard", "Very Hard"};
    String result = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //
        builder = new AlertDialog.Builder(MainActivity.this,R.style.ConfirmationDialogTheme);
        builder.setTitle("Select the difficulty level");

        builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //code
                //System.out.println(i);
                //actions
                result = items[i];
            }
        });
        // actions ok
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //
                Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();
            }
        });
        // actions cancel
        builder.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //
            }
        });

        // display the dialog..
        dialog = builder.create();
        dialog.show();
    }
}
