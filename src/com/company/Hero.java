package com.company;

public class Hero {

    private int health;
    private int attackPower;
    private int hitType;

    public Hero(int health, int attackPower, int hitType) {
        this.health = health;
        this.attackPower = attackPower;
        this.hitType = hitType;
    }

    public String printInfo() {
        return "Hero:"+getHealth() + " " + getAttackPower() + " " +
                getHitType() + " ";
    }
    public void setHealth(int health) {
        this.health = health;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void setHitType(int hitType) {
        this.hitType = hitType;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getHitType() {
        return hitType;
    }

}
