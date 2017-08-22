import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int age=scn.nextInt();
        switch(age){
            case 0 :
                System.out.println("Вы родились");
                break;
            case 7 :
                System.out.println("Вы пошли в школу");
                break;
            case 18 :
                System.out.println("Вы закончили школу");
                break;
            default :
                System.out.println("Не одно из условий не подошло ,введите корректный возраст!");
        }
    }

}
