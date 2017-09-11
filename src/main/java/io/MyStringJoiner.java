package io;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Vladimir on 9/4/2017.
 */
public class MyStringJoiner {
    private String delimiter;
    private String str;

    public MyStringJoiner(String delimiter) {
        this.delimiter = delimiter;
    }

    public void add(String str){
        if (this.str == null){
            this.str = str;
        } else {
            this.str += delimiter + str;
        }
    }

    public void clear(){
        str = null;
    }

    public String onPrint(){
        if (str == null){
            return "";
        }
        return this.str;
    }

    public boolean isEmpty(){
        return str == null;
    }

    public boolean contains(String str){
        return this.str.contains(str);
    }
}
