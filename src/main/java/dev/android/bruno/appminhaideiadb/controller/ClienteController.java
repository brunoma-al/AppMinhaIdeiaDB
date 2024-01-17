package dev.android.bruno.appminhaideiadb.controller;

import android.content.Context;
import android.util.Log;

import dev.android.bruno.appminhaideiadb.api.AppUtil;
import dev.android.bruno.appminhaideiadb.datasource.AppDataBase;

public class ClienteController extends AppDataBase {

    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtil.TAG, "ClienteController: Conectado");
    }
}
