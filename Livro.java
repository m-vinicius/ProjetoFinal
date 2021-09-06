package Biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Livro {
    
    private int id;
    private String nomeLivro;
    private String autor;
    private String edicao;
    private String ano;
    private String disponibilidade;

    public Livro(int id, String nomeLivro, String autor, String edicao, String ano, String disponibilidade) {
        this.id = id;
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.edicao = edicao;
        this.ano = ano;
        this.disponibilidade = disponibilidade;
    }

    public Livro() {
    }   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEdicao() {
        return edicao;
    }

    public void setEdicao(String edicao) {
        this.edicao = edicao;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }    
}