package heroRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HeroRepository {
    private Map<String, Hero> heroes;

    public HeroRepository(){
        this.heroes=new HashMap<>();
    }

    public void add(Hero hero){
        this.heroes.put(hero.getName(),hero);
    }

    public void remove(String name){
        this.heroes.remove(name);
    }

    public Hero getHeroWithHighestStrength(){
        return this.heroes.values()
                .stream().sorted((f,s) -> s.getItem().getStrength()-f.getItem().getStrength())
                .collect(Collectors.toList())
                .get(0);
    }

    public Hero getHeroWithHighestAgility() {
        return this.heroes.values()
                .stream()
                .sorted((f, s) -> s.getItem().getAgility() - f.getItem().getAgility())
                .collect(Collectors.toList())
                .get(0);
    }

    public Hero getHeroWithHighestIntelligence() {
        return this.heroes.values()
                .stream()
                .sorted((f, s) -> s.getItem().getIntelligence() - f.getItem().getIntelligence())
                .collect(Collectors.toList())
                .get(0);
    }

    public int getCount(){
        return this.heroes.size();
    }


    @Override
    public String toString(){
        return String.join("\n",
                this.heroes
        .values()
                .stream()
                .map(Hero::toString)
                .collect(Collectors.toList()));
    }


}
