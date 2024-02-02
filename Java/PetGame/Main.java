import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Welcome to the Virtual Pet Game!");
        System.out.print("What's the name of your pet? ");
        String petName = scanner.nextLine();
        System.out.print("How old is your pet? ");
        int petAge = scanner.nextInt();

        Pet myPet = new Pet(petName, petAge);
        int choice;

        do {
            System.out.println("\nWhat would you like to do with " + myPet.getName() + "?");
            System.out.println("1. Feed");
            System.out.println("2. Play");
            System.out.println("3. Check Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
           
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    myPet.feed();
                    System.out.println("You fed " + myPet.getName() + ".");
                    break;
                case 2:
                    myPet.play();
                    System.out.println("You played with " + myPet.getName() + ".");
                    break;
                case 3:
                    System.out.println(myPet.getName() + "'s Status:");
                    System.out.println("Age: " + myPet.getAge());
                    System.out.println("Hunger: " + myPet.getHunger());
                    System.out.println("Happiness: " + myPet.getHappiness());
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}


    
