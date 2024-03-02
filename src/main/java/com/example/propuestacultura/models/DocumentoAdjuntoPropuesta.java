package com.example.propuestacultura.models;

import com.example.propuestacultura.models.keys.DocumentoAdjuntoPropuestaPK;
import jakarta.persistence.*;

@Entity
@Table(name = "propuesta_documento")
@IdClass(DocumentoAdjuntoPropuestaPK.class)
public class DocumentoAdjuntoPropuesta {
    @Id
    @ManyToOne
    @JoinColumn(name = "id_propuesta", referencedColumnName = "id_propuesta")
    private Propuesta propuesta;

    @Id
    @ManyToOne
    @JoinColumn(name="id_documentoAdjunto", referencedColumnName = "id_documentoAdjunto")
    private DocumentosAdjuntos documentosAdjuntos;


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
