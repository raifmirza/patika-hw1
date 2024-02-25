package org.example.Structures;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class BaseStructure {
    private Integer roomNumber;
    private Integer squareMeter;
    private Integer loungeNumber;
    private Integer price;

}
