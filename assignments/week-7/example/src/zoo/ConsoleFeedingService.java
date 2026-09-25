package zoo;

public class ConsoleFeedingService implements FeedingService {
    @Override 
    public void feed(Animal animal) {
        System.out.println("Feeding " + animal.getName() + " with " + animal.getDietType() + " diet plan.");
    }
}
