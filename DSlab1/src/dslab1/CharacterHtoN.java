/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dslab1;

/**
 *
 * @author Forge-15 i7
 */
class CharacterHtoN extends Banner {

    public CharacterHtoN(char character) {
        this.character = character;

        switch (character) {
            case 'H':
                line[0] = "";
                line[1] = "";
                line[2] = "";
                line[3] = "";
                line[4] = "";
                break;
            case 'I':
                line[0] = "";
                line[1] = "";
                line[2] = "";
                line[3] = "";
                line[4] = "";
                break;
            case 'J':
                line[0] = "";
                line[1] = "";
                line[2] = "";
                line[3] = "";
                line[4] = "";
                break;
            case 'K':
                line[0] = "*   *";
                line[1] = "* *  ";
                line[2] = "*    ";
                line[3] = "* *  ";
                line[4] = "*   *";
                break;
            case 'L':
                line[0] = "";
                line[1] = "";
                line[2] = "";
                line[3] = "";
                line[4] = "";
                break;
            case 'M':
                line[0] = "*   *";
                line[1] = "** **";
                line[2] = "* * *";
                line[3] = "*   *";
                line[4] = "*   *";
                break;
            case 'N':
                line[0] = "";
                line[1] = "";
                line[2] = "";
                line[3] = "";
                line[4] = "";
                break;
        }
    }
}
