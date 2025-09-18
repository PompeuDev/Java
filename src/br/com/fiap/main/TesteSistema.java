package br.com.fiap.main;

import br.com.fiap.entities.Cliente;
import br.com.fiap.entities.Empresa;
import br.com.fiap.entities.Endereco;

public class TesteSistema {
    public static void main(String[] args) {

        //instanciar objetos
        Cliente objCliente = new Cliente();
        Empresa objEmpresa = new Empresa();
        Endereco objEndereco = new Endereco();

        // Entradas (Cliente / Endereco)
        objCliente.setNome("Braufagelio");
        objCliente.setIdade(87);
        objCliente.setAltura(1.55);

        objEndereco.setLogradouro("Rua Apito do Vapor");
        objEndereco.setNumero(237);
        objEndereco.setComplemento("Casa");
        objEndereco.setBairro("Santana");
        objEndereco.setCidade("São Paulo");
        objEndereco.setCep("02037-001");


        objCliente.setEndereco(objEndereco);

        //ENtradas empresa

        objEmpresa.setCnpj("00001-0001");
        objEmpresa.setRazaoSocial("BRF CORPORATION ILIMITADA");

        //saidas

        System.out.println(
                "Informações do cliente \n\n" +
                "Nome:   " + objCliente.getNome() +
                "\nIdade:  " + objCliente.getIdade()  +
                "\nAltura:  " + objCliente.getAltura() +
                "\n\nEndereço do cliente: \n\n" +
                "Logradouro:  " + objCliente.getEndereco().getLogradouro() +
                "\nNumero:  "   + objCliente.getEndereco().getNumero() +
                "\nComplemento:   "  + objCliente.getEndereco().getComplemento() +
                "\nBairro:   "    +  objCliente.getEndereco().getBairro() +
                "\nCidade:   "   +   objCliente.getEndereco().getCidade() +
                "\nCep:     "   +  objCliente.getEndereco().getCep()  +
                "\n\n Informaçoes da empresa:  " +
                "\nCNPJ:  " + objEmpresa.getCnpj()  +
                "\nRazao Social:   "  + objEmpresa.getRazaoSocial()




        );




    }
}
