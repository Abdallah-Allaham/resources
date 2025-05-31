package data_structure.class_and_object;

public class TestRectClass {

    public static void main(String[] args) {
        RectClass rectClass = new RectClass();
        System.out.println(rectClass.getWidth());
        System.out.println(rectClass.getHeight());

        rectClass.setWidth(2);
        rectClass.setHeight(3.3);

        System.out.println(rectClass.getWidth());
        System.out.println(rectClass.getHeight());

        RectClass rectClass1 = new RectClass(5, 5);
        System.out.println(rectClass1.getWidth());
        System.out.println(rectClass1.getHeight());


        RectClass square = new RectClass(10);
        System.out.println(square.getWidth());
        System.out.println(square.getHeight());

        System.out.println(rectClass);
        System.out.println(square.toString());

        double area = rectClass.getArea();
        double perimeter = rectClass.getPerimeter();

        System.out.println("Area is : " + area + " And Perimeter is : " + perimeter);

    }
}
