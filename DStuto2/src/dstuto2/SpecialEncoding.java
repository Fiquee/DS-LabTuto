/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dstuto2;

/**
 *
 * @author Forge-15 i7
 */
public class SpecialEncoding<T> {

    private T[] t;
    private String str;

    public SpecialEncoding(T[] t) {
        this.t = t;
        this.str = str;
    }



    public T[] getT() {
        return t;
    }

    public String getStr() {
        return str;
    }

    public void setT(T[] t) {
        this.t = t;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        String codes = getCode() + "\n" + getCommand();
        return codes;
    }

    public String getCode() {
        String code = "The code is ";
            for (int i = 0; i < t.length; i++) {
                code = code + t[i] + " ";
            }
        return code;
    }

    public String getCommand() {
        str = "The command is ";
        if (t instanceof Integer[]) {
//            Integer[] x = (Integer[]) t;
            for (int i = 0; i < t.length; i++) {
                switch((Integer)t[i]){
                    case 0: str+="Copy ";
                            break;
                    case 1: str+="Delete ";
                            break;
                    case 2: str+="Insert ";
                            break;
                    case 3: str+="Print ";
                            break;
                    case 4: str+="Rename ";
                            break;
                    case 5: str+="Paste ";
                            break;
                }
            }
        }
        else if(t instanceof Character[]){
            for (int i = 0; i < t.length; i++) {
//                Character[] y = (Character[]) t;
                switch((Character)t[i]){
                    case 'C': str+="Copy ";
                            break;
                    case 'D': str+="Delete ";
                            break;
                    case 'I': str+="Insert ";
                            break;
                    case 'P': str+="Print ";
                            break;
                    case 'R': str+="Rename ";
                            break;
                    case 'V': str+="Paste ";
                            break;
                }
            }
        }
        return str;
    }
}
