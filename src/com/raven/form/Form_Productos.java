/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.raven.form;

import com.raven.component.Carta;
import com.raven.component.CartaProducto;
import com.raven.model.Modelo_Carta;
import com.raven.model.Modelo_CartaProducto;
import com.raven.swing.ScrollBar;
import com.raven.swing.WrapLayout;
import javax.swing.ImageIcon;


public class Form_Productos extends javax.swing.JPanel {

    
    public Form_Productos() {
        initComponents();
        init();
    }
    
    private void init(){
        //instcias para crear los productos con animacion
        panelProductos.setLayout(new WrapLayout(WrapLayout.LEADING));
        jScrollPane1.setVerticalScrollBar(new ScrollBar());
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/Granola Coco.jpg")), "Coco", "Hojuelas de cebada, coco acaramelado (14.5%), hojuelas de avena, uvas pasas, miel de caña, aceite vegetal, hojuelas de maíz natural, salvado de trigo, harina de soya, cereal de arroz, ajonjolí, sabor artificial de coco y sal. Contiene gluten y soya.")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/Granola Light.jpg")),"Ligth","Hojuelas de cebada, hojuelas de avena, hojuelas de maíz natural, cereal de arroz crocante, almendras, harina de soya,\n" +
"\n" +
"salvado de trigo, aceite vegetal, ajonjolí descortezado, sabor artificial a coco, sal, color caramelo simple, edulcorante artificial (sucralosa), antioxidante natural (extracto de romero). Contiene gluten, almendras, ajonjoli y soya. Puede contener trazas de maní y nueces.")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/Granola Vainilla.jpg")),"Vainilla","Hojuelas de cebada, hojuelas de avena, uvas pasas, miel de caña, maní, aceite vegetal, nueces, harina de soya, salvado de trigo, ajonjolí, sabor artificial a vainilla, sal, antioxidante natural (extracto de romero). Contiene gluten, soya, nueces y maní. Puede contener trazas de almendras.")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/Granola Almendras y semilla.jpg")),"Almendras","Hojuelas de avena, hojuelas de cebada, azúcar, hojuelas de maíz, (maíz, azúcar, sal, extracto de malta, antioxidante (lecitina de soya)), aceite vegetal refinado, cereal de arroz natural (grits de arroz, grits de maíz, azúcar, glucosa, color caramelo, extracto de malta, sabor artificial a malta, sal, color pardo chocolate ")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/Granola Frutos Rojos.jpg")),"Frutos Rojos","Hojuelas de avena, hojuelas de cebada, azúcar, hojuelas de maíz (maíz, azúcar, sal, extracto de malta, antioxidante (lecitina de soya)), aceite vegetal refinado, cereal de arroz natural (grits de arroz, grits de maíz, azúcar, glucosa, color caramelo, extracto de malta, sabor artificial a malta, sal, color pardo chocolate")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/Granola Manzana y nuezes.jpg")),"Manzana","Hojuelas de avena, hojuelas de cebada, azúcar, hojuelas de maíz (maíz, azúcar, sal, extracto de malta, antioxidante (lecitina de soya)), aceite vegetal refinado, cereal de arroz natural (grits de arroz, grits de maíz, azúcar, glucosa, color caramelo, extracto de malta, sabor artificial a malta, sal, color pardo chocolate")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/Muesli.jpg")),"Muesli","Hojuelas de cebada, hojuelas de avena, miel de caña, aceite vegetal, leche en polvo, harina de soya, sabor artificial a de fresa, uvas pasas, hojuelas de maíz, cereal de arroz natural, piña deshidratada, mango deshidratado, extracto de malta, sal. Contiene gluten, soya, lácteos. Puede contener trazas de nueces y maní.")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/Granola Chocolate.jpg")),"Chocolate","Granola con sabor a chocolate")));
        
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/Granola Clasica.png")),"Vanilla C","Lo mismo que la granola de vainilla pero en una forma mas economica")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/Granola Coco C.jpg")),"Coco C","Lo mismo que la granola de coco pero en una version mas economica")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/tradicional.jpg")),"Tradicional","Ahora puedes disfurtarla con el sabor original")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/sucaricos.jpg")),"SucaRicos","Hojuelas de Maiz azucaradas para te acompañen en tu desayuno")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/RikyRicos.jpg")),"RikyRicos","Hojuelas de Maiz naturales para tus desayunos diarios")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/anillos.jpg")),"Anillos","Mezcla de cereales [maíz (mín. 21 %), trigo (mín. 17 %), avena (mín. 11 %)], azúcar, aceite vegetal, sal yodada, colorantes (amarillo no. 6, cúrcuma, rojo no. 40, rojo no. 3, azul no. 1), leudante (bicarbonato de sodio), maltodextrina, esencias naturales de frutas, extracto vegetal.")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/negro.jpg")),"ChocoFlupis","Cerral de arroz Achocoltado perfeto para tus hijos en el dia a dia")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/kokomiel.jpg")),"ChocoFlupis","Aritos endulsados pero a la vez saludables")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/N.jpg")),"Hojuela Natural","Hojuelas de maiz extruida, mucho mas natural que los KikyRicos")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/vita.jpg")),"VitaAvena Fresa","VitaAvena de Fresa y sin azucar, perfecto para acompañar tus comidas")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/avena.jpg")),"VitaAvena Vanilla","VitaAvena de Vainilla y sin azucar, perfecto para acompañar tus comidas")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/canada.jpg")),"VitaAvena Canadiense","VitaAvena Canadiense, perfecto para acompañar tus comidas")));
        panelProductos.add(new CartaProducto(new Modelo_CartaProducto(new ImageIcon(getClass().getResource("/com/raven/image/cebada.jpg")),"Cebada","VitaAvena cebada, perfecto para hacer tus avenas")));
        
        
        

        

        

        


        

        
        panelProductos.revalidate();
        panelProductos.repaint();
        
       
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        panelProductos = new javax.swing.JPanel();

        setOpaque(false);

        jScrollPane1.setBorder(null);

        panelProductos.setBackground(new java.awt.Color(238, 238, 238));

        javax.swing.GroupLayout panelProductosLayout = new javax.swing.GroupLayout(panelProductos);
        panelProductos.setLayout(panelProductosLayout);
        panelProductosLayout.setHorizontalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 990, Short.MAX_VALUE)
        );
        panelProductosLayout.setVerticalGroup(
            panelProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 451, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(panelProductos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 810, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelProductos;
    // End of variables declaration//GEN-END:variables
}
