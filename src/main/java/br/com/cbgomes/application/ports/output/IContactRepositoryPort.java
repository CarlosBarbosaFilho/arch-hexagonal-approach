package br.com.cbgomes.application.ports.output;

import br.com.cbgomes.application.domain.Contact;

public interface IContactRepositoryPort {

    Contact createSave(Contact contactDomain);
}
