package homeworks.homework1;

import java.util.Objects;
import java.util.Scanner;

public class RobotHotelManagerFirst {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, i am Jorge, hotel manager. You are welcome! What is your name?");
        String guestName = sc.nextLine();
        if (Objects.equals(guestName, "Вася")) {
            System.out.println("Привет!\nЯ тебя так долго ждал");
        }
        if (Objects.equals(guestName, "Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        }
        if (!Objects.equals(guestName, "Анастасия") && !Objects.equals(guestName, "Вася")) {
            System.out.println("Добрый день, а вы кто?");
        }
        sc.close();
    }

}
