package org.example.Convert;

import org.example.Dto.CarDto;
import org.example.Dto.PartDto;
import org.example.Dto.PersonDto;
import org.example.Vo.CarVo;
import org.example.Vo.PersonVo;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @description: TODO
 * @author: Azure
 * @date: 2024/10/9 周三 11:05
 * @Version 1.0
 **/
@Mapper
public interface CarConvert {
    CarConvert INSTANCE= Mappers.getMapper(CarConvert.class);

    /**
     * Mapping注解的参数解释：
     *      1、source：源属性名称，即CarDto类下的属性名称
     *      2、target：目标属性名称，即CarVo类下的属性名称
     */
    @Mappings({
            @Mapping(source = "num",target = "carNum"),
            @Mapping(source = "personDto",target = "personVo")
    })
    public CarVo getCarVo(CarDto carDto);

    /**
     * 指定PersonDto转换为PersonVo
     */
    @Mappings({
            @Mapping(source = "personId",target = "id"),
            @Mapping(source = "personName",target = "name")
    })
    public PersonVo personDtoToPersonVo(PersonDto personDto);

    /**
     * 在映射的最后一步对属性的自定义映射处理
     */
    @AfterMapping //表示让MapStruct在调用完自动转换方法后，回来自动调用本方法
    public default void dtoVoAfter(CarDto carDto, @MappingTarget CarVo carVo){
        // @MappingTarget : 表示传来的carVO对象是已经赋过值的

        // 判断CarDto的零部件是否有值
        List<PartDto> dtoPartList = carDto.getPartList();
        boolean isPart=(dtoPartList!=null&&dtoPartList.size()!=0);
        carVo.setIsPart(isPart);
    }
}
