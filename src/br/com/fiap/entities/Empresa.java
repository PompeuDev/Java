package br.com.fiap.entities;

public class Empresa {

    //visibilidade . tipos de dados . atributos

    private String cnpj;
    private String razaoSocial;

    // setters (entradas) e getters (saidas)
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
