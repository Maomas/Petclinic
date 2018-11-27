package be.heh.petclinic.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.support.MutableSortDefinition;
import org.springframework.beans.support.PropertyComparator;

public class Vet extends Person {

    private String specialty;

    public void setSpecialty(String spe) {
        this.specialty = spe;
    }

    public String getSpecialty() {
        return this.specialty;
    }

}