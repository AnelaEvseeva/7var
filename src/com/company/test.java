package com.company;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Aircraft myAircraft1 = new Aircraft();
        Scanner in = new Scanner(System.in);
        System.out.println("Введите фирму: ");
        String nazv = in.next();
        myAircraft1.setFirm(nazv);
        System.out.println("Введите максимальную скорость: ");
        int s = in.nextInt();
        myAircraft1.setMaxSpeed(s);
        System.out.println("Какой-то самолет: "+myAircraft1.getFirm()+" "+myAircraft1.getMaxSpeed());
        System.out.println();

        Airplane myAirplane1=new Airplane("aaa",500,"aaa","TBTB",5);
        Airplane myAirplane2=new Airplane();
        System.out.println("Введите фирму-производитель самолета: ");
        nazv=in.next();
        myAirplane2.setFirm(nazv);
        System.out.println("Введите максимальную скорость самолета: ");
        s=in.nextInt();
        myAirplane2.setMaxSpeed(s);
        System.out.println("Введите модель самолета: ");
        nazv=in.next();
        myAirplane2.setModel(nazv);
        System.out.println("Введите тип двигателя: ");
        nazv=in.next();
        myAirplane2.setTypeEngine(nazv);
        System.out.println("Введите количество пассажиров: ");
        s=in.nextInt();
        myAirplane2.setCrew(s);
        System.out.println();
        System.out.println("Первый самолет: "+myAirplane1.toString());
        System.out.println("Второй самолет: "+myAirplane2.toString());

        Helicopter myHelicopter=new Helicopter();
        myHelicopter.setAllInfo();
        System.out.println(myHelicopter.toString());
    }
}
