package be.heh.petclinic.domain;

public class Visit extends BaseEntity {

    private int animalId;
    private String date;
    private String description;
    private String petName;
    private String petBirthDate;
    
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

    public void setPetName(String petName){
        this.petName = petName;
    }

    public String getPetName() {
        return this.petName;
    }

    public void setPetBirthDate(String petBirthDate){
        this.petBirthDate = petBirthDate;
    }

    public String getPetBirthDate(){
        return this.petBirthDate;
    }


    



}
