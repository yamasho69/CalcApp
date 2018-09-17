package jp.techacademy.shohei.yamamoto.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText editText1;
    EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(this);

        editText1 = (EditText)findViewById(R.id.editText1);
        editText1.setOnClickListener(this);

        editText2 = (EditText)findViewById(R.id.editText2);
        editText2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();
        double value1 = Double.parseDouble(text1);
        double value2 = Double.parseDouble(text2);
        Intent intent = new Intent(this,SecondActivity.class);
        if(v.getId() == R.id.button1) {intent.putExtra("tasu",value1 + value2);
        }else if(v.getId() == R.id.button2){intent.putExtra("hiku",value1 - value2);
        }else if(v.getId() == R.id.button3){intent.putExtra("kakeru",value1 * value2);
        }else if(v.getId() == R.id.button4){intent.putExtra("waru",value1 / value2);
        }
    }
}
