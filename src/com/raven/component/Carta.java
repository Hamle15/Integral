
package com.raven.component;

import com.raven.model.Modelo_Carta;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;


public class Carta extends javax.swing.JPanel {
    private Color color1;
    private Color color2;

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
    }

    public Carta(Color color1, Color color2, JLabel lbdescripsion, JLabel lblicon, JLabel lbtitulo, JLabel lbvalores) {
        this.color1 = color1;
        this.color2 = color2;
        this.lbdescripsion = lbdescripsion;
        this.lblicon = lblicon;
        this.lbtitulo = lbtitulo;
        this.lbvalores = lbvalores;
    }
    
    

    
    public Carta() {
        initComponents();
        setOpaque(false);
        color1=Color.BLACK;
        color2 = Color.WHITE;
    }
    public void setData(Modelo_Carta data){
        lblicon.setIcon(data.getIcon());
        lbtitulo.setText(data.getTitle());
        lbvalores.setText(data.getValues());
        lbdescripsion.setText(data.getDescription());
        
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblicon = new javax.swing.JLabel();
        lbdescripsion = new javax.swing.JLabel();
        lbvalores = new javax.swing.JLabel();
        lbtitulo = new javax.swing.JLabel();

        lblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/stock.png"))); // NOI18N

        lbdescripsion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbdescripsion.setForeground(new java.awt.Color(255, 255, 255));
        lbdescripsion.setText("Descripcion");

        lbvalores.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbvalores.setForeground(new java.awt.Color(255, 255, 255));
        lbvalores.setText("Valores");

        lbtitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbtitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbtitulo.setText("Titulo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbdescripsion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbtitulo)
                            .addComponent(lbvalores)
                            .addComponent(lblicon))
                        .addGap(0, 263, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbtitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbvalores)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbdescripsion)
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    protected void paintComponent(Graphics grphics) {
        Graphics2D g2 = (Graphics2D) grphics;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, color1, 0, getHeight(), color2 );
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
        g2.setColor(new Color(255,255,255,50));
        g2.fillOval(getWidth()-(getHeight()/2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth()-(getHeight()/2)-20,getHeight()/2+20,getHeight(), getHeight());
        super.paintComponent(grphics); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbdescripsion;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lbtitulo;
    private javax.swing.JLabel lbvalores;
    // End of variables declaration//GEN-END:variables
}
