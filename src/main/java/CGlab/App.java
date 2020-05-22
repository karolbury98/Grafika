package CGlab;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    String version = "0.02";

    public static void main(String[] args) {
        if(args.length<4){
            System.out.println("Proszę podać argumenty: ścieżkę, szerokość i wysokość oraz wybrany algorytm");
            return;
        }
        String dir = args[0];
        int w = Integer.parseInt(args[1]);
        int h = Integer.parseInt(args[2]);

        Renderer.LineAlgo line=null;
        if(args[3].equalsIgnoreCase("LINE_NAIVE"))
            line= Renderer.LineAlgo.NAIVE;

        Renderer mainRenderer = new Renderer(dir,w,h);
        mainRenderer.clear();
        mainRenderer.drawLine(100,100,300,300, line);
        try {
            mainRenderer.save();
        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getVersion() {
	return this.version;
    }
}
