package third;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Noise {
    private String noiseName;
    private int loud;

    @Override
    public String toString() {
        return this.noiseName;
    }
}
