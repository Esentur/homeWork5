package com.company;

import java.util.Random;

public class Boss {
    private int health;
    private int attackPower;
    private int hitType;

    public Boss(int health, int attackPower, int hitType) {
        this.health = health;
        this.attackPower = attackPower;
        this.hitType = hitType;
    }
    public void changeBossDefence() {
        Random r = new Random();
        int randomNum = r.nextInt(4) + 1;
        setHitType(randomNum);

    }
    public String printInfo() {
        return "Boss:"+health + " " + attackPower + " " +
                hitType + " ";
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getHitType() {
        return hitType;
    }

    public void setHitType(int hitType) {
        this.hitType = hitType;
    }
}
