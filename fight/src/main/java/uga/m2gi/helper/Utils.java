package uga.m2gi.helper;

import uga.m2gi.bo.Fight;
import uga.m2gi.bo.Hero;
import uga.m2gi.bo.Villain;

import java.util.Random;

public class Utils {
  private Utils() {
  }

  private static final Random random = new Random();
  private static final int BOUND = 20;

  public static int getRandomInt() {
    return random.nextInt(BOUND);
  }

  public static Fight fight(Hero hero, Villain villain) {
    int heroAdjust = Utils.getRandomInt();
    int villainAdjust = Utils.getRandomInt();
    String winner = hero.level + heroAdjust >= villain.level + villainAdjust ? hero.name : villain.name;
    return new Fight(hero, villain, winner);
  }

  public static Villain getDefaultVillain() {
    Villain villain = new Villain();
    villain.name = "Superman";
    villain.level = 0;
    villain.otherName = "Default Villain";
    villain.powers = "Default Villain";
    villain.picture = "https://github.com/cescoffier/supes/raw/main/pics/23568.jpg";
    return villain;
  }

  public static Hero getDefaultHero() {
    Hero hero = new Hero();
    hero.name = "Superman";
    hero.level = 0;
    hero.otherName = "Default Hero";
    hero.powers = "Default Hero";
    hero.picture = "https://github.com/cescoffier/supes/raw/main/pics/231.jpg";
    return hero;
  }
}
