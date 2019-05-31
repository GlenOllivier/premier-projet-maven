package dev;

import java.io.IOException;
import java.util.ResourceBundle;

import com.github.lalyos.jfiglet.FigletFont;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws IOException {
		String titre = ResourceBundle.getBundle("application").getString("titre");
		titre = FigletFont.convertOneLine(titre);
		System.out.println(titre);

		String environnement = ResourceBundle.getBundle("application").getString("environnement");
		System.out.println("Environnement : " + environnement);
	}
}
