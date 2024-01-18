package dev.android.bruno.appminhaideiadb.controller;

import java.util.List;

import dev.android.bruno.appminhaideiadb.model.Cliente;

public interface iCrud<T> {

    // Métodos para persistência de dados no Banco de Dados

    // Incluir
    public boolean incluir(T obj);

    // Alterar
    public boolean alterar(T obj);

    // Deletar
    public void deletar(T obj);

    // Listar
    public List<Cliente> listar(T obj);

    List<Cliente> listar();

    // CRUD - Create Retrieve Update Delete

}
