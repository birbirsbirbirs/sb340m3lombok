package co.ptm.sb340m3;

import lombok.*;

@Getter
@Setter
@ToString(exclude = {"dept","id"})
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Hero {
    private int id;
    private String name;
    private String power;

    public String getPower() {
        return "hello"+power;
    }

}
