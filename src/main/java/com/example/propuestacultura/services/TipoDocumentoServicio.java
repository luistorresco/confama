package com.example.propuestacultura.services;

import com.example.propuestacultura.DTO.TipoDocumentoDTO;
import com.example.propuestacultura.DTO.TipoProponenteDTO;
import com.example.propuestacultura.mapa.ITipoDocumentoMapa;
import com.example.propuestacultura.models.TipoDocumento;
import com.example.propuestacultura.repositorios.ITipODocumentoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoServicio {

    @Autowired
    ITipODocumentoRepositorio iTipODocumentoRepositorio;

    @Autowired
    ITipoDocumentoMapa iTipoDocumentoMapa;

    //Rutina para guardar en BD un tipoDocumento
    public TipoDocumentoDTO agregarTipODocumento(TipoDocumento datosTipoDocumento) throws Exception{
        try{
            //validar primero

            //llamar al repo para ejecutar la consulta
            return this.iTipoDocumentoMapa.tipoDocuementoTODTO(this.iTipODocumentoRepositorio.save(datosTipoDocumento));


        }catch(Exception error){
            throw new Exception(error.getMessage());

        }

    }


    //RUTINA PARA BUSCAR UN ELEMENTO DENTRO BD POR ID
    public TipoDocumentoDTO buscarTipoDocumentoPorId(Integer id) throws Exception{
        try{
            if(this.iTipODocumentoRepositorio.findById(id).isPresent()){
              //devuelvalo
                return this.iTipoDocumentoMapa.tipoDocuementoTODTO(this.iTipODocumentoRepositorio.findById(id).get());
            }else{
                //diga que no esta
                throw new Exception("Usuario no encontrado");

            }
        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public List<TipoDocumentoDTO> buscarTodosTiposDocumentos() throws Exception{
        try{
            return this.iTipoDocumentoMapa.toDtoList(iTipODocumentoRepositorio.findAll());

        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

    public TipoDocumentoDTO modificarTipoDocumento(Integer id, TipoDocumento tipoDocumento) throws Exception{
        try{
            if(this.iTipODocumentoRepositorio.findById(id).isPresent()){
                //cambielo
                TipoDocumento objetoEncontrado=this.iTipODocumentoRepositorio.findById(id).get();
                objetoEncontrado.setTipo_documento(tipoDocumento.getTipo_documento());
                return this.iTipoDocumentoMapa.tipoDocuementoTODTO(iTipODocumentoRepositorio.save(objetoEncontrado));
            }else{
                //diga que no esta
                throw new Exception("Usuario no encontrado");
            }


        }catch(Exception error){
            throw new Exception(error.getMessage());
        }
    }

}
