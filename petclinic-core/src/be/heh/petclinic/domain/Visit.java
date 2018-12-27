package be.heh.petclinic.domain;

public class Visit extends BaseEntity {

    private int animalId;
    private String date;
    private String description;
    
    public int getAnimalId() {
        return this.animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    



}
