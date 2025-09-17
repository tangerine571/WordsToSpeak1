public class Main {
    public static void main(String[] args) {
        // Нормальные данные
        Word w1 = new Word("apple", "яблоко");
        System.out.println(w1);

        // С пробелами
        Word w2 = new Word("  table  ", "  стол ");
        System.out.println(w2);

        // Пустая строка (должно упасть с IllegalArgumentException)
        Word w3 = new Word("", "машина");
    }
}