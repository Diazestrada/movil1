package com.example.movil1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.movil1.activity.empleado;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnEmpleado, btnEmpresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEmpleado = (Button) findViewById(R.id.btnEmpleado);
        btnEmpresa = (Button) findViewById(R.id.btnEmpresa);

        btnEmpleado.setOnClickListener(this);
            

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnEmpresa:
                Intent myIntent1 = new Intent(MainActivity.this, empleado.class);
                MainActivity.this.startActivity(myIntent1);
                break;
            case R.id.btnEmpleado:
                Intent myIntent = new Intent(MainActivity.this, empleado.class);
                MainActivity.this.startActivity(myIntent);
                break;
        }
    }


}