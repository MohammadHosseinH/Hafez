import com.fasterxml.jackson.annotation.*;
public class Faal {
    @JsonProperty("Poem")
    private String Poem;
    @JsonProperty("Interpretation")
    private String Interpretation;

    public String getInterpretation() {
        return Interpretation;
    }

    public String getPoem() {
        return Poem;
    }

    public void setPoem(String poem) {
        Poem = poem;
    }
}
