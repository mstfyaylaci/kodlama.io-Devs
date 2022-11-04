package kodlama.io.kodlama.io.Devs.Business.Absracts;

import kodlama.io.kodlama.io.Devs.Entities.Concretes.ProgramLanguage;

import java.util.List;

public interface IProgramLanguageService {
    List<ProgramLanguage> getAll();
    ProgramLanguage getById(int id);
    void add(ProgramLanguage language) throws Exception;
    void delete(int id);
    void update(ProgramLanguage language,int id);

    boolean isValid(ProgramLanguage language);
}
