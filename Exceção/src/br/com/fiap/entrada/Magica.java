package br.com.fiap.entrada;

import javax.swing.JOptionPane;

public class Magica {
	
	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg).toUpperCase();
	}
	public static int i(String msg) {
		return Integer.parseInt(texto(msg)); 
	} 
	public static double d(String msg) {
		return Double.parseDouble(texto(msg));
	}
}
