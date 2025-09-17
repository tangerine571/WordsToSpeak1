import java.util.ArrayList;
import java.util.List;

public class WordList {
    private List<Word> list = new ArrayList<>();
    public void add(Word word){
        if(word == null){
            throw new IllegalArgumentException();
        } else {
            list.add(word);
        }
    }
    public List<Word> getAll(){
        return new ArrayList<Word>(list);   //new ArrayList<>(words) — это создаёт копию внутреннего списка.
                                             //Мы отдаём наружу не сам words, а копию.*/
    }
}
