class Stack {
  private int stackArray[];
  private int maxSize;
  private int top;

  public Stack(int mSize) {
    maxSize = mSize;
    stackArray = new int[maxSize];
    top = -1;
  }

  public void push(int i) {
    if (maxSize - 1 == top) {
      System.out.println("Stack is already full");
    } else {
      // top++;
      stackArray[++top] = i;
    }
  }

  public int pop() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return -99;
    } else {
      return stackArray[top--];
    }
  }

  public int peek() {
    if (top == -1) {
      System.out.println("Stack is empty");
      return -99;
    } else {
      return stackArray[top];
    }
  }

  public boolean isTrue() {
    if (top == maxSize - 1) {
      return true;
    } else {
      return false;
    }

    // return (top == maxSize - 1); 4lines using 1line
  }

  public boolean isEmpty() {
    return (top == -1);
  }

  public int getCount() {
     return top + 1;
  }
}