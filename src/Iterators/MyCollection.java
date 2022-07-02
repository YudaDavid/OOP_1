package Iterators;

import java.util.Iterator;

public class MyCollection implements Iterable<Integer>{
    private int[][] matrix;

    public MyCollection(int n){
        matrix = new int[n][n];
    }

    public void put(int x, int i, int j){
        matrix[i][j] = x;
    }



    @Override
    public Iterator<Integer> iterator() {
        return new DiagonalIterator();
    }

    private class RowIterator implements Iterator<Integer> {

        int i = 0;
        int j = 0;

        @Override
        public boolean hasNext() {
            if (i>= matrix.length)
                return false;
            return true;
        }

        @Override
        public Integer next() {
            int ans = matrix[i][j];
            j++;
            if (j>=matrix.length) {
                j = 0;
                i++;
            }
            return ans;
        }
    }


    private class ColumnIterator implements Iterator {

        int i = 0;
        int j = 0;

        @Override
        public boolean hasNext() {
            if (j>= matrix.length)
                return false;
            return true;
        }

        @Override
        public Object next() {
            int ans = matrix[i][j];
            i++;
            if (i>=matrix.length) {
                i = 0;
                j++;
            }
            return ans;
        }
    }


    private class DiagonalIterator implements Iterator<Integer> {

        private int i =matrix.length-1;
        private int j = 0;
        private int lastI =i;
        private int lastJ =0;


        @Override
        public boolean hasNext() {
            if(lastI==0&& lastJ==matrix.length)return false;
            else
                return true;
        }

        @Override
        public Integer next() {
            int ans = matrix [i] [j];
            i++;
            j++;
            if( i== matrix.length) {
                lastI--;
                if(lastI >-1) {
                    j= lastJ;
                    i=lastI;
                }
            }
            if(j==matrix.length) {
                lastJ++;
                lastI=0;
                if(lastJ<matrix.length) {
                    i=lastI;
                    j=lastJ;
                }
            }
            return ans;
        }
    }


}










