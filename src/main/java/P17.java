import java.util.Scanner;

public class P17 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int start, end;
        int basu, i;
        int hap = 0;

        System.out.print("합계의 시작값 --> ");
        start = s.nextInt();
        System.out.print("합계의 끝값 --> ");
        end = s.nextInt();
        System.out.print("배수 --> ");
        basu = s.nextInt();

        i = start;
        while (i <= end){
            if (i % basu == 0)
                hap = hap + i;

            i++;
        }

        System.out.println(start + "부터 "+end+"까지의 "+basu+" 배수의 합계 --> "+hap);
    }
}
