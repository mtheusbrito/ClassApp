package com.example.walterlp.rpgclass.activity.activity.ui;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.walterlp.rpgclass.R;

public class CadastroActivity extends AppCompatActivity {
    private ProgressBar progressBar;
    private EditText editTextNome, editTextEmail, editTextSenha;
    private Button buttonCadastrar;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        initView();

    }

    private void initView() {
        progressBar = findViewById(R.id.progressCadastro);
        buttonCadastrar = findViewById(R.id.buttonCadastrar);
        editTextEmail = findViewById(R.id.editCadastroEmail);
        editTextNome = findViewById(R.id.editCadastroNome);
        editTextSenha = findViewById(R.id.editCadastroSenha);


        buttonCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(CadastroActivity.this, "Teste cadastrar", Toast.LENGTH_SHORT).show();
            }
        });
    }

}
