package Biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Cliente {
    
    private int id;
    private String nome;
    private String dataNasc;
    private String cpf;
    private String endereco;
    private String fone;

    public Cliente(String nome, String dataNasc, String cpf, String endereco, String fone) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cpf = cpf;
        this.endereco = endereco;
        this.fone = fone;
    }
    
     public Cliente() {
    }  

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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }  
    
}