package com.example.propuestacultura.DTO;

public class RepresentanteDTO {

    private String tipo_documento;
    private String numero_documento;
    private String primer_nombre;
    private String primer_apellido;
    private String telefono_fijo;
    private String telefono_celular;
    private String correo_electronico;

    public RepresentanteDTO() {
    }

    public RepresentanteDTO(String tipo_documento, String numero_documento, String primer_nombre,
                            String primer_apellido, String telefono_fijo, String telefono_celular
            , String correo_electronico) {
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.primer_nombre = primer_nombre;
        this.primer_apellido = primer_apellido;
        this.telefono_fijo = telefono_fijo;
        this.telefono_celular = telefono_celular;
        this.correo_electronico = correo_electronico;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getPrimer_nombre() {
        return primer_nombre;
    }

    public void setPrimer_nombre(String primer_nombre) {
        this.primer_nombre = primer_nombre;
    }

    public String getPrimer_apellido() {
        return primer_apellido;
    }

    public void setPrimer_apellido(String primer_apellido) {
        this.primer_apellido = primer_apellido;
    }

    public String getTelefono_fijo() {
        return telefono_fijo;
    }

    public void setTelefono_fijo(String telefono_fijo) {
        this.telefono_fijo = telefono_fijo;
    }

    public String getTelefono_celular() {
        return telefono_celular;
    }

    public void setTelefono_celular(String telefono_celular) {
        this.telefono_celular = telefono_celular;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }
}