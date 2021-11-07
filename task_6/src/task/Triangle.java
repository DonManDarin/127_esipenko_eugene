package task;

public class Triangle {

   private final double a;
   private final double b;
   private final double c;

   public Triangle(double a, double b, double c){
       this.a = a;
       this.b = b;
       this.c = c;
   }

   public double getA(){
       return a;
   }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }

    public boolean isValid(){
        return ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0));
    }

    public double square(){
        double p = (a+b+c)/2;
        if(isValid())
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        else return -1;
    }
    public double perimeter(){
        if (isValid()) return a+b+c;
        else return -1;
    }
}
