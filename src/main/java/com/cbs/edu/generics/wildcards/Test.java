package com.cbs.edu.generics.wildcards;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        MagicWarrior firstMag = new MagicWarrior("Potter", 900, 1000);
        MagicWarrior secondMag = new MagicWarrior("Dumbledore", 1500, 1000);
        MagicWarrior thirdMag = new MagicWarrior("Snape", 1200, 1000);

        ArcherWarrior firstArcher = new ArcherWarrior("Legalas", 800, 1000);
        ArcherWarrior secondArcher = new ArcherWarrior("Tauriel", 800, 1000);
        ArcherWarrior thirdArcher = new ArcherWarrior("Bard", 800, 1000);

        boolean isMagicCooler = WarriorManager.isStrongerThen(firstMag, firstArcher);



        List<ArcherWarrior> archerWarriors = Arrays.asList(firstArcher, secondArcher, thirdArcher);
        List<MagicWarrior> magicWarriors = Arrays.asList(firstMag, secondMag, thirdMag);

        boolean isMagicBandCooler = WarriorManager.isStrongerThen(magicWarriors, archerWarriors);



        List<Warrior> magGameUnits = Arrays.asList(firstMag, secondMag, thirdMag);
        List<GameUnit> archerGameUnits = Arrays.asList(firstArcher, secondArcher, thirdArcher);

        boolean isMagicBandHealthier = WarriorManager.isHealthierThen(magGameUnits, archerGameUnits);

    }
}
