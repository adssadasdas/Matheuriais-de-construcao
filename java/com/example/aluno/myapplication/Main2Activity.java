package com.example.aluno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

	public Button cadastrobtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
		
		cadastrobtn = (Button)findViewById(R.id.cadastrobtn);
        cadastrobtn.setOnClickListener(this);
		
    }
	
	public void onClick(View v){
        switch (v.getId()){
			case R.id.cadastrobtn:
                cadastrobtn();
                break;
        }
    }
	
    public void cadastrobtn(View v){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}