package br.com.cbgomes.adapters.input.web.controller;

import br.com.cbgomes.adapters.input.web.api.ContactApi;
import br.com.cbgomes.adapters.input.web.api.request.ContactRequest;
import br.com.cbgomes.adapters.input.web.api.response.ContactResponse;
import br.com.cbgomes.application.ports.input.ICreateContactUserCase;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class ContactController implements ContactApi {

    private final ICreateContactUserCase iCreateContactUserCase;
    @Override
    public ResponseEntity<ContactResponse> create(ContactRequest contactRequest) {
        var domain = iCreateContactUserCase.execute(contactRequest.toDomain(contactRequest));
        return ResponseEntity.ok(domain.toContactResponse(domain));
    }
}
