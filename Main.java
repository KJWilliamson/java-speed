import java.util.Scanner;
 
class CarSpeed {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter car's speed between 0 and 200: ");
    int speed = input.nextInt();
 
    if(speed >= 45 && speed < 65) {
      System.out.println("The car's speed is moderate!");
    }
    else if(speed <= 25) {
      System.out.println("The car's speed is slow!");
    }
    else if(speed >= 65) {
      System.out.println("The car's speed is fast!");
    }
    else {
      System.out.println("The car's speed is just right.");
    }
    
  }
}


