package com.it;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Genericity {
    public static void main(String[] args) {
        //下界
        List<? super Food> flist = new ArrayList<>();
        Food food = new Food();
        Fruits fruits = new Fruits();
        Apple apple = new Apple();

        flist.add(new Fruits());//List中具体是Food的哪种父类无法确定，无法向下转型,因此只能添加
        flist.add(new Apple());
        Iterator it = flist.iterator();
        while (it.hasNext()){
            System.out.println(it.next());//遍历list集合
        }
    }
}

class Food{}
class Fruits extends Food{}
class Apple extends Fruits{}

