
/**
 * Write a description of Part4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import edu.duke.*;
import java.io.*;

public class Part4 {
    public void linkPrint(){
        URLResource file = new URLResource("http://www.dukelearntoprogram.com/course2/data/manylinks.html");
        for (String item : file.words()) {
           String itemLower = item.toLowerCase();
           int pos = itemLower.indexOf("youtube.com");
           if (pos != -1) {
               //*************
               int beg = item.lastIndexOf("\"",pos);
               int end = item.indexOf("\"", pos+1);
               System.out.println(item.substring(beg+1,end));
               }
            }
    }

}
