import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
public class Animace {


    public static void main(String[] args){
        ArrayList<String> xyz = new ArrayList<>();
        int kkkkkkk = 10000;
        for(int i = 0; i < 0xFFFF; i++){
            try{
                Scanner abc = new Scanner(System.in);
                System.out.println("Estas listo?");
                for(;;){
                    String o = abc.next();
                    if(o.toLowerCase().contains("s")){
                        break;
                    }
                }
                Thread.sleep(2000);
                kkkkkkk++;
                xyz.add(ReturnPrintScreenPath(kkkkkkk));
            } catch(java.lang.Exception e){
                e.printStackTrace();
            }

        }
        System.out.println(xyz);
    }
    public  static String ReturnPrintScreenPath(int jjjj) throws Exception{
        Thread.sleep(1);
        Rectangle rec = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        Robot robot = new Robot();
        BufferedImage img = robot.createScreenCapture(rec);
        String  path = "/home/CurrentUser/Documents/" + returnNum(jjjj) + "/";
        ImageIO.write(img, "jpg", new File(path));
        return path;
    }
    public static String returnNum(int i ){
        return Integer.toString(i);
    }
}
