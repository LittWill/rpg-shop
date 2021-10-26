/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package begin;

/**
 *
 * @author hecto
 */
public class Item {

    private int id;
    private String nome;
    private String descricao;
    private int valor;
    private Moeda moeda = Moeda.GOLD;
    private String urlImage;
    private static int quantidadeItens = 0;

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
    
    public Item(String nome, String descricao, int valor, String urlImage) {
        this.id = ++quantidadeItens;
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.urlImage = urlImage;
        System.out.println(this.id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Moeda getMoeda() {
        return moeda;
    }

    public void setMoeda(Moeda moeda) {
        this.moeda = moeda;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + ", valor=" + valor + ", moeda=" + moeda + '}';
    }
    
    public String getBuffs(){
    return null;
    }
        
        
        
    
}
