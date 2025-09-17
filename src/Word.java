public class Word {
   private  String word;
   private String translation;

    public Word(String word, String translation) {
        if(word == null || word.trim().isEmpty() || translation == null || translation.trim().isEmpty()){
            throw new IllegalArgumentException();
        }
        this.word = word.trim();
        this.translation = translation.trim();
    }

    public String getWord() {
        return word;
    }
    public String getTranslation(){
        return translation;
    }

    @Override
    public String toString() {
        return word + " - " + translation;
    }
}
