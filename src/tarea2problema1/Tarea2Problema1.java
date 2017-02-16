/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2problema1;
import java.util.Scanner;
/**
 *
 * @author danii
 */
public class Tarea2Problema1 {
    /**
     * Johanna Daniela Macias Martinez
     * A01411534
     * IIS
     */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double pago=0;
       pago=(Pedirdatos()+(he()*cate()));
        resultado(pago);
        }

    
    static double Pedirdatos(){
        Scanner key= new Scanner (System.in);
        double sue=0;
        boolean flag = true;
        while (flag==true){
        try{
        System.out.println("Escribe tu sueldo: ");
        sue=key.nextDouble();
        flag=false;
        
        }
        catch(Exception e){
            System.out.println("No tecleaste un número");
            key.next();
            flag=true;
        }
        }
        return sue;
    }
    static int he ()
    {
        Scanner key= new Scanner (System.in);
        int he=0;
        boolean flag=true;
        while(flag==true){
            try{
        
        System.out.println("Horas extras trabajadas: ");
        he= key.nextInt();
            flag=false;
            }
            catch(Exception e)
            {
                System.out.println("No tecleo un número entero");
                key.next();
                flag=true;
            }
        }
        return he;
    }
    static void resultado(double a){
        System.out.println("El resultado es: "+a);
    }
    
    static double cate(){
    Scanner key= new Scanner (System.in);
    int cate = 0;
    double precio = 0;
    boolean flag=true;
    while (flag==true){
    try{
        System.out.println("Elige una categoría");
        System.out.println("1,2,3,4,5,6,7,8");
        cate=key.nextInt();
        
        if (cate==1){ precio=30;}
        else if (cate==2){ precio=38;}
        else if (cate==3){ precio=50;}
        else if (cate==4){ precio=70;}
        else if (cate==5){ precio=102;}//Inventé los valores, puesto que no los da
        else if (cate==6){ precio=154;}
        else if (cate==7){ precio=238;}
        else if (cate==8){ precio=371;}
        else {System.out.println("Error"); }
        flag=false;
    }
        catch(Exception e)
    {System.out.println("Tecleaste un valor que no es entero");
    key.next();
    flag=true;
    }
    }
        return precio;
    }
    
        
    }
    

