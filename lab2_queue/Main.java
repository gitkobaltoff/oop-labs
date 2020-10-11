package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	Queue queue1 = new Queue(5);
    Queue queue2 = new Queue();

    queue1.push(1);
    queue1.push(2);
    queue1.push(3);
    queue2.push(6);
    queue2.push(5);
    queue2.push(4);

    System.out.println(queue1.pop());
    System.out.println(queue2.pop());

    queue1.print();
    System.out.println("next");
    queue2.print();

    }
}

class Queue{
    ArrayList<Integer> queue = new ArrayList<>();
    int max_size;

    public Queue(){
        this.max_size = -1;
    }

    public Queue(int size){
        this.max_size = size;
    }

    public boolean isEmpty(){
        return queue.size() == 0;
    }

    public boolean isFull(){
        return queue.size() == max_size;
    }

    public void push(Integer num){
        if (isFull())
            System.out.println("queue max size reached");
        else
            queue.add(num);
    }

    public Integer pop(){
        Integer mem;
        if (!isEmpty()){
            mem = queue.get(0);
            queue.remove(0);
            return mem;
        }
        return null;
    }

    public void print(){
        for (Integer i : queue)
            System.out.println(i + " ");
        //System.out.println("\n");
    }
}