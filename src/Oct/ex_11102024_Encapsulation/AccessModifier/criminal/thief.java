package Oct.ex_11102024_Encapsulation.AccessModifier.criminal;

import Oct.ex_11102024_Encapsulation.AccessModifier.police.Cop;

public class thief {
    //thief should not be able to access data/functions from police folder i.e. cop or jrcop class
    public static void main(String[] args) {
        Cop tf = new Cop(10);
       // tf.canIShoot(); - throws error
    }
}
