package org.example.Dto; /**
 * @description: TODO
 * @author: Azure
 * @date: 2024/10/9 周三 11:04
 * @Version 1.0
 **/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 驾驶人Dto
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDto {
    /**
     * 驾驶人id
     */
    private int personId;
    /**
     * 驾驶人名字
     */
    private String  personName;
}
