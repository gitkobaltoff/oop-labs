package com.company;

public class Main {

    public static void main(String[] args) {

        Box box1 = new Box();
        Box box2 = new Box(2);
        Box box3 = new Box(1,2,3);

        System.out.println(box1.surfArea() + " " + box1.volume());
        System.out.println(box2.surfArea() + " " + box2.volume());
        System.out.println(box3.surfArea() + " " + box3.volume());

    }
}

class Box{
    int height, width, depth;

    public Box(){
        this.height = this.width = this.depth = 1;
    }

    public Box(int _value){
        this.height = this.width = this.depth = _value;
    }

    public Box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public int surfArea(){
        return 2 * (width*height + width*depth + height*depth);
    }

    public int volume(){
        return height * width * depth;
    }
}
