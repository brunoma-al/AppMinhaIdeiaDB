package dev.android.bruno.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;

import java.util.List;

import dev.android.bruno.appminhaideiadb.api.AppUtil;
import dev.android.bruno.appminhaideiadb.datamodel.ClienteDataModel;
import dev.android.bruno.appminhaideiadb.datasource.AppDataBase;
import dev.android.bruno.appminhaideiadb.model.Cliente;

public class ClienteController extends AppDataBase implements iCrud<Cliente>{

    ContentValues dadosObjeto;

    public ClienteController(Context context) {
        super(context);

        Log.d(AppUtil.TAG, "ClienteController: Conectado");
    }


    @Override
    public boolean incluir(Cliente obj) {
        dadosObjeto = new ContentValues();
        // Key, Valor

        // dadoDoObjeto.put(ClienteDataModel.ID,obj.getId());
        // ID é chave primária da tabela cliente
        // é gerada automaticamente pelo SQLite a cada
        // novo registro adicionado
        // SQL ->>> INSERT INTO TABLE (... ... .. ) VALUES (### ### ###)
        dadosObjeto.put(ClienteDataModel.NOME,obj.getNome());
        dadosObjeto.put(ClienteDataModel.EMAIL,obj.getEmail());

        // Enviar os dados (dadoDoObjeto) para a classe AppDatabase
        // utilizando um método capaz de adicionar o OBJ no banco de
        // dados, tabela qualquer uma (Cliente)

        // Retorno sempre será FALSE ou VERDADEIRO

        return insert(ClienteDataModel.TABELA, dadosObjeto);
    }

    @Override
    public boolean alterar(Cliente obj) {

        dadosObjeto = new ContentValues();
        // Key, Valor

        // ID é chave primária da tabela cliente
        // é gerada automaticamente pelo SQLite a cada
        // novo registro adicionado
        // Alterar
        // SQL ->>> UPDATE
        dadosObjeto.put(ClienteDataModel.ID,obj.getId());
        dadosObjeto.put(ClienteDataModel.NOME,obj.getNome());
        dadosObjeto.put(ClienteDataModel.EMAIL,obj.getEmail());

        // Enviar os dados (dadoDoObjeto) para a classe AppDatabase
        // utilizando um método capaz de alterar o OBJ no banco de
        // dados, tabela qualquer uma (Cliente), respeitando o ID
        // ou PK (Primary Key)

        return update(ClienteDataModel.TABELA,dadosObjeto);
    }

    public boolean deletar(int id) {
        return deleteByID(ClienteDataModel.TABELA,id);
    }

    @Override
    public List<Cliente> listar(Cliente obj) {
        return getAllClientes(ClienteDataModel.TABELA);
    }
}
