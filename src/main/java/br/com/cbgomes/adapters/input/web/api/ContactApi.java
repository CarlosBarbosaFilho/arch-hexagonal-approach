package br.com.cbgomes.adapters.input.web.api;

import br.com.cbgomes.adapters.input.web.api.request.ContactRequest;
import br.com.cbgomes.adapters.input.web.api.response.ContactResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/api/v1/contacts")
public interface ContactApi {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<ContactResponse> create(@RequestBody ContactRequest contactRequest);
    

}
