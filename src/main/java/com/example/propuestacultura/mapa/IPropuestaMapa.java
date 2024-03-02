package com.example.propuestacultura.mapa;

import com.example.propuestacultura.DTO.PropuestaDTO;
import com.example.propuestacultura.models.Propuesta;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface IPropuestaMapa {

    @Mappings({
            @Mapping(source = "id_propuesta", target = "id_propuesta"),
            @Mapping(source = "nombre_propuesta", target = "nombre_propuesta")
    })
    PropuestaDTO propuestaDTO(Propuesta propuesta);
}
