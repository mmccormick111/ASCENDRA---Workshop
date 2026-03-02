public class Term{
    private final String word;
    private final Category category;

    public Term(String word, Category category) {
        this.word = word.toLowerCase();
        this.category = category;
    }

    public String getWord(){
        return word;
    }

    public Category getCategory(){
        return category;
    }

    public int getSeverity(){
        return category.getSeverity();
    }
}