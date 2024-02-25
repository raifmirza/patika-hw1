package org.example.Structures;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Villa extends BaseStructure{
    private boolean hasGarden;
    private boolean hasGarage;
}
