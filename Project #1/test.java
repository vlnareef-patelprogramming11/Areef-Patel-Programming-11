import java.util.Scanner;


public class test {
    static int problemOne(String s) {
        int answer = 0;

        System.out.println("enter word");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            switch (c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    answer++;
                    break;

            }
        }

        return answer;
    }
}
