package com.example.aluno.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

	public Button Comprar;
	public Button Voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
		
		Comprar = (Button)findViewById(R.id.Comprar);
        Comprar.setOnClickListener(this);
		
		Voltar = (Button)findViewById(R.id.Voltar);
        Voltar.setOnClickListener(this);
		
    }
	
	public void onClick(View v){
        switch (v.getId()){
			case R.id.Comprar:
                Comprar();
                break;
				
			case R.id.Voltar:
                Voltar();
                break;
        }
    }
	
	public void Comprar(View v){
        Intent intent = new Intent(this, Main32Activity.class);
        startActivity(intent);
    }
	
	public void Voltar(View v){
        Intent intent = new Intent(this, Main22Activity.class);
        startActivity(intent);
    }
}
