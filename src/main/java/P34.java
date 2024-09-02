interface Mammal{
abstract void bear();
}

abstract class Fish {
    void swim() {
        System.out.println("물고기는 헤엄치며 움직입니다.");
    }
}

class Whale extends Fish implements Mammal{
    public void bear() {
        System.out.println("고래는 새끼를 낳습니다.");
    }
}
public class P34 {
    public static void main(String[] args){
        Whale whale1 = new Whale();

        whale1.swim();
        whale1.bear();
    }
}
