package com.example.k46f.namealert;


import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    final Context context = this;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_x = (Button)findViewById(R.id.Send_F);
        edit_a = (EditText)findViewById(R.id.Name_F);
        edit_b = (EditText)findViewById(R.id.Second_Name_F);
        button_x.setOnClickListener( new View.OnClickListener() {
            public void onClick(View view){
                String name_x = edit_a.getText().toString();
                String name_y = edit_b.getText().toString();

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);

                // set title
                alertDialogBuilder.setTitle("Hi " + name_x);

                // set dialog message
                alertDialogBuilder
                        .setMessage("Hey! " + name_x + " " + name_y)
                        .setCancelable(false)
                        .setPositiveButton("Exit",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, close
                                // current activity
                                MainActivity.this.finish();
                            }
                        })
                        .setNegativeButton("Back",new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,int id) {
                                // if this button is clicked, just close
                                // the dialog box and do nothing
                                dialog.cancel();
                            }
                        });

                // create alert dialog
                AlertDialog alertDialog = alertDialogBuilder.create();

                // show it
                alertDialog.show();
            }
            });
    }
    private Button button_x;
    private EditText edit_a;
    private EditText edit_b;

}

