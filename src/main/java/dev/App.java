package dev;

import java.io.IOException;

import com.github.lalyos.jfiglet.FigletFont;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        String titre = FigletFont.convertOneLine("Premier projet Maven");
        System.out.println( titre );
    }
}
