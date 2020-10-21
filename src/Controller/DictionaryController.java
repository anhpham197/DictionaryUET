package Controller;

import Entity.Word;
import Model.DictionaryRepo;

import java.sql.SQLException;
import java.util.List;

public class DictionaryController {
    DictionaryRepo repo = new DictionaryRepo();

    public List<Word> ShowList() throws SQLException {
        return repo.GetListInDB();
    }

    public void PrintList() throws SQLException {
        for (Word word : ShowList()) {
            System.out.println("ID : " + word.getID());
            System.out.println("Word : " + word.getWord());
            System.out.println("Pronunciation : " + word.getPronunciation());
            System.out.println("Define : " + word.getDefine() + "\n");
        }
    }

    public Word SearchWord(String wordToFind) throws SQLException {
        return repo.SearchInDB(wordToFind);
    }

    public void AddNewWord(Word newWord) throws SQLException {
        repo.AddInDB(newWord);
    }

    public void UpdateWord(Word data, String newPronunciation, String newDefine) throws SQLException {
        repo.UpdateInDB(data, newPronunciation, newDefine);
    }
    
    public void DeleteWord(String wordDelete) throws SQLException {
        repo.DeleteInDB(wordDelete);
    }
}
