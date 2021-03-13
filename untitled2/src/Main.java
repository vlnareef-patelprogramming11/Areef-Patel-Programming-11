public class Main {
    public static void main(String[] args) {

        String name = "hello there";

        for(int i = 0; i<name.length(); i++);
        System.out.println(name);

        name = name.replaceAll("o there", "alloya");
        System.out.println(name);

        name = name.replaceAll("alloya", "o there");
        System.out.println(name);













    }
}
