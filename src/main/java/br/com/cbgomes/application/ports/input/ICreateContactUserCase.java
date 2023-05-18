package br.com.cbgomes.application.ports.input;

import br.com.cbgomes.application.domain.Contact;

// Input port interface to start the process
// Is here winch the all process begin to create a contact in database
public interface ICreateContactUserCase {

    Contact execute(Contact contactDomain);
}
