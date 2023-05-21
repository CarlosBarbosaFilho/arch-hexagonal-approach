package br.com.cbgomes.application.domain.errors;

import br.com.cbgomes.application.utils.ConfigMessageProperties;
import lombok.AllArgsConstructor;

import java.util.Locale;

@AllArgsConstructor
public final class ConstantsMessage {
    public static final String ERROR_CREATE_REGISTRY =
            ConfigMessageProperties.messageSource()
                    .getMessage("error.create.registry", null, Locale.ENGLISH);

}
