class QueueX {
  private int front;
  private int rear;
  private int nItems;
  private int maxSize;
  private int[] QueueX;

  QueueX(int size) {
    maxSize = size;
    front = 0;
    rear = -1;
    nItems = 0;
    QueueX = new int[maxSize];
  }

  public void insert(int number) {
    if (rear == maxSize - 1) {
      System.out.println("Queue is Full");
    } else {
      nItems++;
      QueueX[++rear] = number;
    }
  }

  public int remove() {
    if (nItems == 0) {
      System.out.println("Queue is Empty");
      return -99;
    } else {
      nItems--;
      return QueueX[front++];
    }
  }

  public void makeDescending() {
    for (int i = 0; i < 5; i++) {
      for (int j = 1 + i; j <= 4; j++) {
        if (QueueX[j] > QueueX[i]) {
          int temp = QueueX[i];
          QueueX[i] = QueueX[j];
          QueueX[j] = temp;
        }
      }
    }
  }

  public boolean isEmpty() {
    return (nItems == 0);
  }

  public boolean isFull() {
    return (rear == maxSize - 1);
  }
}