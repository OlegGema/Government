package deputats;

import java.util.Scanner;

/**
 * Created by Oleg on 21.06.2017.
 */
public class Deputat extends Human {
    private  String name;
    private  String surname;
    private  int age;
    private  boolean bride;
    private  int numberOfBride;




    public Deputat(int weight, int height, String name, String surname, int age, boolean bride) {
        super(weight, height);
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.bride = bride;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isBride() {
        return bride;
    }

    public int getNumberOfBride() {
        return numberOfBride;
    }

    public void setNumberOfBride(int numberOfBride) {
        this.numberOfBride = numberOfBride;
    }

    public void setBride(boolean bride) {
        this.bride = bride;
    }

    @Override
    public String toString() {
        return "Deputat{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", bride=" + bride +" ,"+
                "weight=" + this.getWeight() +" "+
                ", height=" + getHeight() +
                '}';
    }

    public  void giveBride(){
        System.out.println("Яку суму ви хочете дати?");
        if (isBride()==false){
            System.out.println("Цей депутат не бере хабарів");
        }else{
            Scanner scanner=new Scanner(System.in);
            int s=scanner.nextInt();
            if (s>=5000){
                System.out.println("Поліція увязнила депутата");
            }else {
                numberOfBride=+s;
                System.out.println(numberOfBride);
            }
        }
    }


}
