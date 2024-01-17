package dev.android.bruno.appminhaideiadb.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import dev.android.bruno.appminhaideiadb.api.AppUtil;

public class AppDataBase {
    private static final String DB_NAME = "AppMinhaIdeia.sqlite";
    private static final int DB_VERSION = 1;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);

        Log.d(AppUtil.TAG, "AppDataBase: Criando Banco de Dados");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
