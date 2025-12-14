public class Twoninemethods {
    public static void main(String[] args) {
        Aork adorkd = new Aork();
        String result = adorkd.aorkgames(17);
        adorkd.adultorkids();
        System.out.println(result);
    }
}

class Aork {
    public void adultorkids() {
        System.out.println("Play Adult games or Kids Games !");
    }
    public String aorkgames(int age) {
        if(age >= 18)
            return "You can play Adults Games !";
        return "You Must Play Kids Games !";
    }
}