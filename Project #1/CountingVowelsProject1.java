import java.util.Scanner;

public class CountingVowelsProject1 {

    static int problemOne(String s) {
        int answer = 0;

        System.out.println("enter word");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        char[] chars = s.toCharArray();
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

    //Code you problem number two here
    static int problemTwo(String s) {
        int answer = 0;
        System.out.println("enter word with bob");
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        String bob = "bob";


        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (s == bob) {


                    answer++;
                    break;

            }
            //Code your ujsolution to problem number 3 here



        }
return answer;
    }
    static void problemThree(String s1, String s2)
    {
        int MAX_CHAR = 0;
        int[] a1 = new int[MAX_CHAR];
        int[] a2 = new int[MAX_CHAR];

        int length1 = s1.length();
        int length2 = s2.length();

        for (int i = 0 ; i < length1 ; i++)
            a1[s1.charAt(i) - 'a'] += 1;

        for (int i = 0 ; i < length2 ; i++)
            a2[s2.charAt(i) - 'a'] += 1;

       
        for (int i = 0 ; i < MAX_CHAR ; i++)
        {
            if (a1[i] != 0 && a2[i] != 0)
            {
               
                for (int j = 0 ; j < Math.min(a1[i], a2[i]) ; j++)
                    System.out.print(((char)(i + 'a')));
            }
        }
    }
}
