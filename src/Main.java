public class Main {

    public static void main(String[] args) {
        int amount = 6730; //стоимость билета
        int rublesPerMile = 20; //количество рублей для одной бонусной мили

        int bonus = amount / rublesPerMile;

        System.out.println("Итоговый бонус:" + bonus);
    }

}