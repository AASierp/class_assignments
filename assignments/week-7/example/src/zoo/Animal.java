package zoo;

public class Animal {
    private String name;
    private String species;
    private String dietType;

    public Animal(String name, String species, String dietType) {
        this.name = name;
        this.species = species;
        this.dietType = dietType;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getDietType() {
        return dietType;
    }

    
}
