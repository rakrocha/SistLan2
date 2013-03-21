/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.sistLan;

/**
 *
 * @author Raquel
 */
public class Cliente {
    private String nome;
    private String rg;
    private int idade;
    private Endereco enderecoCompleto;
    private String nomeResponsável;
    private int numeroUtilizacoes=0;
    private RegistroUtilizacao[] utilizacao;
    private String observações;
    
    Cliente(String nome, String rg, int idade, String rua, int numero, String bairro){
        if (idade<18) System.out.println("Usuário menor de idade nao autorizado sem responsaveis");
        else{
        this.nome = nome;
        this.rg = rg;
        this.idade = idade;
        this.enderecoCompleto = new Endereco(rua, numero, bairro);
        this.utilizacao = new RegistroUtilizacao[100];
        }
    }
    
    Cliente(String nome, String rg, int idade, String rua, int numero, String bairro, String nomeResponsavel){
        this.nome = nome;
        this.rg = rg;
        this.idade = idade;
        this.enderecoCompleto = new Endereco(rua, numero, bairro);
        this.utilizacao = new RegistroUtilizacao[100];
        this.nomeResponsável = nomeResponsavel;
    }
    
    public void addUtilizacao(RegistroUtilizacao u){
        this.utilizacao[this.numeroUtilizacoes++] = u;
    }
    
    public void addPenalidade(int p){
        this.utilizacao[this.numeroUtilizacoes].novaPenalidade(p);   //a penalidade é adicionada na ultima utilizacao
    }
}