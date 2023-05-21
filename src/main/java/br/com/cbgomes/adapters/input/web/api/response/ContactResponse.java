package br.com.cbgomes.adapters.input.web.api.response;

import br.com.cbgomes.application.domain.Contact;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public  class ContactResponse {
    private Long id;
    private String name;
    private String email;
    private String phone;


    public static ContactResponse toContactResponse(Contact domain) {
        return ContactResponse.builder()
                .id(domain.getId())
                .name(domain.getName())
                .email(domain.getEmail())
                .phone(domain.getPhone())
                .build();
    }
}
