/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package googlemaps;

import java.util.ArrayList;

/**
 * 
 * @author Nina :D
 */
public class Bus {
    
    private String linha;
    private String origem;
    private String destino;
    private ArrayList<String> caminho;

    public Bus(String linha, String origem, String destino) {
        this.linha = linha;
        this.origem = origem;
        this.destino = destino;
        this.caminho =  new ArrayList<>();
    }

    public String getLinha() {
        return linha;
    }

    public void setLinha(String linha) {
        this.linha = linha;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public ArrayList<String> getCaminho() {
        return caminho;
    }

    public void setCaminho(ArrayList<String> caminho) {
        this.caminho = caminho;
    }  
}
