/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package begin;

import javax.swing.JButton;

/**
 *
 * @author hecto
 */
public class JButtonItem extends JButton {
    private int id;
    private static int quantidadeButtons = 0;

    public JButtonItem() {
        this.id = ++quantidadeButtons;
        System.out.println(this.id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
