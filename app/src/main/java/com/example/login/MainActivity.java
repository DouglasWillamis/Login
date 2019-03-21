package com.example.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText email;
    EditText senha;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = findViewById(R.id.etEmail);
        senha = findViewById(R.id.etSenha);
        login = findViewById(R.id.btnLogin);
    }

    public void submit(View view){
        if (Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()){
            if (!senha.getText().toString().isEmpty()){
                if (email.getText().toString().equals("admin@stos.mobi") && senha.getText().toString().equals("123456")) {
                    Toast.makeText(getApplicationContext(), "Autenticado com sucesso", Toast.LENGTH_LONG).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Usuário ou senha errados", Toast.LENGTH_LONG).show();
                }
            }
            else {
                Toast.makeText(getApplicationContext(), "Senha não preenchida", Toast.LENGTH_LONG).show();
            }
        }
        else {
            Toast.makeText(getApplicationContext(), "E-mail inválido", Toast.LENGTH_LONG).show();
        }
    }
}
