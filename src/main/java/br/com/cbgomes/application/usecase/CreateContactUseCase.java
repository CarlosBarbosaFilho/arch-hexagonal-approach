package br.com.cbgomes.application.usecase;

//In this case, we go implements the input port, of application. Is this port begin all process data input.

import br.com.cbgomes.application.domain.Contact;
import br.com.cbgomes.application.ports.input.ICreateContactUserCase;
import br.com.cbgomes.application.ports.output.IContactRepositoryPort;
import br.com.cbgomes.application.utils.UseCase;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@AllArgsConstructor
@UseCase
public class CreateContactUseCase implements ICreateContactUserCase {

    private static  final Logger LOGGER = LoggerFactory.getLogger(CreateContactUseCase.class);

    // Is necessary a output port to external world, to call the database and save the contact, in this case we has
    // the repository which received with arguments request contact
    private final IContactRepositoryPort iContactRepositoryPort;

    @Override
    public Contact execute(Contact contactDomain) {
        LOGGER.info("Start process: Save contact {}", contactDomain);
        return contactDomain.save(this.iContactRepositoryPort);
    }
}
