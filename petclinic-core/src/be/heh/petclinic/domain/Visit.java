package be.heh.petclinic.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Visit extends BaseEntity {

    private int id;
    private LocalDate date;
    private String description;
    private Animal animal;
    private int animalId;

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        this.date = localDate;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Animal getAnimal() {
        return this.animal;
    }

    public void setAnimalId(int petId) {
        this.animal.setId(animalId);
    }

    public int getAnimalId() {
        return this.animal.getId();
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }



}
