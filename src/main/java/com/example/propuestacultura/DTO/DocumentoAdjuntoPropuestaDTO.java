package com.example.propuestacultura.DTO;

import com.example.propuestacultura.models.DocumentosAdjuntos;
import com.example.propuestacultura.models.Propuesta;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class DocumentoAdjuntoPropuestaDTO {

    private Propuesta propuesta;

    private DocumentosAdjuntos documentosAdjuntos;

    public DocumentoAdjuntoPropuestaDTO() {
    }

    public DocumentoAdjuntoPropuestaDTO(Propuesta propuesta, DocumentosAdjuntos documentosAdjuntos) {
        this.propuesta = propuesta;
        this.documentosAdjuntos = documentosAdjuntos;
    }

    public Propuesta getPropuesta() {
        return propuesta;
    }

    public void setPropuesta(Propuesta propuesta) {
        this.propuesta = propuesta;
    }

    public DocumentosAdjuntos getDocumentosAdjuntos() {
        return documentosAdjuntos;
    }

    public void setDocumentosAdjuntos(DocumentosAdjuntos documentosAdjuntos) {
        this.documentosAdjuntos = documentosAdjuntos;
    }
}
