import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        double[] weights = new double[10];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = (new Random().nextDouble() * 60) + 40;
        }

        double middleWeigt = 0;
        for (int i = 0; i < weights.length; i++) {
            middleWeigt += weights[i];
        }
        int peopleCount = 0;
        for (int i = 0; i < weights.length; i++) {
            if(weights[i] >= 60 && weights[i] <= 80) {
                peopleCount++;
            }
        }

        System.out.println("Средний вес = " + middleWeigt / weights.length);
        System.out.println("Кол-во людей: " + peopleCount);


    }
}
