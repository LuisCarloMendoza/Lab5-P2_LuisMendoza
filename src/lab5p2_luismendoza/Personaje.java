/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5p2_luismendoza;

/**
 *
 * @author luiscarlomendoza
 */
public class Personaje {
    
    public String nombre;
    public String poder;
    public String debilidad;
    public String universo;
    public int fuerza;
    public int agilidadFisica;
    public int agilidadMental;
    public int vida;

    public Personaje() {
    }

    public Personaje(String nombre, String poder, String debilidad, String universo, int fuerza, int agilidadFisica, int agilidadMental, int vida) {
        this.nombre = nombre;
        this.poder = poder;
        this.debilidad = debilidad;
        this.universo = universo;
        this.fuerza = fuerza;
        this.agilidadFisica = agilidadFisica;
        this.agilidadMental = agilidadMental;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPoder() {
        return poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getAgilidadFisica() {
        return agilidadFisica;
    }

    public void setAgilidadFisica(int agilidadFisica) {
        this.agilidadFisica = agilidadFisica;
    }

    public int getAgilidadMental() {
        return agilidadMental;
    }

    public void setAgilidadMental(int agilidadMental) {
        this.agilidadMental = agilidadMental;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
