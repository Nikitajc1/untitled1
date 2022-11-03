public class Main2 {
    public static void main(String[] aargs) {
        int income = 7800;
        int spending = 100000;

        int tax = income * 6 / 100;
        int tax2 = (income - spending) * 15 / 100;

        System.out.println("Ваш налог на первой системе: " + tax + " рублей");
        System.out.println("Ваш налог на второй системе: " + tax2 + " рублей");

    }
}
