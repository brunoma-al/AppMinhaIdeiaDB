package dev.android.bruno.appminhaideiadb.model;

import android.util.Log;

import dev.android.bruno.appminhaideiadb.api.AppUtil;
import dev.android.bruno.appminhaideiadb.controller.iCrud;

public class Produto implements iCrud {

    private String nome;
    private String fornecedor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public void incluir() {

    }

    @Override
    public void alterar() {
    }

    @Override
    public void deletar() {
        Log.i(AppUtil.TAG, "deletar: Produto");
    }

    @Override
    public void listar() {
        Log.i(AppUtil.TAG, "listar: Produtos");
    }
}
