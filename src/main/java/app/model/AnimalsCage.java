package app.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AnimalsCage {
    private Animal animalCat;
    private Animal animalDog;
    private Timer timer;

    public Timer getTimer() {
        return timer;
    }
    @Autowired
    public AnimalsCage(@Qualifier("cat") Animal animalCat,
                       @Qualifier("dog") Animal animalDog) {
        this.animalCat = animalCat;
        this.animalDog = animalDog;
    }
    public void whatAnimalSay() {
        System.out.println("Say:");
        System.out.println(animalCat.toString() + animalDog.toString());
        System.out.println("At:");
        System.out.println(Timer.getTime());
        System.out.println("________________________");
    }
}
