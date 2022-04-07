package behavioral1;

import java.util.ArrayList;
import java.util.concurrent.Flow.Publisher;
import java.util.concurrent.Flow.Subscriber;

public class NewsPublisher implements Publisher<News> {
	// You need to implement this class
	private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
	
	@Override
	public void subscribe(Subscriber<? super News> subscriber) {
		// TODO Auto-generated method stub
		subscribers.add(subscriber);
	}
	
	public void unsubscribe(Subscriber<? super News> subscriber) {
		subscribers.remove(subscriber);
	}
	
	public void publish(News news) {
        for (Subscriber<? super News> subscriber : subscribers) {
            subscriber.onNext(news);
        }
    }
	
}
