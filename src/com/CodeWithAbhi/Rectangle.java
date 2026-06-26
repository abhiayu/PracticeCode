package com.CodeWithAbhi;

public class Rectangle {
    // Write your code here.
    int length;
    int breadth;

    int getArea()
    {

        int area_rec = this.length*this.breadth;
//        System.out.println(area_rec);

        return area_rec;
    }

    public static void main(String arg[]){

        Rectangle obj = new Rectangle();
        obj.length=4;
        obj.breadth=20;
        System.out.println(obj.getArea());
//        obj.getArea();


        //    Scanner sc = new Scanner(System.in);
        //     System.out.print("Please, enter length of area: ");
        //     int length = sc.nextInt();
        //     System.out.print("Please, enter breadth of area: ");
        //     int breadth = sc.nextInt();

        //     getArea(length,breadth);
    }

}
