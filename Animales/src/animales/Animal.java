package animales;


public abstract class Animal {
protected String sonido;
protected String alimentos;
protected String hábitat; 
protected String nombreCientífico;
public abstract String getNombreCientífico();
public abstract String getSonido();
public abstract String getAlimentos();

    String getHábitat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 } 