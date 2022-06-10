package com.raven.model;


import javax.swing.Icon;

public class Model_Item {
    String Name;
    String Descrpcion;
    Icon image;
    String brandName;

    public Model_Item(String Name, String Descrpcion, Icon image, String brandName) {
        this.Name = Name;
        this.Descrpcion = Descrpcion;
        this.image = image;
        this.brandName = brandName;
    }
    public Model_Item(){
        
    }
    
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDescrpcion() {
        return Descrpcion;
    }

    public void setDescrpcion(String Descrpcion) {
        this.Descrpcion = Descrpcion;
    }

    public Icon getImage() {
        return image;
    }

    public void setImage(Icon image) {
        this.image = image;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
    
    
    
}
