package gaurink.mar.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
/*A classe MainActivity e a tela principal da aplicaçao*/
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //onCreate e o metodo chamado toda vez que a tela esta sendo criada//
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* setContentView construi os elementos de interface */

        Button btnEnviar = findViewById(R.id.btnEnviar); //obtem o botao enviar//
        btnEnviar.setOnClickListener(new View.OnClickListener() { //onClick define o que acontece quando clica no botao//
            @Override
            public void onClick(View v) { //executado quando o botao e clicado//
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);
                String textoDigitado = etDigiteAqui.getText().toString();
                Intent i = new Intent(MainActivity.this,NextActivity.class);
                i.putExtra("texto", textoDigitado);
                startActivity(i);
            }
        });
    }
}