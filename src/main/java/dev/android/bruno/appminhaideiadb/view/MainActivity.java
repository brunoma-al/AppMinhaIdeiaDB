package dev.android.bruno.appminhaideiadb.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import dev.android.bruno.appminhaideiadb.R;
import dev.android.bruno.appminhaideiadb.api.AppUtil;
import dev.android.bruno.appminhaideiadb.controller.ClienteController;

public class MainActivity extends AppCompatActivity {

    ClienteController clienteController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(AppUtil.TAG, "onCreate: App Minha Ideia Database :>");

        clienteController = new ClienteController(getApplicationContext());
    }
}