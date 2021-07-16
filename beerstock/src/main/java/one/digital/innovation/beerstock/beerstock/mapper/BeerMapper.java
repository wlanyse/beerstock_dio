package one.digital.innovation.beerstock.beerstock.mapper;

import one.digital.innovation.beerstock.beerstock.dto.BeerDTO;
import one.digital.innovation.beerstock.beerstock.entity.Beer;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface BeerMapper {

    BeerMapper INSTANCE =  Mappers.getMapper(BeerMapper.class);

    Beer toModel(BeerDTO beerDTO);

    BeerDTO toDTO(Beer beer);
}