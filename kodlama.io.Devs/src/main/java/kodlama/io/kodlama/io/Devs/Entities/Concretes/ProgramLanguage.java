package kodlama.io.kodlama.io.Devs.Entities.Concretes;

public class ProgramLanguage {
    private int id;
    private String name;

    public ProgramLanguage(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProgramLanguage() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
