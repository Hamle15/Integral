package com.raven.model;

import javax.swing.Icon;

public class Modelo_CartaProducto {

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Modelo_CartaProducto(Icon icon, String title, String description) {
        this.icon = icon;
        this.title = title;
        this.description = description;
    }

    public Modelo_CartaProducto() {
    }

    private Icon icon;
    private String title;
    private String description;
}
