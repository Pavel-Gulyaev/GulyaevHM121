package com.example.gulyaevhm121;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button okButton = (Button) findViewById(R.id.okButton);
        Button clearButton = (Button) findViewById(R.id.clearButton);

        okButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);


    }

    public void onClick(View v){
        TextView textView = (TextView) findViewById(R.id.textView);
        EditText editName = (EditText) findViewById(R.id.editname);
        EditText editEmail = (EditText) findViewById(R.id.editemail);



        switch (v.getId()) {
            case R.id.okButton: {
                String name = editName.getText().toString();
                String email = editEmail.getText().toString();
                textView.setText("Подписка на рассылку успешно оформлена для пользователя " + name + " на электронный адрес " + email);
                break;
            }
            case R.id.clearButton:{
                textView.setText("");
                break;
            }
        }
    }

}
