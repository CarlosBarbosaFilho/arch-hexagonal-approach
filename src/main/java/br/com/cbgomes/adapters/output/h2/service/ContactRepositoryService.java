package br.com.cbgomes.adapters.output.h2.service;

import br.com.cbgomes.adapters.output.h2.repository.ContactRepository;
import br.com.cbgomes.application.domain.Contact;
import br.com.cbgomes.application.ports.output.IContactRepositoryPort;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class ContactRepositoryService implements IContactRepositoryPort {

    private final ContactRepository contactRepository;
    @Override
    public Contact createSave(Contact contactDomain) {
         var entity =  this.contactRepository.save(contactDomain.toContactEntity(contactDomain));
         return Contact.builder()
                 .id(entity.getId())
                 .name(entity.getName())
                 .email(entity.getEmail())
                 .phone(entity.getPhone())
                 .build();
    }
}
