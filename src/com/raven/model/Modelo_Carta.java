
package com.raven.model;

import javax.swing.Icon;


public class Modelo_Carta {
    Icon icon;
    String title;
    String values;
    String description;

    public Modelo_Carta(Icon icon, String title, String values, String description) {
        this.icon = icon;
        this.title = title;
        this.values = values;
        this.description = description;
    }

    public Icon getIcon() {
        return icon;
    }

    public String getTitle() {
        return title;
    }

    public String getValues() {
        return values;
    }

    public String getDescription() {
        return description;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setValues(String values) {
        this.values = values;
    }

    public void setDescription(String description) {
        this.description = description;
    }
     public Modelo_Carta(){
         
     }
}
