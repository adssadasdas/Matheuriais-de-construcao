package com.example.aluno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	public Button logar;
	public Button cadastrarse;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
		
		logar = (Button)findViewById(R.id.logar);
        logar.setOnClickListener(this);
		cadastrarse = (Button)findViewById(R.id.cadastrarse);
        cadastrarse.setOnClickListener(this);
    }
	
	public void onClick(View v){
        switch (v.getId()){
            case R.id.logar:
                logar();
                break;
			case R.id.cadastrarse:
                cadastrarse();
                break;
        }
    }

    public void cadastrarse(View v){
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    public void logar(View v){
        Intent intent = new Intent(this, Main22Activity.class);
        startActivity(intent);
    }
}
