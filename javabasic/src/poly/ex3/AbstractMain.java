package poly.ex3;


public class AbstractMain {

    public static void main(String[] args) {
        //추상클래스 생성 불가
//        AbstracAnimal animal = new AbstracAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        dog.sound();
        cat.sound();
        caw.sound();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    }

    private static void soundAnimal(AbstracAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
