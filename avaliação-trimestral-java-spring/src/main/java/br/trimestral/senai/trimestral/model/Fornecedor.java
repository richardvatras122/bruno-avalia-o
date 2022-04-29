package br.trimestral.senai.trimestral.model;

public class Fornecedor {
    private int id;
    private String nome;
    private String email;
    private double telefone;

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



    public double getTelefone() {
        return telefone;
    }
    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Fornecedor{" +
                "id" + id +
                " nome" + nome +
                " email" + email +
                " telefone" + telefone;
    }
}
