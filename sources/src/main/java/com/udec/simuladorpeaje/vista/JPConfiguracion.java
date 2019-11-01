/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.simuladorpeaje.vista;

import com.udec.simuladorpeaje.logica.Configuracion;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 *
 * @author PedroD
 */
public class JPConfiguracion extends javax.swing.JPanel {

    ArrayList<Double> telepeaje = new ArrayList<>();
    ArrayList<Double> tipos = new ArrayList<>();
    Configuracion configuracion = Configuracion.getInstancia();

    /**
     * Creates new form JPConfiguracion
     */
    public JPConfiguracion() {

        initComponents();

        cargar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPmediastiempos = new javax.swing.JPanel();
        JTtiempodellegada = new javax.swing.JTextField();
        JTtiempoatencioncaseta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTtiempoatenciontelepeaje = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JPprobabilidadesvehiculos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTLprobabilidadesvehiculos = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jlsumatipo = new javax.swing.JLabel();
        JPprobabilidadestelepeaje = new javax.swing.JPanel();
        JSPtelepeaje = new javax.swing.JScrollPane();
        JTLusotelepeaje = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jlsumauso = new javax.swing.JLabel();
        JBactualizar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Configuración Probabilidades y Medias", 0, 0, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        JPmediastiempos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Medias de los tiempos "));

        JTtiempodellegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTtiempodellegadaActionPerformed(evt);
            }
        });
        JTtiempodellegada.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTtiempodellegadaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTtiempodellegadaKeyTyped(evt);
            }
        });

        JTtiempoatencioncaseta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTtiempoatencioncasetaActionPerformed(evt);
            }
        });
        JTtiempoatencioncaseta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTtiempoatencioncasetaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTtiempoatencioncasetaKeyTyped(evt);
            }
        });

        jLabel1.setText("Media del tiempo de llegada");

        jLabel2.setText("Media del tiempo de atención casetas");

        JTtiempoatenciontelepeaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTtiempoatenciontelepeajeActionPerformed(evt);
            }
        });
        JTtiempoatenciontelepeaje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTtiempoatenciontelepeajeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTtiempoatenciontelepeajeKeyTyped(evt);
            }
        });

        jLabel5.setText("Media del tiempo de atención tele peajes");

        javax.swing.GroupLayout JPmediastiemposLayout = new javax.swing.GroupLayout(JPmediastiempos);
        JPmediastiempos.setLayout(JPmediastiemposLayout);
        JPmediastiemposLayout.setHorizontalGroup(
            JPmediastiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPmediastiemposLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(JPmediastiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(JPmediastiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JTtiempodellegada, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(JTtiempoatencioncaseta)
                    .addComponent(JTtiempoatenciontelepeaje))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPmediastiemposLayout.setVerticalGroup(
            JPmediastiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPmediastiemposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPmediastiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTtiempodellegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPmediastiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTtiempoatencioncaseta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPmediastiemposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(JTtiempoatenciontelepeaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        JPprobabilidadesvehiculos.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Probabilidad del tipo de vehiculo"));

        JTLprobabilidadesvehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Vehiculo", "Probabilidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTLprobabilidadesvehiculos);

        jLabel4.setText("Total:");

        jlsumatipo.setText("     -   ");

        javax.swing.GroupLayout JPprobabilidadesvehiculosLayout = new javax.swing.GroupLayout(JPprobabilidadesvehiculos);
        JPprobabilidadesvehiculos.setLayout(JPprobabilidadesvehiculosLayout);
        JPprobabilidadesvehiculosLayout.setHorizontalGroup(
            JPprobabilidadesvehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPprobabilidadesvehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(JPprobabilidadesvehiculosLayout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlsumatipo, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        JPprobabilidadesvehiculosLayout.setVerticalGroup(
            JPprobabilidadesvehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPprobabilidadesvehiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPprobabilidadesvehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jlsumatipo))
                .addContainerGap())
        );

        JPprobabilidadestelepeaje.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Probabilidad de uso de Tele peaje"));

        JTLusotelepeaje.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Valores", "Posibilidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JSPtelepeaje.setViewportView(JTLusotelepeaje);

        jLabel3.setText("Total:");

        jlsumauso.setText("     -    ");

        javax.swing.GroupLayout JPprobabilidadestelepeajeLayout = new javax.swing.GroupLayout(JPprobabilidadestelepeaje);
        JPprobabilidadestelepeaje.setLayout(JPprobabilidadestelepeajeLayout);
        JPprobabilidadestelepeajeLayout.setHorizontalGroup(
            JPprobabilidadestelepeajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPprobabilidadestelepeajeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JSPtelepeaje, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(JPprobabilidadestelepeajeLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(jlsumauso, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        JPprobabilidadestelepeajeLayout.setVerticalGroup(
            JPprobabilidadestelepeajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPprobabilidadestelepeajeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JSPtelepeaje, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPprobabilidadestelepeajeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jlsumauso))
                .addContainerGap())
        );

        JBactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1408842495_refresh.png"))); // NOI18N
        JBactualizar.setText("Actuzalizar Probabilidades y Medias");
        JBactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBactualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPmediastiempos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JBactualizar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(JPprobabilidadesvehiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JPprobabilidadestelepeaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(JPmediastiempos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPprobabilidadestelepeaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPprobabilidadesvehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBactualizar)
                .addContainerGap(24, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JTtiempoatencioncasetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTtiempoatencioncasetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTtiempoatencioncasetaActionPerformed

    private void JTtiempodellegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTtiempodellegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTtiempodellegadaActionPerformed

    private void JBactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBactualizarActionPerformed
        actualizar();
    }//GEN-LAST:event_JBactualizarActionPerformed

    private void JTtiempodellegadaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTtiempodellegadaKeyPressed

    }//GEN-LAST:event_JTtiempodellegadaKeyPressed

    private void JTtiempoatencioncasetaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTtiempoatencioncasetaKeyPressed

    }//GEN-LAST:event_JTtiempoatencioncasetaKeyPressed

    private void JTtiempodellegadaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTtiempodellegadaKeyTyped
        soloNumero(evt);
    }//GEN-LAST:event_JTtiempodellegadaKeyTyped

    private void JTtiempoatencioncasetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTtiempoatencioncasetaKeyTyped
        soloNumero(evt);
    }//GEN-LAST:event_JTtiempoatencioncasetaKeyTyped

    private void JTtiempoatenciontelepeajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTtiempoatenciontelepeajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTtiempoatenciontelepeajeActionPerformed

    private void JTtiempoatenciontelepeajeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTtiempoatenciontelepeajeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTtiempoatenciontelepeajeKeyPressed

    private void JTtiempoatenciontelepeajeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTtiempoatenciontelepeajeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTtiempoatenciontelepeajeKeyTyped

    private void porDefecto() {
        Configuracion.porDefecto();
        cargar();
    }

    private void soloNumero(java.awt.event.KeyEvent evt) {
        char caracter = evt.getKeyChar();
        if (!(Character.isDigit(caracter)) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter != KeyEvent.VK_PERIOD) && caracter != KeyEvent.VK_COMMA && caracter != KeyEvent.VK_DECIMAL && caracter != KeyEvent.VK_PERIOD) {
            evt.consume();
        }
    }

    private void soloNumeroEspecial(java.awt.event.KeyEvent evt) {
        char caracter = evt.getKeyChar();
        if (!(Character.isDigit(caracter)) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter != KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }

    /**
     *
     * @return
     */
    public boolean actualizar() {

        if (JTtiempodellegada.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite la media de tiempos llegadas", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            configuracion.setMediallegada(Float.parseFloat(this.JTtiempodellegada.getText()));
        }
        if (JTtiempoatencioncaseta.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite la media de tiempos de atención casetas", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            configuracion.setMediaatencion(Float.parseFloat(this.JTtiempoatencioncaseta.getText()));
        }
        if (JTtiempoatenciontelepeaje.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite la media de tiempos de atención de tele peaje", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            configuracion.setMediaatenciontelepeaje(Float.parseFloat(this.JTtiempoatenciontelepeaje.getText()));
        }

        int i = 0;
        double verifica = 0;
        for (Double double1 : tipos) {
            double1 = Double.parseDouble(JTLprobabilidadesvehiculos.getModel().getValueAt(i, 1).toString());
            verifica = verifica + double1;
            i++;
        }
        int w = 0;
        double verifica2 = 0;
        for (Double double1 : telepeaje) {
            double1 = Double.parseDouble(JTLusotelepeaje.getModel().getValueAt(w, 1).toString());
            verifica2 = verifica2 + double1;
            w++;
            System.out.println("entro-  verifica2 " + verifica2);
        }
        if (verifica >= 0.9999999999999999) {
            this.jlsumatipo.setText(String.valueOf(1.0));
        } else {
            this.jlsumatipo.setText(String.valueOf(verifica));
        }
        this.jlsumauso.setText(String.valueOf(verifica2));
        if (verifica > 1) {
            JOptionPane.showMessageDialog(null, "Las probabilidades para los tipos de vehiculos no son correctas(su suma no es 1)", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;

        }
        if (verifica2 > 1) {
            JOptionPane.showMessageDialog(null, "Las probabilidades para el telepeaje no son correctas(su suma no es 1)", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;

        }
        if ((1 - verifica) > 0.0000000000001) {
            JOptionPane.showMessageDialog(null, "Las probabilidades para los tipos de vehiculos no son correctas(su suma no es 1)", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return false;
        } else {
            if ((1 - verifica2) > 0.0000000000001) {
                System.out.println("entro ----" + verifica2);
                JOptionPane.showMessageDialog(null, "Las probabilidades para el telepeaje no son correctas(su suma no es 1)", "Advertencia", JOptionPane.WARNING_MESSAGE);
                return false;
            } else {
                System.out.println("entro fffff");
                configuracion.setProba_telepeaje(telepeaje);
                configuracion.setProba_tipocarro(tipos);
                probanuevas();
                cargar();
                JOptionPane.showMessageDialog(null, "Las probabilidades han sido actualizadas exitosamente", "Información", JOptionPane.INFORMATION_MESSAGE);
                return true;
            }
        }
    }

    private void probanuevas() {
        DefaultTableModel tabla = new DefaultTableModel(new Object[][]{},
                new String[]{
                    "Tipo de Vehiculo", "Probabilidad"
                }) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.Double.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, true
                    };

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                };
        tabla = (DefaultTableModel) JTLprobabilidadesvehiculos.getModel();
        int u = 0;
        ArrayList<Double> listanew = new ArrayList<>();
        for (Double double1 : tipos) {
            listanew.add((double) tabla.getValueAt(u, 1));
            u++;

        }
        configuracion.clearTipoCarro();
        configuracion.addAllTipoCarro(listanew);
        tabla = new DefaultTableModel(new Object[][]{},
                new String[]{
                    "Valores", "Posibilidad"
                }) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.Double.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, true
                    };

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                };

        tabla = (DefaultTableModel) JTLusotelepeaje.getModel();
        u = 0;
        listanew = new ArrayList<>();
        for (Double double1 : telepeaje) {
            listanew.add((double) tabla.getValueAt(u, 1));
            u++;

        }
        configuracion.clearTelepeaje();
        configuracion.addAllTelepeaje(listanew);

    }

    private void cargar() {

        telepeaje = configuracion.getProba_telepeaje();
        tipos = configuracion.getProba_tipocarro();
        ArrayList<String> tipos = new ArrayList<>();
        tipos.add("Carro Particular");
        tipos.add("Carro Publico");
        tipos.add("Camion Particular");
        tipos.add("Camion Publico");
        tipos.add("Bus");
        tipos.add("Borrador");
        llenaTipos(this.tipos, tipos);
        tipos = new ArrayList<>();
        tipos.add("Si");
        tipos.add("No");
        llenaTelepeaje(this.telepeaje, tipos);
        this.JTtiempodellegada.setText(String.valueOf(configuracion.getMediallegada()));
        this.JTtiempoatencioncaseta.setText(String.valueOf(configuracion.getMediaatencionnormal()));
        this.JTtiempoatenciontelepeaje.setText(String.valueOf(configuracion.getMediaatenciontelepeaje()));
    }

    private void llenaTipos(ArrayList<Double> lista, ArrayList<String> tipos) {
        DefaultTableModel tabla = new DefaultTableModel(new Object[][]{},
                new String[]{
                    "Tipo de Vehiculo", "Probabilidad"
                }) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.Double.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, true
                    };

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                };

        int u = 0;
        tabla.setRowCount(tipos.size());
        for (Double double1 : lista) {
            tabla.setValueAt(tipos.get(u), u, 0);
            tabla.setValueAt(double1, u, 1);
            u++;
        }

        JTLprobabilidadesvehiculos.setModel(tabla);

    }

    private void llenaTelepeaje(ArrayList<Double> lista, ArrayList<String> tipos) {
        DefaultTableModel tabla = new DefaultTableModel(new Object[][]{},
                new String[]{
                    "Valores", "Posibilidad"
                }) {
                    Class[] types = new Class[]{
                        java.lang.String.class, java.lang.Double.class
                    };
                    boolean[] canEdit = new boolean[]{
                        false, true
                    };

                    public Class getColumnClass(int columnIndex) {
                        return types[columnIndex];
                    }

                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit[columnIndex];
                    }
                };

        int u = 0;
        tabla.setRowCount(tipos.size());
        for (Double double1 : lista) {
            tabla.setValueAt(tipos.get(u), u, 0);
            tabla.setValueAt(double1, u, 1);
            u++;
        }

        JTLusotelepeaje.setModel(tabla);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBactualizar;
    private javax.swing.JPanel JPmediastiempos;
    private javax.swing.JPanel JPprobabilidadestelepeaje;
    private javax.swing.JPanel JPprobabilidadesvehiculos;
    private javax.swing.JScrollPane JSPtelepeaje;
    private javax.swing.JTable JTLprobabilidadesvehiculos;
    private javax.swing.JTable JTLusotelepeaje;
    private javax.swing.JTextField JTtiempoatencioncaseta;
    private javax.swing.JTextField JTtiempoatenciontelepeaje;
    private javax.swing.JTextField JTtiempodellegada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlsumatipo;
    private javax.swing.JLabel jlsumauso;
    // End of variables declaration//GEN-END:variables
}