package com.example.aluno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main22Activity extends AppCompatActivity {

	public Button imgbtn;
	public Button carrinhow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
		
		imgbtn = (Button)findViewById(R.id.imgbtn);
        imgbtn.setOnClickListener(this);
		
		carrinhow = (Button)findViewById(R.id.carrinhow);
        carrinhow.setOnClickListener(this);
    }
	
	public void onClick(View v){
        switch (v.getId()){
			case R.id.imgbtn:
                imgbtn();
                break;
				
			case R.id.carrinhow:
                carrinhow();
                break;
        }
    }
	
    public void imgbtn(View v){
        Intent intent = new Intent(this, Main222Activity.class);
        startActivity(intent);
    }
	
	public void carrinhow(View v){
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }
	
}
