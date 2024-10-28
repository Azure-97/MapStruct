package org.example.Dto; /**
 * @description: TODO
 * @author: Azure
 * @date: 2024/10/9 周三 11:03
 * @Version 1.0
 **/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 车辆零部件Dto
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PartDto {
    /**
     * 零部件id
     */
    private int partId;
    /**
     * 零部件名字
     *
     */
    private String partName;
}
