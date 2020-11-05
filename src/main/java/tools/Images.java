package tools;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * @author Alexander Álvarez Marques
 * @date 2020-11-05
 * @version 0.1
 */
public class Images extends JPanel {

    // Attributes
    BufferedImage backgroundImage = null;
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
    }
    
    public void paintImage(Graphics g) {
        
        loadImage();
        
        int posX = 0;
        int posY = 0;
        int backgroundWith = backgroundImage.getWidth();
        int backgroundHeight = backgroundImage.getHeight();
        
        g.drawImage(backgroundImage, 0, 0, null);
        
    }
    
    private void loadImage() {
        
        if (backgroundImage == null) {
            
            try {
                backgroundImage = ImageIO.read(new URL("https://wallpaperaccess.com/full/1139034.jpg"));
            } catch (MalformedURLException ex) {
                Logger.getLogger(Images.class.getName()).log(Level.SEVERE, null, ex);
                System.exit(0);
            } catch (IOException ex) {
                Logger.getLogger(Images.class.getName()).log(Level.SEVERE, null, ex);
                System.exit(0);
            }
            
        }
        
    }
}
