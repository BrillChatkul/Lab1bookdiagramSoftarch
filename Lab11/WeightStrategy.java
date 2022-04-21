package behavior2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class WeightStrategy implements SortStrategy {

	@Override
	public void customSort(List<Person> people) {
		// TODO Auto-generated method stub
		Collections.sort(people, Comparator.comparing( Person::getWeight));
	}
    // YOU MAY ADD UP TO 5 LINES OF CODE BELOW THIS COMMENT !! A LINE OF CODE MAY CONTAIN UP TO ONE SEMI-COLON !!

}
