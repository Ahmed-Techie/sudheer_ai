public class Bvcao {
    public static void main(String[] args) {
        Maximum maxi = new Maximum();
        int res = maxi.max(10,20);
        System.out.println(res);
    }
}

class Maximum {
    public int max(int n1, int n2) {
        int result = n1>n2 ? n1 : n2;
        return result;
    }
}