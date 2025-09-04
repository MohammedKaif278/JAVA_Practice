package Collections.List.ArrayList.ArrayListCodingQuestion_OOPs;
/*
3. Animal Shelter Intake/Adoption
Scenario: You run an animal shelter. Animals arrive and get adopted daily.
Challenge: Intake animals and adopt them by name.
Arrays are limited: Cannot handle dynamic additions/removals efficiently.

 */
import java.util.ArrayList;
import java.util.Scanner;

public class Animal_Shelter_Intake_Adoption
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Shelter shelt=new Shelter();
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("\t\tAnimal Shelter Center");
        System.out.println("-------------------------------------------------------------------------");
        while(true)
        {
            System.out.println("Enter 1 for Intake");
            System.out.println("Enter 2 for Adopt");
            System.out.println("Enter 3 for Animal Information");
            System.out.println("Enter 4 for Exit");
            System.out.println("-------------------------------------------------------------------------");
            System.out.println("Enter Your Choice");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Intake Process");
                    System.out.println("Enter Animal Species");
                    String species=sc.next();
                    System.out.println("Enter Animal name");
                    String name=sc.next();
                    shelt.intake(species,name);
                    System.out.println(name+" Intake Successfully");
                    System.out.println("-------------------------------------------------------------------------");
                }
                break;

                case 2:
                {
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Adopt Process");

                    System.out.println("Enter Animal name");
                    String name=sc.next();
                    shelt.adopt(name);
                    System.out.println(name+" Adopt Successfully");
                    System.out.println("-------------------------------------------------------------------------");
                }
                break;

                case 3:{
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Animal Information");
                    System.out.println(shelt.animal);
                    System.out.println("-------------------------------------------------------------------------");
                }
                break;

                case 4:
                {
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.println("Thank You Visit Again!");
                    System.out.println("-------------------------------------------------------------------------");

                }
                break;

                default:
                    System.out.println("Invalid Choice");
            }

        }
    }
}

class Animal
{
    String species;
    String name;
    public Animal(String species,String name)
    {
        this.species=species;
        this.name=name;
    }

    public String toString()
    {
        return "{ Species : "+species+",Name : "+name+"}";
    }
}

class Shelter
{
    ArrayList<Animal> animal=new ArrayList<>();

    public void intake(String species,String name)
    {
        animal.add(new Animal(species,name));
    }

    public void adopt(String name)
    {
        for(int i=0;i<animal.size();i++)
        {
            if(animal.get(i).name.equals(name))
            {
                animal.remove(i);
                break;
            }

        }
    }
}
