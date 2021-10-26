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
public class ItemLendario extends Item{
    private String buff;

    public ItemLendario(String nome, String descricao, int valor, String buff, String url) {
        super(nome, descricao, valor, url);
        this.buff = buff;
        setMoeda(Moeda.SAPHIRE);
    }

    @Override
    public String getBuffs() {
        return buff;
    }

    public void setBuff(String buff) {
        this.buff = buff;
    }
    
     @Override
    public String toString() {
        return "Item{" +"id: " + getId() + "nome=" + getNome() + ", descricao=" + getDescricao() + ", valor=" + getValor() + ", moeda=" + getMoeda() +  ", Buff: " + getBuffs() + '}';
    }
}
