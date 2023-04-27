package familyTree.human;

import java.util.Comparator;
import java.util.Map;

public class HumanComparatorByAge implements Comparator<String> {

    private final Map<String, Human> wholeGenus;

    /**
     * Конструктор
     * @param wholeGenus карта для сортировки
     */
    public HumanComparatorByAge(Map<String, Human> wholeGenus){
        this.wholeGenus = wholeGenus;
    }

    @Override
    public int compare(String o1, String o2) {
        Integer age1 = this.wholeGenus.get(o1).getAge();
        Integer age2 = this.wholeGenus.get(o2).getAge();
        return age1.compareTo(age2);
    }
}
