/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.sistLan;

/**
 *
 * @author Raquel
 */
public class RegistroUtilizacao {
    private int numComputador;
    private String data;
    private String hora;
    private int tempoUtilizacao; //em minutos
    private double penalidades=0;
    private boolean pago=false;
    
    public void novaPenalidade(int p){
        this.penalidades = p;
    }
    
    public double preco(){
        if (this.tempoUtilizacao < 180) return this.tempoUtilizacao*0.5;
        else if (this.tempoUtilizacao < 240) return this.tempoUtilizacao*0.3;
            else return this.tempoUtilizacao*0.2;
    }
    
    public void pagar(){
        this.pago = true;
    }
}