import java.util.Comparator;

public class SortAgainstSuitAndValue implements Comparator<Card> {

    @Override
    public int compare(Card o1, Card o2) {
        if (o1.getSuit() == o2.getSuit()) {
            return compareValue(o1, o2);
        }
        if (o1.getSuit() > o2.getSuit()) {
            return 1;
        } else {
            return -1;
        }
    }

    public int compareValue(Card o1, Card o2) {
        //return o1.getValue() - o2.getValue();
        if (o1.getValue() == o2.getValue()) {
            return 0;
        }
        if (o1.getValue() > o2.getValue()) {
            return 1;
        } else {
            return -1;
        }
    }
}
