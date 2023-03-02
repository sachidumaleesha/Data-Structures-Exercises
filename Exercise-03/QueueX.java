class QueueX {
  private int front;
  private int rear;
  private int maxSize;
  private int noItems;
  private int[] queueArray;

  QueueX(int size) {
    maxSize = size;
    front = 0;
    rear = -1;
    noItems = 0;
    queueArray = new int[maxSize];
  }

  public void insert(int j){
    if(rear == maxSize - 1){
      System.out.println("Queue is full");
    }
    else{
      noItems++;
      queueArray[++rear] = j;
    }
  }

  public int remove(){
    if(noItems == 0){
      System.out.println("Queue is empty");
      return -99;
    }
    else{
      noItems--;
      return queueArray[front++];
    }
  }

  public int peekFront(){
    if(noItems == 0){
      System.out.println("Queue is empty");
      return -99;
    }
    else{
      return queueArray[front];
    }
  }

  public boolean isEmpty(){
    return (noItems == 0);
  }

  public boolean isFull(){
    return (rear == maxSize - 1);
  }
}