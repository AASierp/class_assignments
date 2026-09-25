package zoo;

public class Caretaker extends ZooWorker {
    private String specialty;

    public Caretaker(String name, String email, String specialty) {
        super(name, email);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override 
    public String getContactSummary() {
        return name + " <" + email + "> - " + specialty;
    }
}
