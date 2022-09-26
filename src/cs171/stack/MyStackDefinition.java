package cs171.stack;

interface MyStackDefinition {
    boolean isEmpty();
    boolean isFull();
    void push(String item);
    String pop();
    String top();
}