package br.com.cbgomes.application.domain;

import br.com.cbgomes.adapters.input.web.api.response.ContactResponse;
import br.com.cbgomes.adapters.output.h2.entity.ContactEntity;
import br.com.cbgomes.application.ports.output.IContactRepositoryPort;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Contact {

    private Long id;
    private String name;
    private String email;
    private String phone;

    public ContactEntity toContactEntity(Contact domain){
        return ContactEntity.builder()
                .name(domain.name)
                .email(domain.email)
                .phone(domain.phone)
                .build();
    }

    public ContactResponse toContactResponse(Contact domain) {
        return ContactResponse.builder()
                .id(domain.id)
                .name(domain.name)
                .email(domain.email)
                .phone(domain.phone)
                .build();
    }

    public Contact save(IContactRepositoryPort iContactRepositoryPort) {
        validContactDomain(this);
        return iContactRepositoryPort.createSave(this);
    }

    private void validContactDomain(Contact domain) {
       if (domain.name == null || domain.name.isEmpty()) {
            throw  new IllegalArgumentException("Contact name is not by null or empty");
       }

        if (domain.email == null || domain.email.isEmpty()) {
            throw  new IllegalArgumentException("Contact e-mail is not by null or empty");
        }

        if (domain.phone == null || domain.phone.isEmpty()) {
            throw  new IllegalArgumentException("Contact phone is not by null or empty");
        }
    }
}
