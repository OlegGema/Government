package deputats;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by Oleg on 16.07.2017.
 */
public class Rada {
    public static Rada instance;
    public static Rada getInstance() {
        if (instance==null){
            instance=new Rada();
        }
        return instance;
    }
    ArrayList<Fraction>fractions=new ArrayList<>();

    //створити фракцію
    public void newFraction(){
        System.out.print("Назвіть нову фракцію ");
        String name= new Scanner(System.in).next();
        fractions.add(new Fraction(name));
    }

    //видалити фракцію
    public void deleteFraction(){
        System.out.println("Яку фракцію знищити?");
        String name=new Scanner(System.in).next();
        Iterator<Fraction>iterator=fractions.iterator();
        while (iterator.hasNext()){
            Fraction fraction=iterator.next();
            if (fraction.getNameOfFraction().equals(name)){
                iterator.remove();
            }
        }
    }

    //показати всі існуючі фракції
    public void showAllFrations(){
        Iterator<Fraction>iterator=fractions.iterator();
        while (iterator.hasNext()){
            Fraction fraction=iterator.next();
            System.out.println(fraction.getNameOfFraction());
        }
    }

    //показати всіх депутатів з фракції
    public void showFraction(){
        System.out.println("Яку фракцію показати?");
        String name=new Scanner(System.in).next();
        Iterator<Fraction>iterator=fractions.iterator();
        while (iterator.hasNext()){
            Fraction fraction=iterator.next();
            if (fraction.getNameOfFraction().equals(name)){
                fraction.showDeputat();
            }
        }
    }

    //створити нового депутата в фракції
    public void newDeputatInFraction(){
        System.out.println("В яку фракцiію додати депутата?");
        String name=new Scanner(System.in).next();
        Iterator<Fraction>iterator=fractions.iterator();
        while (iterator.hasNext()){
            Fraction fraction=iterator.next();
            if (fraction.getNameOfFraction().equals(name)){
                fraction.addDeputat();
            }
        }
    }

    //вбити депутата з фракції
    public void deleteDeputatFromFraction(){
        System.out.println("З якої фракції видалити депутата?");
        String name=new Scanner(System.in).next();
        Iterator<Fraction>iterator=fractions.iterator();
        while (iterator.hasNext()){
            Fraction fraction=iterator.next();
            if (fraction.getNameOfFraction().equals(name)){
                fraction.deleteDeputat();
            }
        }
    }

    //показати всіх хабарників з фракції
    public void showAllBridersFromFraction(){
        System.out.println("Хабарників якої фракції показати?");
        String name=new Scanner(System.in).next();
        Iterator<Fraction>iterator=fractions.iterator();
        while (iterator.hasNext()) {
            Fraction fraction = iterator.next();
            if (fraction.getNameOfFraction().equals(name)){
                fraction.showBriders();
            }
        }
    }

    //найбільший хабарник з фракції
    public void showLargestBriderFromFraction(){
        System.out.println("Найбільшого хабарника якої фракції показати?");
        String name=new Scanner(System.in).next();
        Iterator<Fraction>iterator=fractions.iterator();
        while (iterator.hasNext()) {
            Fraction fraction = iterator.next();
            if (fraction.getNameOfFraction().equals(name)){
                fraction.largestBride();
            }
        }
    }

    //вбити депутат з фракції
    public void deleteAllDeputatsFromFraction(){
        System.out.println("Депутатів якої фракції видалити?");
        String name=new Scanner(System.in).next();
        Iterator<Fraction>iterator=fractions.iterator();
        while (iterator.hasNext()) {
            Fraction fraction = iterator.next();
            if (fraction.getNameOfFraction().equals(name)){
                fraction.deleteAll();
            }
        }
    }

    //дати хабаря депутату з конкретної фракції
    public void giveABrideToDeputatFromFraction(){
        System.out.println("Депутатові якої фракції дати хабаря?");
        String name=new Scanner(System.in).next();
        Iterator<Fraction>iterator=fractions.iterator();
        while (iterator.hasNext()){
            Fraction fraction=iterator.next();
            if (fraction.getNameOfFraction().equals(name)){
                fraction.giveABride();
            }
        }
    }




}
