package com.example.propuestacultura.controllers;

import com.example.propuestacultura.DTO.errorDTO.TipoDocumentoErrorDTO;
import com.example.propuestacultura.models.TipoDocumento;
import com.example.propuestacultura.services.TipoDocumentoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/documento")
public class TipoDocumentoControlador {
    @Autowired
    TipoDocumentoServicio tipoDocumentoServicio;
    @PostMapping
    public ResponseEntity<?> guardarDocumento(@RequestBody TipoDocumento datosRecibidos){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.tipoDocumentoServicio.agregarTipODocumento(datosRecibidos));

        }catch (Exception error){
            TipoDocumentoErrorDTO errorPersonalizado= new TipoDocumentoErrorDTO();
            errorPersonalizado.setMensajeError(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errorPersonalizado.getMensajeError());


        }
    }

    @GetMapping
    public ResponseEntity<?>buscarDocumentos() {

        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.tipoDocumentoServicio.buscarTodosTiposDocumentos());

        } catch (Exception error) {
            TipoDocumentoErrorDTO errorPersonalizado = new TipoDocumentoErrorDTO();
            errorPersonalizado.setMensajeError(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(errorPersonalizado.getMensajeError());
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<?>BuscarUnDocumento(@PathVariable Integer id) {

        try {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(this.tipoDocumentoServicio.buscarTipoDocumentoPorId(id));

        } catch (Exception error) {
            TipoDocumentoErrorDTO errorPersonalizado = new TipoDocumentoErrorDTO();
            errorPersonalizado.setMensajeError(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(errorPersonalizado.getMensajeError());

        }
    }
    @PutMapping("/{id}")
    public  ResponseEntity<?> modificarDocumento(@RequestBody TipoDocumento datosRecibidos, Integer id){
        try {
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(this.tipoDocumentoServicio.modificarTipoDocumento(id, datosRecibidos));

        } catch (Exception error) {
            TipoDocumentoErrorDTO errorPersonalizado = new TipoDocumentoErrorDTO();
            errorPersonalizado.setMensajeError(error.getMessage());
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errorPersonalizado.getMensajeError());

        }
    }

}
