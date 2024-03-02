package com.example.propuestacultura.models.keys;

import java.io.Serializable;
import java.util.UUID;

public class DocumentoAdjuntoPropuestaPK implements Serializable {

    private UUID propuesta;
    private Integer documentosAdjuntos;

    public UUID getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(UUID propuesta) {
        this.propuesta = propuesta;
    }

    public Integer getDocumentosAdjuntos() {
        return documentosAdjuntos;
    }

    public void setDocumentosAdjuntos(Integer documentosAdjuntos) {
        this.documentosAdjuntos = documentosAdjuntos;
    }
}



