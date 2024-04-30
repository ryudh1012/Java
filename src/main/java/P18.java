import java.util.Scanner;

public class P18 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String str;
        char ch;
        int upper_cnt = 0, lower_cnt = 0, digit_cnt = 0;
        int i;

        System.out.print("문자열을 입력 : ");
        str = s.nextLine();

        i = 0;
        do {
            ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z')
                upper_cnt++;
            if (ch >= 'a' && ch <= 'z')
                lower_cnt++;
            if (ch >= '0' && ch <= '9')
                digit_cnt++;

            i++;
        } while (i < str.length());

        System.out.print("대문자" + upper_cnt + "개, 소문자 " + lower_cnt + "개, 숫자 " + digit_cnt + "개");
        }
    }
