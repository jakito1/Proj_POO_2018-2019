/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOProj;
import java.util.Random;
/**
 *
 * @author eufra
 */
public class ModifiedRandom {
    
    public static double getNextGaussian(double deviation, double mean){
        Random random = new Random();
        return (deviation * random.nextGaussian() + mean);
    }
}
