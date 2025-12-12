public class Calculator {
    public int add(int n1,int n2) {
        System.out.println("add");
        int res = n1 + n2;
        return res;
    }
}
public class Bclassandobject {
public static void main(String[] args) {
Calculator calc = new Calculator();
int result = calc.add(4,4);
System.out.println(result);
}    
}