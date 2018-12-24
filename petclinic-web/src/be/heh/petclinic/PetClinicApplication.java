package be.heh.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"be.heh.petclinic.component.pet.PetComponent"})
@ImportResource({"classpath*:be/heh/petclinic/config.xml","classpath*:be/heh/petclinic/**/component.xml"})
public class PetClinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetClinicApplication.class, args);
	}
}