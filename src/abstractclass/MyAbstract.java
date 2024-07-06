package abstractclass;

  abstract class Shape {
     String objectName = "";

     Shape() {

     }

      Shape(String objectName){
          this.objectName = objectName;
      }

      void movedTo(int x,int y){
        System.out.println(this.objectName+" has been moved to x= "+ x +" and y= "+ y);
      }

     abstract double area();
     abstract void draw();
}

 class rectangle extends Shape{
      private double length;
      private double breadth;

      rectangle(String objectName, double length,double breadth){
          super(objectName);
         this.length = length;
         this.breadth = breadth;
      }
    @Override
      void draw(){
        System.out.println("rectangle has been drawn");
      }

     @Override
     double area(){
         return (double)length * breadth;
     }

 }

 class circle extends Shape{

       double pi = 3.17;
       double radius ;

       circle(String name , double radius){
           super(name);
          this.radius = radius;
       }

     @Override
     void draw() {
         System.out.println("circle has been drawn");
     }

     @Override
     double area() {
         return pi*(radius*radius);
     }
 }

 class Area {
      public static void main(String []args){
          Shape rect = new rectangle("rectangle",4,5);
          double r =  rect.area();
          System.out.println("area rect "+r);
          rect.movedTo(2,4);
          rect.draw();

         Shape cir = new circle("circle",5);
          double area = cir.area();
          cir.movedTo(1,2);
          cir.draw();
          System.out.println("arear circle "+area);

      }
 }


