package CGlab;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    String version = "0.02";

    public static void main(String[] args) {
        if(args.length<3){
            System.out.println("Proszę podać argumenty: ścieżkę, szerokość i wysokość");
            return;
        }
        String dir = args[0];
        int w = Integer.parseInt(args[1]);
        int h = Integer.parseInt(args[2]);

      //  Renderer.LineAlgo line=null;
      //  if(args[3].equalsIgnoreCase("LINE_NAIVE"))
      //      line= Renderer.LineAlgo.NAIVE;

        Renderer mainRenderer = new Renderer(dir,w,h);
        mainRenderer.clear();
        mainRenderer.drawLine(200,200,400,400, Renderer.LineAlgo.BRESENHAM_INT);
        mainRenderer.drawLine(200,200,400,200, Renderer.LineAlgo.BRESENHAM_INT);
        mainRenderer.drawLine(200,200,400,0, Renderer.LineAlgo.BRESENHAM_INT);
        mainRenderer.drawLine(200,200,200,0, Renderer.LineAlgo.BRESENHAM_INT);
        mainRenderer.drawLine(200,200,0,0, Renderer.LineAlgo.BRESENHAM_INT);
        mainRenderer.drawLine(200,200,0,200, Renderer.LineAlgo.BRESENHAM_INT);
        mainRenderer.drawLine(200,200,0,400, Renderer.LineAlgo.BRESENHAM_INT);
        mainRenderer.drawLine(200,200,200,0, Renderer.LineAlgo.BRESENHAM_INT);

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
