package quiz;

public class Chocolate {

    private Chocolate(int numberOfParts, String flavour){
        this.numberOfParts=numberOfParts;
        this.flavour=flavour;
    }
    private int numberOfParts;
    private String flavour;

    public static void main(String[] parts) {
        if (parts == null || parts.length<5) {
            System.out.println("Enter input and try again");
            return;
        }
        Chocolate a = new Chocolate(Integer.valueOf(parts[0]), "choco");
        Chocolate b = new Chocolate(Integer.valueOf(parts[1]), "vanila");
        Chocolate c = new Chocolate(Integer.valueOf(parts[2]), "strawberry");
        Chocolate d = new Chocolate(Integer.valueOf(parts[3]), "milk");
        Chocolate e = new Chocolate(Integer.valueOf(parts[4]), "dark");
    }
}
