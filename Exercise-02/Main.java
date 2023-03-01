import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    QueueX q1 = new QueueX(5);
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < 5; i++) {
      System.out.print("Enter a number: ");
      q1.insert(scanner.nextInt());
    }

    q1.makeDescending();

    System.out.println("");
    while (!q1.isEmpty()) {
      System.out.println(q1.remove());
    }
  }
}