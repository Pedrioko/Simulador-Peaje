/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.simuladorpeaje.vista;

import com.udec.simuladorpeaje.toFile.ToExcel;
import com.udec.simuladorpeaje.validaciones.Ayuda;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 *
 * @author Estudiante
 */
public class JPCMixto extends javax.swing.JPanel {

    /**
     *
     */
    public static ArrayList<Float> resultados = new ArrayList<>();

    private ToExcel a = new ToExcel();

    /**
     * Creates new form JPmixto
     */
    public JPCMixto() {
   
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        JPpruebas = new javax.swing.JPanel();
        JBpromedios = new javax.swing.JButton();
        JBfrecuencias = new javax.swing.JButton();
        JBdistancias = new javax.swing.JButton();
        JBkolgomorov = new javax.swing.JButton();
        JBpoker = new javax.swing.JButton();
        JBcorridas1 = new javax.swing.JButton();
        JBcorridas2 = new javax.swing.JButton();
        JBseries = new javax.swing.JButton();
        JLpromedio = new javax.swing.JLabel();
        JLfrecuencias = new javax.swing.JLabel();
        JLdistancias = new javax.swing.JLabel();
        JLkolgomorov = new javax.swing.JLabel();
        JLpoker = new javax.swing.JLabel();
        JLcorridas1 = new javax.swing.JLabel();
        JLcorridas2 = new javax.swing.JLabel();
        JLseries = new javax.swing.JLabel();
        JPvariables = new javax.swing.JPanel();
        LBlimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JTsemilla = new javax.swing.JTextField();
        JBgenerar = new javax.swing.JButton();
        JTmodulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTaditiva = new javax.swing.JTextField();
        JTmultiplicador = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JPnumerosgenerados = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel6 = new javax.swing.JLabel();
        JPencabezado = new javax.swing.JPanel();
        JLnombre = new javax.swing.JLabel();
        JCBvalida = new javax.swing.JCheckBox();
        JBguardar = new javax.swing.JButton();

        JPpruebas.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Pruebas"));

        JBpromedios.setText("Promedio");
        JBpromedios.setEnabled(false);
        JBpromedios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpromediosActionPerformed(evt);
            }
        });

        JBfrecuencias.setText("Frecuencias");
        JBfrecuencias.setEnabled(false);
        JBfrecuencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBfrecuenciasActionPerformed(evt);
            }
        });

        JBdistancias.setText("Distancias");
        JBdistancias.setEnabled(false);
        JBdistancias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBdistanciasActionPerformed(evt);
            }
        });

        JBkolgomorov.setText("Kolgomorov");
        JBkolgomorov.setEnabled(false);
        JBkolgomorov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBkolgomorovActionPerformed(evt);
            }
        });

        JBpoker.setText("Poker");
        JBpoker.setEnabled(false);
        JBpoker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBpokerActionPerformed(evt);
            }
        });

        JBcorridas1.setText("Corridas 1");
        JBcorridas1.setEnabled(false);
        JBcorridas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcorridas1ActionPerformed(evt);
            }
        });

        JBcorridas2.setText("Corridas 2");
        JBcorridas2.setEnabled(false);
        JBcorridas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBcorridas2ActionPerformed(evt);
            }
        });

        JBseries.setText("Series");
        JBseries.setEnabled(false);
        JBseries.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBseriesActionPerformed(evt);
            }
        });

        JLpromedio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLpromedio.setText("-");

        JLfrecuencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLfrecuencias.setText("-");

        JLdistancias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLdistancias.setText("-");

        JLkolgomorov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLkolgomorov.setText("-");

        JLpoker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLpoker.setText("-");

        JLcorridas1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLcorridas1.setText("-");

        JLcorridas2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLcorridas2.setText("-");

        JLseries.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLseries.setText("-");

        javax.swing.GroupLayout JPpruebasLayout = new javax.swing.GroupLayout(JPpruebas);
        JPpruebas.setLayout(JPpruebasLayout);
        JPpruebasLayout.setHorizontalGroup(
            JPpruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPpruebasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPpruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBkolgomorov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBdistancias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBfrecuencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBpromedios, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JPpruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JLpromedio, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(JLfrecuencias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLdistancias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLkolgomorov, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(JPpruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBseries, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBcorridas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBcorridas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBpoker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(JPpruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JLpoker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLcorridas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLcorridas2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLseries, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        JPpruebasLayout.setVerticalGroup(
            JPpruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPpruebasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPpruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBpromedios)
                    .addComponent(JBpoker)
                    .addComponent(JLpoker)
                    .addComponent(JLpromedio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPpruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBfrecuencias)
                    .addComponent(JBcorridas1)
                    .addComponent(JLfrecuencias)
                    .addComponent(JLcorridas1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPpruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBdistancias)
                    .addComponent(JBcorridas2)
                    .addComponent(JLdistancias)
                    .addComponent(JLcorridas2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPpruebasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBkolgomorov)
                    .addComponent(JBseries)
                    .addComponent(JLkolgomorov)
                    .addComponent(JLseries))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPvariables.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Variables"));

        LBlimpiar.setText("Limpiar");
        LBlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LBlimpiarActionPerformed(evt);
            }
        });

        jLabel2.setText("Semilla (Xo)");

        jLabel4.setText("Cte Aditiva (c)");

        JTsemilla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTsemillaKeyTyped(evt);
            }
        });

        JBgenerar.setText("Generar");
        JBgenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBgenerarActionPerformed(evt);
            }
        });

        JTmodulo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTmoduloKeyTyped(evt);
            }
        });

        jLabel3.setText("Multiplicador (a)");

        JTaditiva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JTaditiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTaditivaActionPerformed(evt);
            }
        });
        JTaditiva.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTaditivaKeyTyped(evt);
            }
        });

        JTmultiplicador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTmultiplicadorKeyTyped(evt);
            }
        });

        jLabel1.setText("Modulo (m)");

        javax.swing.GroupLayout JPvariablesLayout = new javax.swing.GroupLayout(JPvariables);
        JPvariables.setLayout(JPvariablesLayout);
        JPvariablesLayout.setHorizontalGroup(
            JPvariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPvariablesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPvariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPvariablesLayout.createSequentialGroup()
                        .addComponent(LBlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JBgenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(JPvariablesLayout.createSequentialGroup()
                        .addGroup(JPvariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPvariablesLayout.createSequentialGroup()
                                .addGroup(JPvariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(25, 25, 25)
                                .addGroup(JPvariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTsemilla, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JTmodulo)))
                            .addGroup(JPvariablesLayout.createSequentialGroup()
                                .addGroup(JPvariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPvariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTmultiplicador)
                                    .addComponent(JTaditiva))))
                        .addContainerGap())))
        );
        JPvariablesLayout.setVerticalGroup(
            JPvariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPvariablesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPvariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTmodulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPvariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JTsemilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPvariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTmultiplicador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPvariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JTaditiva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPvariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBlimpiar)
                    .addComponent(JBgenerar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JPnumerosgenerados.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true), "Numeros Generados"));

        jScrollPane2.setViewportView(jList1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout JPnumerosgeneradosLayout = new javax.swing.GroupLayout(JPnumerosgenerados);
        JPnumerosgenerados.setLayout(JPnumerosgeneradosLayout);
        JPnumerosgeneradosLayout.setHorizontalGroup(
            JPnumerosgeneradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPnumerosgeneradosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPnumerosgeneradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        JPnumerosgeneradosLayout.setVerticalGroup(
            JPnumerosgeneradosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPnumerosgeneradosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                .addContainerGap())
        );

        JLnombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JLnombre.setText("Congruencial Mixto");

        JCBvalida.setText("Validar");

        JBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1408783509_shine_13.png"))); // NOI18N
        JBguardar.setText("Guardar");
        JBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPencabezadoLayout = new javax.swing.GroupLayout(JPencabezado);
        JPencabezado.setLayout(JPencabezadoLayout);
        JPencabezadoLayout.setHorizontalGroup(
            JPencabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPencabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JCBvalida)
                .addGap(98, 98, 98)
                .addComponent(JLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBguardar)
                .addGap(62, 62, 62))
        );
        JPencabezadoLayout.setVerticalGroup(
            JPencabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPencabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPencabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JCBvalida)
                    .addComponent(JBguardar))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPencabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JPpruebas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JPvariables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(JPnumerosgenerados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPencabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(JPvariables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JPpruebas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JPnumerosgenerados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void LBlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LBlimpiarActionPerformed
        JTmodulo.setText("");
        JTsemilla.setText("");
        JTmultiplicador.setText("");
        JTaditiva.setText("");
        DefaultListModel lm = new DefaultListModel();
        jList1.setModel(lm);
        resultados = new ArrayList<>();
        jLabel6.setText("");
        Ayuda.habilitarb(resultados, JBpromedios, JBfrecuencias, JBdistancias, JBkolgomorov, JBpoker, JBcorridas1, JBcorridas2, JBseries);
    }//GEN-LAST:event_LBlimpiarActionPerformed

    private void JBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBguardarActionPerformed
        a.guardar(resultados);
    }//GEN-LAST:event_JBguardarActionPerformed

    private void JBseriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBseriesActionPerformed
        if (this.compruebaLista()) {

            JLseries.setText(com.udec.simuladorpeaje.vista.Run.cp.pruebaSerie(resultados));
        }
    }//GEN-LAST:event_JBseriesActionPerformed

    private void JBcorridas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcorridas2ActionPerformed
        if (this.compruebaLista()) {
            JLcorridas2.setText(com.udec.simuladorpeaje.vista.Run.cp.pruebaCorridas2(resultados));
        }
    }//GEN-LAST:event_JBcorridas2ActionPerformed

    private void JBcorridas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBcorridas1ActionPerformed
        if (this.compruebaLista()) {
            JLcorridas1.setText(com.udec.simuladorpeaje.vista.Run.cp.pruebaCorridas1(resultados));
        }
    }//GEN-LAST:event_JBcorridas1ActionPerformed

    private void JBpokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpokerActionPerformed
        if (this.compruebaLista()) {
            JLpoker.setText(com.udec.simuladorpeaje.vista.Run.cp.pruebaPoker(resultados));
        }
    }//GEN-LAST:event_JBpokerActionPerformed

    private void JBkolgomorovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBkolgomorovActionPerformed
        if (this.compruebaLista()) {
            JLkolgomorov.setText(com.udec.simuladorpeaje.vista.Run.cp.pruebaKolgomorov(resultados));
        }
    }//GEN-LAST:event_JBkolgomorovActionPerformed

    private void JBdistanciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBdistanciasActionPerformed
        if (this.compruebaLista()) {
            JLdistancias.setText(com.udec.simuladorpeaje.vista.Run.cp.pruebaDistancia(resultados));
        }
    }//GEN-LAST:event_JBdistanciasActionPerformed

    private void JBfrecuenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBfrecuenciasActionPerformed
        if (this.compruebaLista()) {
            JLfrecuencias.setText(com.udec.simuladorpeaje.vista.Run.cp.pruebaFrecuencia(resultados));
        }
    }//GEN-LAST:event_JBfrecuenciasActionPerformed

    private void JBpromediosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBpromediosActionPerformed
        if (this.compruebaLista()) {
            JLpromedio.setText(com.udec.simuladorpeaje.vista.Run.cp.pruebaPromedios(resultados));
        }
    }//GEN-LAST:event_JBpromediosActionPerformed

    private void JBgenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBgenerarActionPerformed
        switch (JTmodulo.getText()) {
            case "0":
                JOptionPane.showMessageDialog(jPanel2, "El Modulo debe ser diferente de cero.");
                break;
            case "1":
                JOptionPane.showMessageDialog(jPanel2, "El Modulo debe ser diferente de uno.");
                break;
            default:
                if (!(JTmodulo.getText().equals("") || JTsemilla.getText().equals("") || JTmultiplicador.getText().equals("") || JTaditiva.getText().equals(""))) {
                    int m = Integer.parseInt(JTmodulo.getText());
                    int xo = Integer.parseInt(JTsemilla.getText());
                    int a = Integer.parseInt(JTmultiplicador.getText());
                    int c = Integer.parseInt(JTaditiva.getText());
                    resultados = new ArrayList<>();
                    if (JCBvalida.isSelected()) {
                        if (Ayuda.Primo(m)) {
                            if (c > 0) {
                                if (a > c) {
                                    if (m > a) {
                                        if (Ayuda.Impar(a)) {
                                            if ((c % 8) == 5) {
                                                if (a > 1) {
                                                    if (Ayuda.primoRelativo(c, m)) {
                                                        if (xo > 0) {
                                                            if (!Ayuda.Divisible(a, 3) && !Ayuda.Divisible(a, 5)) {
                                                                if (m > xo) {
                                                                    //cm = new CongruencialMixto(a, c, xo, m);
                                                                    //resultados.addAll(cm.generarCMixto());
                                                                    resultados.addAll(com.udec.simuladorpeaje.vista.Run.cg.congruencialMixto(a, c, xo, m));
                                                                    Ayuda.listar(resultados, jList1, jLabel6);
                                                                } else {
                                                                    JOptionPane.showMessageDialog(jPanel2, "m debe ser > xo");
                                                                }
                                                            } else {
                                                                JOptionPane.showMessageDialog(jPanel2, "a no puede ser divisible por 3 o 5");
                                                            }
                                                        } else {
                                                            JOptionPane.showMessageDialog(jPanel2, "semilla debe ser > 0");
                                                        }
                                                    } else {
                                                        JOptionPane.showMessageDialog(jPanel2, "c debe ser primo relativo de m ");
                                                    }
                                                } else {
                                                    JOptionPane.showMessageDialog(jPanel2, "a debe ser mayor 1 para producir una serie aleatoria");
                                                }
                                            } else {
                                                JOptionPane.showMessageDialog(jPanel2, "c mod 8 debe ser 5");
                                            }
                                        } else {
                                            JOptionPane.showMessageDialog(jPanel2, "a debe ser Impar");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(jPanel2, "El Modulo debe ser > a.");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(jPanel2, "a debe ser > c.");
                                }
                            } else {
                                JOptionPane.showMessageDialog(jPanel2, "c debe ser > 0.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(jPanel2, "El Modulo debe ser primo.");
                        }
                    } else {
                        // cm = new CongruencialMixto(a, c, xo, m);
                        //resultados.addAll(cm.generarCMixto());
                        resultados.addAll(com.udec.simuladorpeaje.vista.Run.cg.congruencialMixto(a, c, xo, m));
                        Ayuda.listar(resultados, jList1, jLabel6);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Llene todos los campos", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
                Ayuda.habilitarb(resultados, JBpromedios, JBfrecuencias, JBdistancias, JBkolgomorov, JBpoker, JBcorridas1, JBcorridas2, JBseries);
                break;
        }
    }//GEN-LAST:event_JBgenerarActionPerformed

    private void JTaditivaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTaditivaKeyTyped
        this.soloNumero(evt);
    }//GEN-LAST:event_JTaditivaKeyTyped

    private void JTmultiplicadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTmultiplicadorKeyTyped
        this.soloNumero(evt);
    }//GEN-LAST:event_JTmultiplicadorKeyTyped

    private void JTsemillaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTsemillaKeyTyped
        this.soloNumero(evt);
    }//GEN-LAST:event_JTsemillaKeyTyped

    private void JTmoduloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTmoduloKeyTyped
        this.soloNumero(evt);
    }//GEN-LAST:event_JTmoduloKeyTyped

    private void JTaditivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTaditivaActionPerformed

    }//GEN-LAST:event_JTaditivaActionPerformed

    private void soloNumero(java.awt.event.KeyEvent evt) {
        char caracter = evt.getKeyChar();
        if (!(Character.isDigit(caracter)) && (caracter != KeyEvent.VK_BACK_SPACE) && (caracter != KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }

    private boolean compruebaLista() {
        if (resultados.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
            return false;
        }
        return true;
    }

    /**
     *
     * @return
     */
    public String nombre() {
        return JLnombre.getText();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBcorridas1;
    private javax.swing.JButton JBcorridas2;
    private javax.swing.JButton JBdistancias;
    private javax.swing.JButton JBfrecuencias;
    private javax.swing.JButton JBgenerar;
    private javax.swing.JButton JBguardar;
    private javax.swing.JButton JBkolgomorov;
    private javax.swing.JButton JBpoker;
    private javax.swing.JButton JBpromedios;
    private javax.swing.JButton JBseries;
    private javax.swing.JCheckBox JCBvalida;
    private javax.swing.JLabel JLcorridas1;
    private javax.swing.JLabel JLcorridas2;
    private javax.swing.JLabel JLdistancias;
    private javax.swing.JLabel JLfrecuencias;
    private javax.swing.JLabel JLkolgomorov;
    private javax.swing.JLabel JLnombre;
    private javax.swing.JLabel JLpoker;
    private javax.swing.JLabel JLpromedio;
    private javax.swing.JLabel JLseries;
    private javax.swing.JPanel JPencabezado;
    private javax.swing.JPanel JPnumerosgenerados;
    private javax.swing.JPanel JPpruebas;
    private javax.swing.JPanel JPvariables;
    private javax.swing.JTextField JTaditiva;
    private javax.swing.JTextField JTmodulo;
    private javax.swing.JTextField JTmultiplicador;
    private javax.swing.JTextField JTsemilla;
    private javax.swing.JButton LBlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList jList1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
