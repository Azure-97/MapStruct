package org.example.Dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class CarDto {
    /**
     * 车辆id
     */
    private int id;
    /**
     * 车辆名字
     */
    private String name;
    /**
     * 车辆价格
     */
    private double price;
    /**
     * 车辆数量
     */
    private int num;
    /**
     * 车辆部件
     */
    private List<PartDto> partList;
    /**
     * 驾驶人
     */
    private PersonDto personDto;

    @Override
    public String toString() {
        return "org.example.Dto.CarDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", num=" + num +
                ", partList=" + partList +
                ", personDto=" + personDto +
                '}';
    }
}

