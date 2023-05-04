/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nahuel
 */
public class Villanos extends Heroes{
    private int recompensa;
    private int cant_crimenes;
    private int cant_secuaces;
    public Villanos(int recompensa, int cant_crimenes, int cant_secuaces){
        super();
        this.recompensa = recompensa;
        this.cant_crimenes = cant_crimenes;
        this.cant_secuaces = cant_secuaces;
    }
    public String get_datosvil(){
        return "El super villano cometio "+this.cant_crimenes+" crimenes"
                +". Tiene una recompenza de $"+this.recompensa
                +". Tiene "+cant_secuaces+" secuaces";
    }
}
