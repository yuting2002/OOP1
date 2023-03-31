import java.util.Scanner;

class animal {
    String name; // 宣告屬性
    double height, weight, speed;

    void show() { // 印出基本資訊
        System.out.println("Information:");
        System.out.println("Name:" + name);
        System.out.println("Height:" + height);
        System.out.println("Weight:" + weight);
        System.out.println("Speed::" + speed);
        System.out.println(" ");
    }

    double distance(double x, double y) { // 距離=時間*加速度*速度
        double i = x * y * speed;
        return i;
    }

    double distance(double x) { // 距離=時間*速度 (不輸入加速度)
        double i = x * speed;
        return i;
    }
}

public class A1093371_0324_1 {
    public static void main(String[] argv) {

        animal[] animals = new animal[4]; // 宣告基本資訊
        for (int i = 0; i < animals.length; i++) {
            animals[i] = new animal();
        }

        animals[0].name = "Olaf";
        animals[0].height = 1.1;
        animals[0].weight = 52;
        animals[0].speed = 100;

        animals[1].name = "Donkey";
        animals[1].height = 1.5;
        animals[1].weight = 99;
        animals[1].speed = 200;

        animals[2].name = "Anna";
        animals[2].height = 1.7;
        animals[2].weight = 48;
        animals[2].speed = 120;

        animals[3].name = "Elsa";
        animals[3].height = 1.7;
        animals[3].weight = 50;
        animals[3].speed = 120;

        for (int i = 0; i < animals.length; i++) { // 呼叫show(), 印出基本資訊
            animals[i].show();
        }

        double x, y, D; // 輸入x, y 或只輸入x, 並印出距離計算結果
        int T;
        System.out.println("Input the number: Time(x) and Acceleration(y)");
        System.out.println("x:");
        Scanner SC = new Scanner(System.in);
        x = SC.nextInt(); // 輸入x

        System.out.println("Do you know the Acceleration? (yes=1, no=0)"); // 決定是否輸入y, 1=輸入, 0=不輸入
        T = SC.nextInt();
        if (T == 1) { // 輸入y, 呼叫distance(x, y), 並印出結果
            System.out.println("y:");
            y = SC.nextInt();
            for (int j = 0; j < animals.length; j++) {
                D = animals[j].distance(x, y);
                System.out.println("The distance of " + animals[j].name + " : " + D);
            }
        } else { // 不輸入y, 呼叫distance(x), 並印出結果
            for (int k = 0; k < animals.length; k++) {
                D = animals[k].distance(x);
                System.out.println("The distance of " + animals[k].name + " : " + D);
            }
        }
        SC.close();
    }
}
