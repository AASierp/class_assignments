package zoo;

public class ZooWorker {
    protected String name;
    protected String email;

    public ZooWorker(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // public void someFunction(String name) {
    //     System.out.println(name + this.name);
    // }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getContactSummary() {
        return name + " <" + email + ">";
    }
}
