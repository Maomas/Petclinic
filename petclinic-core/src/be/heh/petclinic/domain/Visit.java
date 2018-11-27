package be.heh.petclinic.domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Visit extends BaseEntity {

    private int id;
    private LocalDate date;
    private String description;
    private Pet pet;
    private int petId;

    /*public Visit() {
        this.date = LocalDate.now();
    }*/

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

    public Pet getPet() {
        return this.pet;
    }

    public void setPetId(int petId) {
        this.pet.setId(petId);
    }

    public int getPetId() {
        return this.pet.getId();
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }



}
