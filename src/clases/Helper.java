/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SP
 */
public class Helper {

    public static void recorrido(Component ventana, String mensaje, int tipo) {
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, mensaje, "Advertencia", JOptionPane.WARNING_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(ventana, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
                break;

        }
    }

    public static void limpiadoTabla(JTable tabla1) {
        int numfilas, numcolumnas;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                tabla1.setValueAt("", i, j);
            }
        }
    }

    public static void porDefectoTabla(JTable tabla1) {
        DefaultTableModel tm;

        tm = (DefaultTableModel) tabla1.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);
    }

    public static void habilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);
        }
    }

    public static void deshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static int[][] pasoDeDatos(JTable tabla1) {
        int numfilas, numcolumnas;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        int m[][] = new int[numfilas][numcolumnas];

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {

                m[i][j] = (int) tabla1.getValueAt(i, j);
            }

        }
        return m;

    }

    public static String recorridoHaciaArriba(int[][] m, int j) {
        int numfilas = m.length;

        String aux = "";

        for (int i = numfilas - 1; i >= 0; i--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaArriba(int[][] m, int j, int inicio, int fin) {

        String aux = "";

        for (int i = inicio; i >= fin; i--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaAbajo(int[][] m, int j) {
        int numfilas = m.length;

        String aux = "";

        for (int i = 0; i <= numfilas; i++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaAbajo(int[][] m, int j, int inicio, int fin) {

        String aux = "";

        for (int i = inicio; i <= fin; i++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaIzquierda(int[][] m, int i) {
        int numcolumnas = m[0].length;

        String aux = "";

        for (int j = numcolumnas - 1; j >= 0; j--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaIzquierda(int[][] m, int i, int inicio, int fin) {

        String aux = "";

        for (int j = inicio; j >= fin; j--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaDerecha(int[][] m, int i) {
        int numcolumnas = m[0].length;

        String aux = "";

        for (int j = 0; j <= numcolumnas; j++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static String recorridoHaciaDerecha(int[][] m, int i, int inicio, int fin) {

        String aux = "";

        for (int j = inicio; j <= fin; j++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;

    }

    public static void diagonalPrincipal(JTable tabla1, JTable tabla2) {
        int numfilas, numcolumnas, aux;

        numcolumnas = tabla1.getColumnCount();
        numfilas = tabla1.getRowCount();

        for (int i = 0; i < numfilas; i++) {
            for (int j = 0; j < numcolumnas; j++) {
                aux = (int) tabla1.getValueAt(i, j);
                if (i == j) {
                    tabla2.setValueAt(aux, i, j);
                }
            }

        }
    }

    public static String diagonalPrincipalHaciaAbajo(int[][] m) {
        int numfilas = m.length;

        String aux = "";

        for (int i = 0; i < numfilas; i++) {
            aux = aux + m[i][i] + ", ";

        }
        return aux;

    }

    public static String diagonalPrincipalHaciaAbajo(int[][] m, int inicio, int fin) {

        String aux = "";

        for (int i = inicio; i <= fin; i++) {
            aux = aux + m[i][i] + ", ";

        }
        return aux;

    }

    public static String diagonalPrincipalHaciaArriba(int[][] m) {
        int numfilas = m.length;

        String aux = "";

        for (int i = numfilas - 1; i >= 0; i--) {
            aux = aux + m[i][i] + ", ";

        }
        return aux;

    }

    public static String diagonalPrincipalHaciaArriba(int[][] m, int inicio, int fin) {
        int numfilas = m.length;

        String aux = "";

        for (int i = inicio; i >= fin; i--) {
            aux = aux + m[i][i] + ", ";

        }
        return aux;

    }

    public static String diagonalSecundariaHaciaAbajo(int[][] m) {
        int numfilas = m.length;
        int numcolumnas = m[0].length;

        String aux = "";

        for (int i = 0; i < numfilas; i++) {
            aux = aux + m[i][numcolumnas - 1 - i] + ", ";

        }
        return aux;

    }

    public static String diagonalSecundariaHaciaAbajo(int[][] m, int inicio, int fin) {

        int numcolumnas = m[0].length;

        String aux = "";

        for (int i = inicio; i <= fin; i++) {
            aux = aux + m[i][numcolumnas - 1 - i] + ", ";

        }
        return aux;

    }

    public static String diagonalSecundariaHaciaArriba(int[][] m) {
        int numfilas = m.length;
        int numcolumnas = m[0].length;

        String aux = "";

        for (int i = numfilas - 1; i >= 0; i--) {
            aux = aux + m[i][numcolumnas - 1 - i] + ", ";

        }
        return aux;

    }

    public static String diagonalSecundariaHaciaArriba(int[][] m, int inicio, int fin) {

        int nc = m[0].length;

        String aux = "";

        for (int i = inicio; i >= fin; i--) {
            aux = aux + m[i][nc - 1 - i] + ", ";

        }
        return aux;

    }

    public static String recorridosCamellables(int[][] m) {
        String aux = "";

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                aux = aux + m[i][j] + " ";

            }
            aux = aux + "\n";

        }
        return aux;

    }

    public static String recorridoLinealUno(JTable tabla) {
        int m[][] = pasoDeDatos(tabla);
        int numfilas = m.length;
        int numcolumnas = m[0].length;

        String aux = "";

        aux = aux + Helper.recorridoHaciaDerecha(m, 0, 0, numcolumnas - 1);
        aux = aux + Helper.recorridoHaciaAbajo(m, numcolumnas - 1, 1, numcolumnas / 2);
        aux = aux + Helper.recorridoHaciaIzquierda(m, numfilas / 2, numcolumnas - 2, 0);
        aux = aux + Helper.recorridoHaciaAbajo(m, 0, numfilas / 2 + 1, numfilas - 1);
        aux = aux + Helper.recorridoHaciaDerecha(m, numfilas - 1, 0 + 1, numcolumnas - 1);

        aux = aux.substring(0, aux.length() - 2) + ".";
        return aux;
    }

    public static String recorridoLinealDos(JTable tabla) {
        int m[][] = pasoDeDatos(tabla);
        int numfilas = m.length;
        int numcolumnas = m[0].length;

        String aux = "";

        aux = aux + Helper.recorridoHaciaArriba(m, 0, numfilas - 1, 1);
        aux = aux + Helper.recorridoHaciaDerecha(m, 0, 0, numcolumnas / 2);
        aux = aux + Helper.recorridoHaciaAbajo(m, numcolumnas / 2, 1, numfilas - 2);
        aux = aux + Helper.recorridoHaciaDerecha(m, numfilas - 1, numcolumnas / 2, numcolumnas - 1);
        aux = aux + Helper.recorridoHaciaArriba(m, numcolumnas - 1, numfilas - 2, 0);

        aux = aux.substring(0, aux.length() - 2) + ".";
        return aux;
    } 
    public static String laberintoDeCaracol(JTable tabla) {
        int m[][] = pasoDeDatos(tabla);
        int numfilas = m.length;
        int numcolumnas = m[0].length;                        
        
        String aux = "";
        
        aux = aux + Helper.recorridoHaciaDerecha(m, numfilas/2, numcolumnas/2, (numcolumnas/2+1));
        aux = aux + Helper.recorridoHaciaAbajo(m, (numcolumnas/2+1), numfilas/2+1, numfilas/2+1);
        aux = aux + Helper.recorridoHaciaIzquierda(m, (numfilas/2+1), numcolumnas/2, (numcolumnas/2-1));
        aux = aux + Helper.recorridoHaciaArriba(m, numcolumnas/2-1, numfilas/2, numfilas/2-1);
        aux = aux + Helper.recorridoHaciaDerecha(m, numfilas/2-1, numcolumnas/2, numcolumnas-1);
        aux = aux + Helper.recorridoHaciaAbajo(m, numcolumnas-1, numfilas/2, numfilas-1);
        aux = aux + Helper.recorridoHaciaIzquierda(m, numfilas-1, numcolumnas/2+1, 0);
        aux = aux + Helper.recorridoHaciaArriba(m, 0, numfilas/2+1, 0);
        aux = aux + Helper.recorridoHaciaDerecha(m, 0, numcolumnas/2-1, numcolumnas-1);
        

        aux = aux.substring(0, aux.length() - 2) + ".";
        return aux;
    }

    public static String recorridoLetraZ(JTable tabla) {
        int m[][] = pasoDeDatos(tabla);
        int numfilas = m.length;
        int numcolumnas = m[0].length;

        String aux = "";

        aux = aux + Helper.recorridoHaciaDerecha(m, 0, 0, numcolumnas - 2);
        aux = aux + Helper.diagonalSecundariaHaciaAbajo(m, 0, numfilas - 2);
        aux = aux + Helper.recorridoHaciaDerecha(m, numfilas - 1, 0, numcolumnas - 1);

        aux = aux.substring(0, aux.length() - 2) + ".";
        return aux;

    }

    public static String recorridoLetraM(JTable tabla) {
        int m[][] = pasoDeDatos(tabla);
        int numfilas = m.length;
        int numcolumnas = m[0].length;

        String aux = "";

        aux = aux + Helper.recorridoHaciaArriba(m, 0, numfilas - 1, 1);
        aux = aux + Helper.diagonalPrincipalHaciaAbajo(m, 0, numfilas / 2);
        aux = aux + Helper.diagonalSecundariaHaciaArriba(m, numfilas / 2 - 1, 0 + 1);
        aux = aux + Helper.recorridoHaciaAbajo(m, numcolumnas - 1, 0, numfilas - 1);

        aux = aux.substring(0, aux.length() - 2) + ".";
        return aux;
    }
}
