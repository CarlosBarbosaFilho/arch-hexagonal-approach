package br.com.cbgomes.adapters.input.web.api.response;

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
}
