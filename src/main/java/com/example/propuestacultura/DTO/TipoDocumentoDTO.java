package com.example.propuestacultura.DTO;

public class TipoDocumentoDTO {

    private Integer id;
    private String tipoDocumento;

    public TipoDocumentoDTO() {
    }

    public TipoDocumentoDTO(Integer id, String tipoDocuemento) {
        this.id = id;
        this.tipoDocumento = tipoDocuemento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoDocuemento() {
        return tipoDocumento;
    }

    public void setTipoDocuemento(String tipoDocuemento) {
        this.tipoDocumento = tipoDocuemento;
    }
}
