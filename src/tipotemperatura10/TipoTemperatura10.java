/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tipotemperatura10;
/**
 * @author juanse
 * fecha: viernes 05 de septiembre de 2025
 * Requerimientos: Ingresar una temperatura y clasificarlo como muy fria, fria, agradable, calurosa o muy calusora
 */
import javax.swing.JOptionPane;
public class TipoTemperatura10 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int grados = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una temperatura"));
        if (grados>50) {
            JOptionPane.showMessageDialog(null, "Temperatura muy calusosa");
        } else if (grados>30) {
            JOptionPane.showMessageDialog(null, "Temperatura calurosa");
        } else if (grados>15) {
            JOptionPane.showMessageDialog(null, "Temperatura agradable");
        } else if (grados > -5) {
            JOptionPane.showMessageDialog(null, "Temperatura fria");
        } else {
            JOptionPane.showMessageDialog(null, "Temperatura muy fria");
        }
    }
}
