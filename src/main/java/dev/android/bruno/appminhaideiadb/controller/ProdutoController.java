package dev.android.bruno.appminhaideiadb.controller;

import android.content.Context;

import java.util.List;

import dev.android.bruno.appminhaideiadb.datasource.AppDataBase;
import dev.android.bruno.appminhaideiadb.model.Cliente;
import dev.android.bruno.appminhaideiadb.model.Produto;


public class ProdutoController extends AppDataBase implements iCrud<Produto> {
    public ProdutoController(Context context) {
        super(context);
    }

    @Override
    public boolean incluir(Produto obj) {
        return false;
    }

    @Override
    public boolean alterar(Produto obj) {
        return false;
    }

    @Override
    public void deletar(Produto obj) {

    }

    @Override
    public List<Cliente> listar(Produto obj) {
        return null;
    }

    @Override
    public List<Cliente> listar() {
        return null;
    }
}
