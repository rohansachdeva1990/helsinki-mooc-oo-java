import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
    private List<Card> cards = new ArrayList<Card>();

    public void add(Card card) {
        cards.add(card);
    }

    public void print() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }

    public void sort() {
        Collections.sort(cards);
    }

    public int sum() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getValue();
        }
        return sum;
    }

    @Override
    public int compareTo(Hand o) {
        if (this.sum() == o.sum()) {
            return 0;
        }
        if (this.sum() > o.sum()) {
            return 1;
        } else {
            return -1;
        }
    }

    public void sortAgainstSuit() {
        Collections.sort(cards, new SortAgainstSuitAndValue());
    }
}
