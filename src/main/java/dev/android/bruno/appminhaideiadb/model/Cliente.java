package dev.android.bruno.appminhaideiadb.model;

import android.util.Log;

import dev.android.bruno.appminhaideiadb.api.AppUtil;
import dev.android.bruno.appminhaideiadb.controller.iCrud;

public class Cliente implements iCrud {

    private int id;
    private String nome;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void incluir() {
        Log.i(AppUtil.TAG, "incluir: Cliente nome" +getNome());
    }

    @Override
    public void alterar() {
        Log.i(AppUtil.TAG, "alterar: Cliente");
    }

    @Override
    public void deletar() {
        Log.i(AppUtil.TAG, "deletar: Cliente");
    }

    @Override
    public void listar() {
        Log.i(AppUtil.TAG, "listar: Clientes");
    }
}
