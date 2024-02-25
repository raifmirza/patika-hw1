package org.example.Service;

import lombok.NoArgsConstructor;
import org.example.Structures.BaseStructure;
import org.example.Structures.Flat;
import org.example.Structures.Resort;
import org.example.Structures.Villa;

import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
public class BaseService<T extends BaseStructure> {
    public Integer sumPrice(List<T> t){
        int sum = 0;
        for(T home:t){
            sum +=home.getPrice();
        }
        return sum;
    }
    public Double avgSquareMeter(List<T> t){
        int sumSquareMeters = 0;
        for(T home:t){
            sumSquareMeters+=home.getSquareMeter();
        }

        return (double) sumSquareMeters / t.size();
    }
}
