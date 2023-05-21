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
