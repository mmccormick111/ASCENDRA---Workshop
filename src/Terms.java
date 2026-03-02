import java.util.*;

public class Terms{
    private final Map<String, Term> termMap = new HashMap<>();

    public void addTerm(Term term) {
        termMap.put(term.getWord(), term);
    }

    public Term getTerm(String word) {
        return termMap.get(word.toLowerCase());
    }

    public boolean contains(String word){
        return termMap.containsKey(word.toLowerCase());
    }

}
