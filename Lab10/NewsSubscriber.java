package behavioral1;

import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;

public class NewsSubscriber implements Subscriber<News> {
	// You need to implement this class
	private String name;
	
	public NewsSubscriber(String name) {
        this.name = name;
    }

	@Override
	public void onSubscribe(Subscription subscription) {
		// TODO Auto-generated method stub
	}

	@Override
	public void onNext(News item) {
		// TODO Auto-generated method stub
		System.out.println(name+"get Content : "+item.getContent());
	}

	@Override
	public void onError(Throwable throwable) {
		// TODO Auto-generated method stub
		System.out.println("Error");
	}

	@Override
	public void onComplete() {
		// TODO Auto-generated method stub
		System.out.println("Complete");
		
	}
	

	
}
