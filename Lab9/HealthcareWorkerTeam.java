package structural;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HealthcareWorkerTeam implements HealthcareServiceable{
	
	public Set<HealthcareServiceable> members;
	
	public void addMember(HealthcareServiceable member) {
		if (members == null) {
			members = new HashSet<HealthcareServiceable>();
		}
		members.add(member);
	}
	
	public void removeMember(HealthcareServiceable member) {
		if (members != null) {
			members.remove(member);
		}
	}
	
	@Override
	public void service() {
		Iterator values = members.iterator();
		while (values.hasNext()) {
			HealthcareServiceable value = (HealthcareServiceable) values.next();
			value.service();
        }
		
	}

	@Override
	public double getPrice() {
		Iterator values = members.iterator();
		double price = 0;
		while (values.hasNext()) {
			HealthcareServiceable value = (HealthcareServiceable) values.next();
			price += value.getPrice();
        }
		return price;
	}

}
