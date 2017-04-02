
/**
 * Write a description of BatchInversions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;

public class BatchInversions {
    ImageResource makeInversion(ImageResource inImage){
        ImageResource outImage = new ImageResource(inImage.getWidth(),inImage.getHeight());
        for (Pixel pixel : outImage.pixels()){
            Pixel inpixel = inImage.getPixel(pixel.getX(),pixel.getY());
            pixel.setRed(255 - inpixel.getRed());
            pixel.setGreen(255 - inpixel.getGreen());
            pixel.setBlue(255 - inpixel.getBlue());
        }
        return outImage;
    }
    
    public void selectAndConvert(){
        DirectoryResource dr = new DirectoryResource();
        for (File f : dr.selectedFiles()){
            ImageResource inImage = new ImageResource(f);
            ImageResource invertImage = makeInversion(inImage);
            String fname = inImage.getFileName();
            String newname = "inverted-" + fname;
            invertImage.setFileName(newname);
            invertImage.draw();
            invertImage.save();
        }
    }
}