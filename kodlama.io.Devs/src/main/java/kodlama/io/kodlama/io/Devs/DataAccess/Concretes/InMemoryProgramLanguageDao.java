package kodlama.io.kodlama.io.Devs.DataAccess.Concretes;

import kodlama.io.kodlama.io.Devs.DataAccess.Abstracts.IProgramLanguageDao;
import kodlama.io.kodlama.io.Devs.Entities.Concretes.ProgramLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgramLanguageDao implements IProgramLanguageDao {

    List<ProgramLanguage> languages;

    public InMemoryProgramLanguageDao() {
        languages = new ArrayList<ProgramLanguage>();
        languages.add(new ProgramLanguage(1, "C#"));
        languages.add(new ProgramLanguage(2, "Java"));
        languages.add(new ProgramLanguage(3, "Javascript"));
        languages.add(new ProgramLanguage(4, "Phyton"));

    }

    @Override
    public List<ProgramLanguage> getAll() {
        return languages;
    }

    @Override
    public ProgramLanguage getById(int id) {
        for (ProgramLanguage lang : languages) {
            if (lang.getId() == id) {
                return lang;
            }
        }
        return null;
    }

    @Override
    public void add(ProgramLanguage language) {
        languages.add(language);
    }

    @Override
    public void delete(int id) {
        for (ProgramLanguage lang : languages) {
            if (lang.getId() == id) {
                languages.remove(id);
            }
        }
    }

    @Override
    public void update(ProgramLanguage language, int id) {
        ProgramLanguage language1=getById(language.getId());
        language1.setName(language.getName());
    }
}
