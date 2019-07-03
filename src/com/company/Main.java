package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss(200, 50, 0);
        boss.changeBossDefence();//рандомно меняет тип защиты босса
        System.out.println(boss.printInfo());//вывод характеристики босса
        MagicDoor magicDoor = new MagicDoor();
        magicDoor.generateHeroes();

    }
}
