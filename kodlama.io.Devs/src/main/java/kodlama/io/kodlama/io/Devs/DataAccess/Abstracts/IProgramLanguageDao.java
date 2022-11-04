package kodlama.io.kodlama.io.Devs.DataAccess.Abstracts;

import kodlama.io.kodlama.io.Devs.Entities.Concretes.ProgramLanguage;

import java.util.List;

public interface IProgramLanguageDao {
    List<ProgramLanguage> getAll();
    ProgramLanguage getById(int id);
    void add(ProgramLanguage language);
    void delete(int id);
    void update(ProgramLanguage language,int id);
}
