public class Main {
    public static void main(String[] args) {
       WordList list = new WordList();
       list.add(new Word("apple", "блоко"));
       list.add(new Word("table", " gjgjjg"));
       list.add(null);
        System.out.println(list.size());
        for(Word w : list.getAll()){
            System.out.println(w);
        }
    }
}