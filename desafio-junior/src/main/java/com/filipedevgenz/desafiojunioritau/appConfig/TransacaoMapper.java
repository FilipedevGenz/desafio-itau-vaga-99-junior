package com.filipedevgenz.desafiojunioritau.appConfig;
import com.filipedevgenz.desafiojunioritau.dto.TransacaoRequestDto;
import com.filipedevgenz.desafiojunioritau.model.Transacao;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;

@Mapper(componentModel = "spring")
public interface TransacaoMapper {

    TransacaoMapper INSTANCE = Mappers.getMapper(TransacaoMapper.class);

    Transacao toEntity(TransacaoRequestDto dto);
}
