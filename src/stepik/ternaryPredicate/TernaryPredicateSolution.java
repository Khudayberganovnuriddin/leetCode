package stepik.ternaryPredicate;

public class TernaryPredicateSolution {
    public static final TernaryIntPredicate allValuesAreDifferentPredicate = (a,b,c)-> !a.equals(b) && !b.equals(c) && !a.equals(c);

    public static void main(String[] args) {
        System.out.println(allValuesAreDifferentPredicate.test(1,2,3));
    }
}
