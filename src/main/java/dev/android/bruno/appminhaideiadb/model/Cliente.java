package dev.android.bruno.appminhaideiadb.model;

import java.util.List;

import dev.android.bruno.appminhaideiadb.controller.iCrud;

public class Cliente implements iCrud<Cliente> {

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
    public boolean incluir(Cliente obj) {

        return false;
    }

    @Override
    public boolean alterar(Cliente obj) {

        return false;
    }

    @Override
    public void deletar(Cliente obj) {

    }

    @Override
    public List<Cliente> listar(Cliente obj) {

        return null;
    }
}
