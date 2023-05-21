package br.com.cbgomes.adapters.output.h2.entity;

import br.com.cbgomes.application.domain.Contact;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String phone;

    public ContactEntity toContactEntity(Contact domain){
        return ContactEntity.builder()
                .name(domain.getName())
                .email(domain.getEmail())
                .phone(domain.getPhone())
                .build();
    }
}
