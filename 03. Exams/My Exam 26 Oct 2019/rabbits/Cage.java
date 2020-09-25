package rabbits;

import java.util.ArrayList;
import java.util.List;

public class Cage {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    private int capacity;
    private List<Rabbit> data;




    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }


    public Cage(String name, int capacity){
        this.name=name;
        this.capacity=capacity;
        this.data=new ArrayList<>();

    }


    public void add(Rabbit rabbit){
        if(this.data.size()<getCapacity()){
            this.data.add(rabbit);
        }
    }

    public boolean removeRabbit(String name){
        for (int i = 0; i <this.data.size(); i++) {
            if(this.data.get(i).getName().equals(name)){
                this.data.remove(i);
                return true;
            }
        }

        return false;

    }

    public void removeSpecies(String species){
        for (int i = 0; i <this.data.size() ; i++) {
            if(this.data.get(i).getSpecies().equals(species)){
                this.data.remove(i);
                i--;
            }
        }
    }

    public Rabbit sellRabbit(String name){
        Rabbit r=new Rabbit("fs","sfs");
        for (int i = 0; i <this.data.size() ; i++) {
            if(this.data.get(i).getName().equals(name)){
                this.data.get(i).setAvailable(false);
                return this.data.get(i);

            }
        }
        return r;
    }

    public List<Rabbit> sellRabbitBySpecies(String species){
        List<Rabbit> rb=new ArrayList<>();
        for (int i = 0; i <this.data.size() ; i++) {
            if(this.data.get(i).getSpecies().equals(species)){
                this.data.get(i).setAvailable(false);
                rb.add(this.data.get(i));
            }
        }
        return rb;
    }

    public String report(){

        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Rabbits available at %s:%n",getName()));
        for (int i = 0; i <this.data.size() ; i++) {
            if(this.data.get(i).isAvailable()){
                sb.append(this.data.get(i).toString()).append("\n");
            }
        }
        return sb.toString().trim();


        //String text="";


    }

    public int count(){
        return this.data.size();
    }








}
