import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    QueueX mainQueue = new QueueX(5);

    QueueX evenQueue = new QueueX(5);
    QueueX oddQueue = new QueueX(5);

    int number;

    for (int i = 0; i < 5; i++) {
      System.out.print("Enter transaction ID " + (i + 1) + ": ");
      number = scanner.nextInt();

      if (number % 2 == 0) {
        evenQueue.insert(number);
      } else {
        oddQueue.insert(number);
      }
    }

    System.out.println("");
    System.out.println("PC1");
    while (!evenQueue.isEmpty()) {
      System.out.println("Transaction: " + evenQueue.remove());
    }

    System.out.println("");
    System.out.println("PC2");
    while (!oddQueue.isEmpty()) {
      System.out.println("Transaction: " + oddQueue.remove());
    }

  }
}