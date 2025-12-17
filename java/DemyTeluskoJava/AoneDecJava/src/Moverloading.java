class Methodover {
    public void Additions(){
        System.out.println("Additions of two numbers :");
    }
    public int number(int a, int b) {
        return a+b;
    }
    public int number(int n1, int n2, int n3) {
        return n1+n2+n3;
    }
    public double number(double a, double b) {
        return a+b;
    }
    public double number(double n1, double n2, double n3) {
        return n1+n2+n3;
    }

}

public class Moverloading {
    public static void main(String[] args) {
        Methodover mover = new Methodover();
        mover.Additions();
        double result = mover.number(5,3.1,5);
        System.out.println(result);    
    }
}