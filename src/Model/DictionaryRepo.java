package Model;

import ConnectUtil.ConnectToDB;
import Entity.Word;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DictionaryRepo {
    Connection con = ConnectToDB.getConnect();
    Statement sqlFile = null;
    ResultSet rs = null;
    PreparedStatement ps = null;

    public List<Word> GetListInDB() throws SQLException {
        List<Word> listWord = new ArrayList<>();
        sqlFile = con.createStatement();
        rs = sqlFile.executeQuery("SELECT * FROM tbltest ORDER BY Word");

        while (rs.next()) {
            Word newObj = new Word();
            newObj.setID(rs.getInt("ID"));
            newObj.setWord(rs.getString("Word"));
            newObj.setPronunciation(rs.getString("Pronunciation"));
            newObj.setDefine(rs.getString("Define"));
            listWord.add(newObj);
        }
        return listWord;
    }

    public Word SearchInDB(String wordToFind) throws SQLException {
        String updateQuerySe = "SELECT * FROM tbltest WHERE Word = ?";
        ps = con.prepareStatement(updateQuerySe);
        ps.setString(1, wordToFind);
        rs = ps.executeQuery();
        Word newObj = null;
        while (rs.next()) {
            newObj = new Word();
            newObj.setWord(rs.getString("Word"));
            newObj.setPronunciation(rs.getString("Pronunciation"));
            newObj.setDefine(rs.getString("Define"));
        }
        return newObj;
    }

    public void AddInDB(Word newWord) throws SQLException {
        //fix add in position
        String insertQuery = "INSERT INTO tbltest(word,pronunciation,define) VALUES(?,?,?)";
        ps = con.prepareStatement(insertQuery);
        ps.setString(1, newWord.getWord());
        ps.setString(2, newWord.getPronunciation());
        ps.setString(3, newWord.getDefine());

        ps.executeUpdate();
    }

    public void UpdateInDB(Word data, String newPronunciation, String newDefine) throws SQLException {
        String updateQuery = "UPDATE tbltest SET Pronunciation = ? , Define = ? WHERE Word = ?";
        ps = con.prepareStatement(updateQuery);
        ps.setString(1, newPronunciation);
        ps.setString(2, newDefine);
        ps.setString(3, data.getWord());
        ps.executeUpdate();
    }

    public void DeleteInDB(String wordDelete) throws SQLException {
        String delQuery = "DELETE FROM tbltest WHERE Word = ?";
        ps = con.prepareStatement(delQuery);
        ps.setString(1, wordDelete);
        ps.executeUpdate();
    }
}
