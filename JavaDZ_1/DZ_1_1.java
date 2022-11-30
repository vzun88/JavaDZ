package JavaDZ_1;
//Реализовать функцию возведения числа а в степень b. a, b – целые числа.
//
//Пример 1: а = 3, b = 2, ответ: 9
//Пример 2: а = 2, b = -2, ответ: 0.25
//Пример 3: а = 3, b = 0, ответ: 1
public class DZ_1_1 {
    public static void main(String[] args) {
        System.out.println(degree(3,0));
    }

    static double degree(int a, int b){
        double deg=a;
        boolean flag = b<0 ? true : false;
        b = b<0 ? b*(-1) : b;
        
        if (b==0) return 1;

        for(int i=1;i<b;i++){
            deg*=a;
        }

        return flag ? 1/deg : deg;

    }

}
