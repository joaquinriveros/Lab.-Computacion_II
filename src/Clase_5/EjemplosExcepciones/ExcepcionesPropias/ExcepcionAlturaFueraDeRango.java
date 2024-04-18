package Clase_5.EjemplosExcepciones.ExcepcionesPropias;

public class ExcepcionAlturaFueraDeRango extends Exception {
  public ExcepcionAlturaFueraDeRango() {
    System.out.println("ExcepcionAlturaFueraDeRango: La altura está fuera del rango permitido.");
  }
}
