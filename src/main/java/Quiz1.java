import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); //Scanner를 이용해 숫자를 입력받음
        int num; //정수형 변수 1개

        System.out.print("숫자를 입력하세요 --> "); //사용자에게 숫자를 입력하라는 것을 출력
        num = s.nextInt();  //정수를 입력받음

        if (num % 21 == 0) { // 3과 7의 최소공배수인 21로 나누어 나머지가 0이면 3과 7의 배수 모두 만족
            System.out.print("3과 7의 배수 모두 만족합니다."); //11행이 참이면 둘 다 만족함을 출력
        }
        else if (num % 3 == 0) { //숫자를 3으로 나누어 나머지가 0이면 3의 배수
            System.out.print("3의 배수입니다."); //14행이 참이면 3의 배수임을 출력
        }
        else if (num % 7 == 0) { //숫자를 7로 나누어 나머지가 0이면 7의 배수
            System.out.print("7의 배수입니다."); //17행이 참이면 7의 배수임을 출력
        }
        else { //3과 7의 배수 모두 만족하지 않을 경우
            System.out.print("3과 7의 배수 모두 만족하지 않습니다."); //둘 다 만족하지 않음을 출력
        }
     s.close();
    }
    }
