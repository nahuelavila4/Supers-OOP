/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nahuel
 */
public class Marvel {
    public static void main(String[] args) {
        //Hacer App Supers como en la peli Los Increibles
        Heroes heroe1 = new Heroes();
        Villanos villano1 = new Villanos(33000, 61, 258);
        heroe1.set_rayolazer("si");
        heroe1.set_superfuerza("si");
        System.out.println(heroe1.get_datos());
        System.out.println(heroe1.get_rayolaser());
        System.out.println(heroe1.get_superfuerza());
        System.out.println(villano1.get_datos());
        System.out.println(villano1.get_datosvil());
        System.out.println("Hola");
        
    }
}
