package be.heh.petclinic.domain;


public class Animal extends NamedEntity {

    private String birthDate;

    private String type;

    private int ownerId;

    public Integer getId() {
        return this.id;
    }

    public void setId(int id) { this.id = id; }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    

}