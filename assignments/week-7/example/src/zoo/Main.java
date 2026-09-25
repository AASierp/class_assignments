package zoo;

public class Main {
    public static void main(String[] args)  {
        Animal hilde = new Animal("Ragnhild Furrybottom", "Dog", "Omnivore");
        ZooWorker steven = new Caretaker("Steven", "spetersen@yorksolutions.net", "Dogs");
    
        FeedingService feedingService = new ConsoleFeedingService();

        feedingService.feed(hilde);

        System.out.println(hilde.getName());
        System.out.println(steven.getContactSummary());
    }
}