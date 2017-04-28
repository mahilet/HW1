package com.mahiltletdan.hw1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //define MESSAGE_TO_PASS String
    public static String MESSAGE_TO_PASS = "package com.mahiltletdan.hw1;";

    Context context;
    Button[] buttons = new Button[4];
    GridView grid;

    EditText myEditText;
    Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myEditText = (EditText)findViewById(R.id.message) ;
        mButton = (Button) findViewById(R.id.button);

        mButton.setOnClickListener(this);

        GridView gridview = (GridView) findViewById(R.id.gridview);


        grid.setAdapter(new MyButtonAdapter(this,buttons));

        //gridView.setAdapter(new MyButtonAdapter(this,buttons));


    }
    /** Called when the user taps the Send button */


    @Override
    public void onClick(View v) {

        //initializing a new Intent
        Intent intent = new Intent(this,detailActivity.class);
        //reference the EditText widget from layout

        //get user inputted state name
        String me  =  myEditText.getText().toString();

        //pass the state name to another activity
        // Intent can carry data types as key-value pairs called Extras
        intent.putExtra(MESSAGE_TO_PASS, me);
        startActivity(intent);

    }
}

