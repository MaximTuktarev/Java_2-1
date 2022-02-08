public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int price1 = 15_000;
        int price2 = 12_000;
        int price3 = 18_000;
        int price4 = 19_000;
        int price5 = 16_000;
        int price6 = 10_000;
        int miles = service.calculate(price);
        int miles1 = service.calculate(price1);
        int miles2 = service.calculate(price2);
        int miles3 = service.calculate(price3);
        int miles4 = service.calculate(price4);
        int miles5 = service.calculate(price5);
        int miles6 = service.calculate(price6);
        System.out.println("Бонусные мили для первой цены: " + miles);
        System.out.println("Бонусные мили для второй цены: " + miles1);
        System.out.println("Бонусные мили для третьей цены: " + miles2);
        System.out.println("Бонусные мили для четвертой цены: " + miles3);
        System.out.println("Бонусные мили для пятой цены: " + miles4);
        System.out.println("Бонусные мили для шестой цены: " + miles5);
        System.out.println("Бонусные мили для седьмой цены: " + miles6);
    }
}