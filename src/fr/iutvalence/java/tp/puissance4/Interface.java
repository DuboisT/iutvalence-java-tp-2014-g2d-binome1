package fr.iutvalence.java.tp.puissance4;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.GridLayout;
import java.io.File;

public class Interface
{
	
	    public static void main(String[] arg) {	
		JFrame cadre = new javax.swing.JFrame("Puissance 4"); // Donne le nom affiché dans la barre du haut de la fenêtre
		JPanel Grille = new JPanel (new GridLayout (6,7)); // Defini les dimensions de Grille et son nombre de cases
		for(int i = 0; i<42;i++){
			   Grille.add(new JLabel(new ImageIcon("image/CaseVide.png")));
			}
		Grille.setPreferredSize(new Dimension(728, 610)); // dimension de la fenêtre
		Grille.setBackground(Color.WHITE); // couleur de fond blanche
		cadre.setContentPane(Grille); // Défini Grille comme le containeur de la fenêtre
		cadre.setLocation(300, 150); // La fenêtre s'affiche sur l'écran à ces coordonnées
		cadre.pack();// Dimensionne la fenêtre automatiquement
		cadre.setVisible(true); // rend la fenêtre visible
		cadre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Permet de quitter le programme a la fermeture de la fenêtre
		
	    }
}

