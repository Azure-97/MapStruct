package org.example.Vo;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class CarVo {
    /**
     * 车辆id
     */
    private Integer id;
    /**
     * 车辆名字
     */
    private String name;
    /**
     * 车辆价格
     */
    private String price;
    /**
     * 车辆数量
     */
    private Integer carNum;
    /**
     * 车辆是否存在零部件
     */
    private Boolean isPart;
    /**
     * 驾驶人
     */
    private PersonVo personVo;

    @Override
    public String toString() {
        return "org.example.Vo.CarVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", carNum=" + carNum +
                ", isPart=" + isPart +
                ", personVo=" + personVo +
                '}';
    }
}
