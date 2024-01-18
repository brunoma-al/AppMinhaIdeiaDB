package dev.android.bruno.appminhaideiadb.model;

import java.util.List;

import dev.android.bruno.appminhaideiadb.controller.iCrud;

public class Produto implements iCrud<Produto> {

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
}
