/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nahuel
 */
public class Heroes {
    private int nivelpoder;
    private int niveldefensa;
    private int edad;
    private int peso;
    private boolean rayolaser, superfuerza;
    public Heroes(){
        nivelpoder = 100;
        niveldefensa = 100;
        edad = 30;
        peso = 70;
    }
    public String get_datos(){
        return "Datos del sujeto. "
                + "Nivel de poder: "+nivelpoder
                +". Nivel de defensa: "+niveldefensa
                +". Edad :"+edad
                +". Peso: "+peso;
    }
    
    public void set_rayolazer(String rayolaser){
        if(rayolaser == "si"){
            this.rayolaser = true;
        }else{
            this.rayolaser = false;
        }
    }
    public void set_superfuerza(String superfuerza){
        if(superfuerza == "si"){
            this.superfuerza = true;
        }else{
            this.superfuerza = false;
        }
    }
    public String get_rayolaser(){
        if(this.rayolaser){
            return "El superheroe tiene rayos laser";
        }else{
            return "El superheroe no tiene rayos laser";
        }
    }
    public String get_superfuerza(){
        if(this.superfuerza){
            return "El superheroe tiene super fuerza";
        }else{
            return "El superheroe no tiene super fuerza";
        }
    }
    
}
