/*
 * Copyright 2017 BrutalRape().
 * Licensed under the Apache License, Version 2.0
 */

package rape.brutal.gitstarship.parts.hull;

import rape.brutal.gitstarship.ammunition.Gun;
import rape.brutal.gitstarship.parts.ShipPart;

import java.util.Objects;
import java.util.Scanner;

/**
 * Created by haze on 22.03.2017.
 */
public abstract class Hull extends ShipPart {

    private Gun[] guns;

    public Hull(int cost, int size, String name) {
        super(cost, size, name);
        this.guns = new Gun[8];
    }

    public Gun[] getGuns() {
        return guns;
    }

    public void addGun(Gun gun) {
        boolean isGunReplacing = true;
        for (int i = 0; i < 8; i++) {
            if (guns[i] == null) {
                isGunReplacing = false;
                guns[i] = gun;
                break;
            }
        }
        if (isGunReplacing) {
            System.out.println("Все отсеки заняты, хотите заменить пушку? (Введите 'y' или anykey)");
            String inputString = new Scanner(System.in).nextLine();

            if (Objects.equals(inputString, "y")) {
                System.out.println("\tПушка\tУрон\tРазмер\tСтоимость");
                for (int i = 0; i < 8; i++) {
                    System.out.println("№" + i + "\t" + guns[i].getName() + "\t" +
                            guns[i].getDamage() + "\t\t" + guns[i].getSize() + "\t\t" + guns[i].getCost());
                }

                System.out.println("Введите номер заменяемой пушки");
                int inputNumber = new Scanner(System.in).nextInt();
                removeGun(inputNumber);
                guns[inputNumber] = gun;
            }

        }

    }

    public void removeGun(int gunNumber) {
        guns[gunNumber] = null;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getCost() {
        return this.cost;
    }
}
