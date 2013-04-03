/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.igce.sistLan;

/**
 *
 * @author Raquel
 */

import java.util.Random;

public class PovoadorComputador {
    private Random g;
    
    public PovoadorComputador () {
        g = new Random();
    }
    
    private String marcas[] = {
        "DELL",
        "Lenovo",
        "Acer",
        "HP",
        "MSI"};
    
    private String processadores[] = {
        "Intel® Core™2 Duo ",
        "Intel® Core™ Duo",
        "Intel® Pentium® D ",
        "Intel® Celeron® M",
        "Intel® Pentium® M ",
        "Intel® Pentium® 4 "
    };
    
    private String hd[] = {
        "1 GB","2 GB","3 GB","4 GB","5 GB","6 GB","7 GB","8 GB","9 GB","10 GB",
        "15 GB","20 GB","30 GB","40 GB","50 GB","60 GB","70 GB","80 GB","100 GB",
        "120 GB","160 GB","200 GB","250 GB","300 GB","400 GB","500 GB","640 GB",
        "750 GB","1 TB","1.5 TB","2 TB" };
    
    public int gerarNumero(){
        return g.nextInt(1000);
    }
    
    public String gerarMarca(){
        return marcas[g.nextInt(marcas.length)];
    }
    
    public String gerarProcessador(){
        return processadores[g.nextInt(processadores.length)];
    }
    
    public String gerarHd(){
        return hd[g.nextInt(hd.length)];
    }
    
    public String gerarIp(){        
       String ip = "192.168." + g.nextInt(256) + "." + g.nextInt(256);
       return ip;
    }
    
    public int gerarRam(){
        int n;
        n = g.nextInt(10);
        while (n==0) n = g.nextInt(10);
        return n;
    }
}
