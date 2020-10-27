package Entity;

public class Word {
    private int ID;
    private String word;
    private String pronunciation;
    private String define;
    public Word() {

    }
    public Word(String word, String pronunciation,String define) {
        this.word = word;
        this.pronunciation = pronunciation;
        this.define = define;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = standardizeString(word);
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public String getDefine() {
        return define;
    }

    public void setDefine(String define) {
        this.define = define;
    }

    public String showInTextArea() {
        String temp = "";
        String pron = pronunciation;
        String def = define;
        String[] resDef = def.split(";");
        if (!"".equals(pron)) {
            temp += pron + "\n";
        }
        for (String s : resDef) {
            temp += s + "\n";
        }
        System.out.print(temp);
        return temp;
    }

    @Override
    public String toString() {
        return word;
    }

    private String standardizeString(String word) {
        word.toLowerCase();
        word.trim();
        return word;
    }
}
