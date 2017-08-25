package deputats;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Oleg on 22.06.2017.
 */
public class Fraction {
    private String nameOfFraction;
    ArrayList<Deputat> deputats = new ArrayList<>();

    //створити депутата
    public  void addDeputat() {
        System.out.println("New deputat");
        System.out.println("Імя-");
        String n=new Scanner(System.in).next();
        System.out.println("Прізвище");
        String s=new Scanner(System.in).next();
        System.out.println("Вага")
        ;int w=new Scanner(System.in).nextInt();
        System.out.println("Ріст");
        int h=new Scanner(System.in).nextInt();
        System.out.println("Вік");
        int a=new Scanner(System.in).nextInt();
        System.out.println("Хабарник?(True of False)");
        boolean b=new Scanner(System.in).nextBoolean();
        deputats.add(new Deputat(w,h,n,s,a,b));
        showDeputat();
    }

    //вбити депутата
    public  void deleteDeputat(){
        System.out.println("Якого депутата ви бажаєте видалити?(Прізвище)");
        String name=new Scanner(System.in).next();
        Iterator<Deputat> iterator = deputats.iterator();
        while (iterator.hasNext()) {
            Deputat deputat=iterator.next();
            if (deputat.getSurname().equals(name)) {
                iterator.remove();
            }
        }
    }

    //показати хабарників
    public void showBriders(){
        Iterator<Deputat> iterator = deputats.iterator();
        while (iterator.hasNext()) {
            Deputat deputat=iterator.next();
            if (deputat.isBride() == true) {
                showDeputat();
            }
        }
    }

    //показати всіх депутатів
    public  void showDeputat() {
        Iterator<Deputat> iterator = deputats.iterator();
        while (iterator.hasNext()) {
            Deputat deputat = iterator.next();
            System.out.println(deputat);
        }
    }

    //вбити хабарників
    public void deleteBriders(){
        ListIterator<Deputat> listIterator = deputats.listIterator();
        if (deputats.removeIf(Deputat::isBride) == true) {
            showDeputat();
        }
        System.out.println("хабарників більше немає");
    }

    //вбити всіх
    public void deleteAll(){
        deputats.removeAll(deputats);
        System.out.println("Депутатів немає");
    }

    //дати хабаря
    public void giveABride(){
        System.out.println("Кому дати хабаря?"+"\n"+"Im'я");
        showDeputat();
        String name=new Scanner(System.in).next();
        System.out.println("Прізвище");
        String SN=new Scanner(System.in).next();
        Iterator<Deputat>iterator=deputats.iterator();
        while (iterator.hasNext()) {
            Deputat deputat=iterator.next();
            if (deputat.getName().equals(name) && deputat.getSurname().equals(SN)){
                deputat.giveBride();
            }
        }
    }

    //найбільший хабарник
    public void largestBride(){
        Iterator<Deputat>iterator=deputats.iterator();
        int m=0;
        while (iterator.hasNext()){
            Deputat deputat=iterator.next();
            if (deputat.getNumberOfBride()>m){
                m=deputat.getNumberOfBride();
            }
        }
        Iterator<Deputat>iterator1=deputats.iterator();
        while (iterator.hasNext()){
            Deputat deputat=iterator.next();
            if (deputat.getNumberOfBride()==m){
                System.out.println("Найбільшим хабарником є: "+deputat);
            }
        }
    }


    //всяка фігня
    public Fraction(String nameOfFraction) {
        this.nameOfFraction = nameOfFraction;
    }

    public String getNameOfFraction() {
        return nameOfFraction;
    }

    public void setNameOfFraction(String nameOfFraction) {
        this.nameOfFraction = nameOfFraction;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "nameOfFraction='" + nameOfFraction + '\'' +
                ", deputats=" + deputats +
                '}';
    }



}












