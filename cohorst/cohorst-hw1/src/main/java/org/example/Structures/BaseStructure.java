package org.example.Structures;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BaseStructure {
    private String name;
    private Integer roomNumber;
    private Double squareMeter;
    private String address;
    private BigDecimal price;

}
