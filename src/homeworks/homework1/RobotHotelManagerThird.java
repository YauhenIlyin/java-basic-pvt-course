package homeworks.homework1;

import java.util.Scanner;

public class RobotHotelManagerThird {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, i am Freeman, hotel manager. You are welcome! What is your name?");
        String guestName = sc.nextLine();
        switch (guestName) {
            case "Вася":
                System.out.println("Привет!\nЯ тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }
        sc.close();
    }
}
