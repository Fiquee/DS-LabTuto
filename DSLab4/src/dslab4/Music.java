/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab4;

/**
 *
 * @author Forge-15 i7
 */
public class Music implements Comparable<Music>{
    String musictitle,filename;

    public Music(String musictitle, String filename) {
        this.musictitle = musictitle;
        this.filename = filename;
    }

    public String getMusictitle() {
        return musictitle;
    }

    public String getFilename() {
        return filename;
    }

    @Override
    public String toString() {
        return "Music : " + getMusictitle();
    }

    @Override
    public int compareTo(Music o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
