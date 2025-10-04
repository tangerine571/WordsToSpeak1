import java.util.ArrayList;
import java.util.List;

public class WordList {
    private List<Word> internalList = new ArrayList<>();

    public void add(Word word) {
        if (word == null) {
            throw new IllegalArgumentException("word is null");
        } else {
            internalList.add(word);
        }
    }

    public List<Word> getAll() {
        return new ArrayList<Word>(internalList);   //new ArrayList<>(words) — это создаёт копию внутреннего списка.
        //Мы отдаём наружу не сам words, а копию.
    }

    public int size() {
        return internalList.size();
    }

    public boolean isEmpty() {
        return internalList.isEmpty();
    }
}
