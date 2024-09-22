package co.ptm.sb340m3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Vehicle {
    private String make;
    private String model;
}
