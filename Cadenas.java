/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

/**
 *
 * @author Alan_
 */
public class Cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Alan Isaac");
        java.lang.String s1 = "Hola";
        java.lang.String s2 = "!!!!!";
        s1 = s1 + "Mundo" + s2;
        System.out.println(s1);

        System.out.println("*******************************");
        s1 = s1.concat("ISC");
        System.out.println(s1);

        System.out.println("*******************************");
        java.lang.String UNI = "University";
        for (int i = 0; i < 10; i++) {
            s1 = s1 + UNI.charAt(i);
        }
        System.out.println(s1);
        System.out.println("*******************************");
        char cad[] = {'j', 'a', 'v', 'a'};
        for (int i = 0; i < 4; i++) {
            s1 = s1 + cad[i];
        }
        System.out.println("s1");
        System.out.println("*******************************");
        for (int i = 0; i < s1.length(); i++) {
            System.out.println(s1.charAt(i));
        }
        System.out.println("*******************************");
        char letra;
        letra = s1.charAt(0);
        System.out.println(letra);
        System.out.println("*******************************");
        System.out.println("No es posibles cambiar un caracter existente" + " en un String");
        System.out.println("*******************************");
        char cadena[] = s1.toCharArray();
        for (int i = 0; i < cad.length; i++) {
            System.out.println(cad[i] + "-");
        }
        System.out.println("");
        System.out.println("*******************************");
        cadena[0] = 'H';
        cadena[cadena.length - 1] = 'V';
        System.out.println(cadena);
        System.out.println("*******************************");
        s1 = new String(cadena);
        System.out.println(s1);
        String Nueva;
        Nueva = new String(cadena);
        System.out.println(Nueva);
        String otra;
        otra = String.valueOf(cadena);
        System.out.println(otra);
        System.out.println("*******************************");
        java.lang.String cad1 = "hola";
        java.lang.String cad2 = "hola";
        if (cad1 == cad2) {
            if (cad1.equals(cad2)) {
                System.out.println("Cadenas Iguales");
            } else {
                System.out.println("Cadenas Distintas");
            }
            System.out.println("*******************************");
            if (cad1.charAt(0) == cad2.charAt(0)) {
                System.out.println("Cadenas Iguales");
            } else {
                System.out.println("Cadenas Distintas");
            }
            System.out.println("*******************************");
            if (cad1.charAt(0) == cad2.charAt(0)) {
                System.out.println("Cadenas Iguales");
            } else {
                System.out.println("Cadenas Distintas");
            }
        }
    }
}
