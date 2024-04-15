package telran.probes.dto;

import static telran.probes.messages.ValidationErrorMessages.*;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public record AccountDto(@NotEmpty(message = MISSING_EMAILS) @Email(message = WRONG_EMAIL_FORMAT) String email, 
		@NotEmpty(message = MISSING_PASSWORD) @Size(min = MIN_CHARACTERS_SIZE_PASSWORD,
         message = ACCOUNT_PASSWORD_WRONG_LENGTH) String password, @NotEmpty String[] roles) {

}
