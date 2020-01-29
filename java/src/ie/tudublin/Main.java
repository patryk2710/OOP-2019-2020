package ie.tudublin;

public class Main
{
    public static void main(String[] arg)
    {
        System.out.println("Hello world!");

        Animal misty = new Dog(); // Polymorphism

        misty.setName("Misty");
        System.out.println(misty.getName());  
        misty.speak();  

        Cat topcat = new Cat();
        topcat.speak();
        topcat.setNumLives(9);

        while (topcat.getNumLives() >= 0) {
            topcat.kill();
            if(topcat.getNumLives() == 0) {
                topcat.kill();
                break;
            }

        }
    }
}