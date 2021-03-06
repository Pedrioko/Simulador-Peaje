/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.simuladorpeaje.vista;

import javax.swing.*;

/**
 *
 * @author Estudiante
 */
public class PanelTab extends JPanel {

    JTabbedPane pestañas;
    int tipo;

    /**
     *
     * @param p
     * @param op
     */
    public PanelTab(JTabbedPane p, int op, Boolean in) {

        if (p != null) {

            this.pestañas = p;
            tipo = op;

            setOpaque(false);

            JLabel titulo = new JLabel() {

                public String getText() {
                    int i = pestañas.indexOfTabComponent(PanelTab.this);
                    if (i != -1) {
                        return pestañas.getTitleAt(i);
                    }
                    return null;
                }
            };

            add(titulo);
            titulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 5));
            JButton button = new BotonX(pestañas, this, tipo, in);
            add(button);
        }
    }
}
