package org.example;

import org.example.Convert.CarConvert;
import org.example.Dto.CarDto;
import org.example.Dto.PartDto;
import org.example.Dto.PersonDto;
import org.example.Vo.CarVo;

import java.util.ArrayList;


public class Test  {
    public static void main(String[] args) {

        CarDto carDto = getCarDto();

        // 根据你配置的映射规则把CarDto转化为CarVO
        CarVo carVo = CarConvert.INSTANCE.getCarVo(carDto);

        // 输出
        System.out.println(carDto);
        System.out.println(carVo);
    }

    // 获得对应的CarDto
    private static CarDto getCarDto(){
        CarDto carDto = new CarDto();
        carDto.setId(1);
        carDto.setName("丰田");
        carDto.setPrice(4.20);
        carDto.setPersonDto(new PersonDto(10,"张三"));
        carDto.setNum(50);

        ArrayList<PartDto> partDtoList = new ArrayList<>();
        partDtoList.add(new PartDto(3,"轮胎"));

        carDto.setPartList(partDtoList);
        return carDto;
    }
}