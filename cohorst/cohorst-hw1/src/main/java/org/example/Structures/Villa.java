package org.example.Structures;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
public class Villa extends BaseStructure{
    private boolean hasGarden;
    public Villa(Integer roomNumber, Integer squareMeter, Integer loungeNumber,Integer price,boolean hasGarden){
        super(roomNumber,squareMeter,loungeNumber,price);
        this.hasGarden=hasGarden;
    }
}
