package ch06;

import java.util.Arrays;

public class ArrayList {
    private Object[] elems;
    private int next;
   
    public ArrayList(int capacity) {
        elems = new Object[capacity];
    }

    public ArrayList() {
        this(16);
    }

    public void add(Object o) {
        if(next == elems.length) {
            elems = Arrays.copyOf(elems, elems.length * 2);
        }
        elems[next++] = o;
    }
    
    public Object get(int index) {
        return elems[index];
    }
    
    public int size() {
        return next;
    }

    @Override
    public boolean equals(Object other) {
        if(this == other)
            return true;

        if(! (other instanceof ArrayList))
            return false;

        ArrayList list = (ArrayList) other;

        if(this.size() != list.size())
            return false;

        for (int i = 0; i < size() ; i++) {
            if(this.get(i) != list.get(i))
                return false;

            return true;

        }

        return true;
    }


    @Override
    public String toString(){
        String str = "";

        for (int i = 0; i < size() ; i++) {
            str += get(i);
            str += " ";
        }

        return str;
    }
}