package Lesson36;

import java.util.Iterator;


public class TreeExtern implements Iterator<Integer>
{

        int[] arr;
        int index = 0;

        public TreeExtern(int[] array)
        {
            arr = array;
        }

        @Override
        public boolean hasNext ()
        {
            return index < arr.length;
        }

        @Override
        public Integer next ()
        {
            return arr[index++];
        }

        @Override
        public void remove ()
        {
        }

    }
