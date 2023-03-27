package io.papermc.hangar.security.webauthn.model;

import com.webauthn4j.data.attestation.AttestationObject;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

public record AttestationObjectForm(@NotNull @Valid AttestationObject attestationObject, @NotNull String attestationObjectBase64) {

    @Override
    public String toString() {
        return "AttestationObjectForm{" +
            "attestationObject=" + this.attestationObject +
            '}';
    }
}
