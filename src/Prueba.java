/**
 * Proyecto 2 de la Materia Estructuras de Datos
 * Simula el sistema de captura de estudiantes
 * @author Erick Iram García Velasco
 */

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.util.Hashtable;
import java.util.InputMismatchException;
import javax.swing.*;
import javax.swing.JFrame;

public class Prueba extends JFrame{

    static int n18 = 0;
    static int n19 = 0;
    static int n20 = 0;
    static int n21 = 0;
    static int n22 = 0;
    static int n23 = 0;
    static int n24 = 0;
    static int n25 = 0;

    static int edades[] = new int[8];
    static String edadesNum[] = {"18","19","20","21","22","23","24","25"};
    
    public static void main(String[] args){  

    //Llenamos el arreglo con ceros
    for(int i = 0; i <= 7; i++){
        edades[i] = 0;
    }


    Hashtable<Integer,Integer> alumnos = new Hashtable<Integer, Integer>();  

    Arbol arbolAlumnos = new Arbol();

    JFrame frame = new JFrame();
    ImageIcon sorpresa = new ImageIcon("imagen2.jpeg");
    ImageIcon exito = new ImageIcon("imagen4.jpeg");
    ImageIcon casi = new ImageIcon("imagen5.jpg");
    ImageIcon uwu = new ImageIcon("uwu.png");

    String menu = "¿Qué deseas hacer? \n \n 1. Registrar alumno \n 2. Mostrar distribución de alumnos por edades \n 3. Mostrar gráfica ordenada por edades \n 4. Imprimir árbol de alumnos \n 5. Salir \n";
    boolean salir = false;

    while(!salir){

        //Se usa un bloque try catch para cuando se introducen datos inválidos
        try{

            String opcion1 = (String)JOptionPane.showInputDialog(null, menu, "Escribe el número de una opción");

            int opcionTrue = Integer.parseInt(opcion1);

            switch(opcionTrue){
                //Registar alumno
                case 1:

                    //Solicita el número de cuenta y verifica que sea válido
                    String cuenta = (String)JOptionPane.showInputDialog(null,"Escribe el número de cuenta del alumno");
                    int numCuenta = Integer.parseInt(cuenta);
                    if(numCuenta < 300000000 || numCuenta > 500000000){ 
                        JOptionPane.showMessageDialog(frame,"Introduce un número de cuenta válido", "Advertencia", JOptionPane.INFORMATION_MESSAGE,sorpresa);
                        break;
                    } 
                    
                    //Solicita la edad y verifica que sea válida
                    String edad = (String)JOptionPane.showInputDialog(null, "Escribe la edad del alumno");
                    int edadTrue = Integer.parseInt(edad);

                    //Agrega la cantidad de alumnos de cada edad a un arreglo para después mostrar la gráfica ordenada
                    if(edadTrue == 18){
                        n18 += 1;
                        edades[0]=n18;
                    }else if (edadTrue == 19){
                        n19 +=1;
                        edades[1]=n19;
                    }else if (edadTrue == 20){
                        n20 +=1;
                        edades[2]=n20;
                    }else if (edadTrue == 21){
                        n21 +=1;
                        edades[3]=n21;
                    }else if (edadTrue == 22){
                        n22 +=1;
                        edades[4]=n22;
                    }else if (edadTrue == 23){
                        n23 +=1;
                        edades[5]=n23;
                    }else if (edadTrue == 24){
                        n24 +=1;
                        edades[6]=n24;
                    }else if (edadTrue == 25){
                        n25 +=1;
                        edades[7]=n25;
                    }
                    
                    if(edadTrue < 18 || edadTrue > 25){ 
                        JOptionPane.showMessageDialog(frame,"Introduce una edad válida", "Advertencia", JOptionPane.INFORMATION_MESSAGE,sorpresa);
                        break;
                    } 
                    
                    //Agrega el alumno a la tabla hash y al árbol
                    alumnos.put(numCuenta, edadTrue);
                    arbolAlumnos.insertarNodo(numCuenta);
                    JOptionPane.showMessageDialog(null,"El alumno se registró con éxito","Aviso", JOptionPane.INFORMATION_MESSAGE,exito);
                    break;
                    
                //Distribución de alumnos por edades
                case 2:
                    JFrame grafica = new JFrame();
                    Grafica panel = new Grafica();
                    grafica.add(panel);
                    grafica.setSize(500,600);
                    grafica.setVisible(true);

                    break;

                //Gráfica ordenada por edades
                case 3:
                    BubbleSort.bubble(edades,edadesNum);
                    JFrame grafica2 = new JFrame();
                    GraficaOrdenada panel2 = new GraficaOrdenada();
                    grafica2.add(panel2);
                    grafica2.setSize(500,600);
                    grafica2.setVisible(true);
                    break;

                //Imprimir árbol
                case 4:

                    FrameArbol menuFrame = new FrameArbol();
                    String arbol = arbolAlumnos.toString();
                    JOptionPane.showMessageDialog(menuFrame, arbol, "Arbol de alumnos", JOptionPane.INFORMATION_MESSAGE);
                    break;
                
                //Salir
                case 5:
                    salir = true;
                    break;

                default:
                JOptionPane.showMessageDialog(frame, "Ingresa una acción válida", "Adevertencia", JOptionPane.INFORMATION_MESSAGE);

            }
        
        } catch (Exception w) {
            JOptionPane.showMessageDialog(frame, "Introduce datos adecuados o una opción válida", "Adevertencia", JOptionPane.INFORMATION_MESSAGE,casi);
        }
    }

    JOptionPane.showMessageDialog(frame, "Gracias por usar el programa", "Aviso", JOptionPane.INFORMATION_MESSAGE,uwu);
    System.exit(0);
    }
    
}




