package rabbits;

public class Rabbit {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    private String species;

    private boolean available;

    public void setAvailable(boolean available) {
        this.available = available;
    }


    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public boolean isAvailable(){
        return available;
    }

    public Rabbit(String name,String species){
        this.name=name;
        this.species=species;
        this.available=true;
    }

    @Override
    public String toString(){
        return String.format("Rabbit (%s): %s"
        ,getSpecies()
        ,getName());
    }




}
