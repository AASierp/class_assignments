package zoo;

import java.util.ArrayList;
import java.util.List;

public class Enclosure {
    private int id;
    private String name;
    private EnclosureSize enclosureSize;
    private EnclosureStatus status;
    private Caretaker caretaker;
    private List<Animal> animals;
    private List<String> notes;

    public Enclosure(int id, String name, EnclosureSize enclosureSize) {
        this.id = id;
        this.name = name;
        this.enclosureSize = enclosureSize;
        this.status = EnclosureStatus.OPEN;
        this.animals = new ArrayList<>();
        this.notes = new ArrayList<>();
    }

    public Enclosure(int id, String name, EnclosureSize enclosureSize, EnclosureStatus status) {
        this.id = id;
        this.name = name;
        this.enclosureSize = enclosureSize;
        this.status = status;
        this.animals = new ArrayList<>();
        this.notes = new ArrayList<>();
    }

    public void addNote(String note) {
        if (note == null || note.isBlank()) {
            throw new IllegalArgumentException("Note cannot be blank.");
        }

        notes.add(note);
    }

    public void closeForMaintenance() {
        status = EnclosureStatus.MAINTENANCE;
        addNote("Closed for maintenance");
    }

    public String getSummary() {
        return "#" + id + " " + name + " (" + enclosureSize + ") - " + status;
    }

    public String getDetailedDescription() {
        String assignedCaretaker = caretaker == null
            ? "Unassigned"
            : caretaker.getContactSummary();

        return getSummary()
        + "\nAnimals:" + animals
        + "\nCaretaker:" + assignedCaretaker
        + "\nNotes:" + notes;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public EnclosureSize getEnclosureSize() {
        return enclosureSize;
    }

    public EnclosureStatus getStatus() {
        return status;
    }

    public Caretaker getCaretaker() {
        return caretaker;
    }

    public List<Animal> getAnimals() {
        return new ArrayList<>(animals);
    }
}
