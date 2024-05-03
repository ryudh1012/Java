import java.util.Scanner;

public class P19 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str;
        char ch;
        int i, k;
        int star;

        System.out.print("숫자를 여러 개 입력 : ");
        str = s.nextLine();

        i = 0;
        ch = str.charAt(i);
        while (true){
            star = (int) ch - 48;

            for (k = 0; k < star; k++)
                System.out.print("*");
            System.out.println();

            if (++i > str.length() -1)
                break;
            ch = str.charAt(i);
        }
    }
}
