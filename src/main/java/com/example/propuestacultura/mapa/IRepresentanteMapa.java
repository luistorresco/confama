package com.example.propuestacultura.mapa;

import com.example.propuestacultura.DTO.RepresentanteDTO;
import com.example.propuestacultura.models.Representante;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IRepresentanteMapa {

    @Mappings({
            @Mapping(source="tipo_documento.tipo_documento", target="tipo_documento"),
    })
    RepresentanteDTO representanteToDTO(Representante representante);

}
