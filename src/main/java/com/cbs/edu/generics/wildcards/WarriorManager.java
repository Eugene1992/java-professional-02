package com.cbs.edu.generics.wildcards;

import java.util.List;

public class WarriorManager {

    //    <B> - инвариантность
    public static boolean isStrongerThen(Warrior first, Warrior second) {
        return first.getPower() > second.getPower();
    }

    /*public static boolean isStrongerThen(List<Warrior> firstBand, List<Warrior> secondBand) {
        int firstPowSum = firstBand.stream().mapToInt(w -> w.getPower()).sum();
        int secondPowSum = secondBand.stream().mapToInt(w -> w.getPower()).sum();
        return firstPowSum > secondPowSum;
    }*/

//    <? extends B> - ковариантность
    public static boolean isStrongerThen(List<? extends Warrior> firstBand, List<? extends Warrior> secondBand) {
        // thanks for '? extends Warrior' we got access to getPower()
        int firstPowSum = firstBand.stream().mapToInt(w -> w.getPower()).sum();
        int secondPowSum = secondBand.stream().mapToInt(w -> w.getPower()).sum();
        return firstPowSum > secondPowSum;
    }

//    <? super B> - контрвариантность
    public static boolean isHealthierThen(List<? super Warrior> firstBand, List<? super Warrior> secondBand) {
        // unfortunately because of the '? super Warrior' we got no access to getHealth()
//        int firstHealthSum = firstBand.stream().mapToInt(w -> w.getHealth()).sum();
//        int secondHealthSum = secondBand.stream().mapToInt(w -> w.getHealth()).sum();
//        return firstHealthSum > secondHealthSum;
        return true;
    }
}
