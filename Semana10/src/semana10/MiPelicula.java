/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana10;


public class MiPelicula {
   
    private String Nombre, Genero;
    private int Year,Precio;

    public MiPelicula(String Nombre, String Genero, int Year, int Precio) {
        this.Nombre = Nombre;
        this.Genero = Genero;
        this.Year = Year;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getGenero() {
        return Genero;
    }

    public int getYear() {
        return Year;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
    
    @Override
    public String toString() {
        return "El nombre de la peli es: " + Nombre + "\nEl genero es :" + Genero + "\nEl anio de lanzamiento es :" + Year + "\nEl precio es de: " + Precio ;
    }
}
