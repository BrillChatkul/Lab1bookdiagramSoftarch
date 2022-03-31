package structural;

public class TimeLoggingHealthcareWorker extends HealthcareWorkerDecorator{

	public TimeLoggingHealthcareWorker(HealthcareWorker worker) {
		super(worker);
		System.out.println("Decorate"+ worker.getName()+ "with TimeLogging.");
	}
	
	@Override
	public void service() {
		java.util.Date date = new java.util.Date();
		System.out.println(date+": "+this.getName() + " assists other healthcare professionals.");
	}

}
