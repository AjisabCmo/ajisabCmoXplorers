package chapterEight;

public class CmoArrayList {

    private int size;
    private final int  capacity=10;
    private final int [] array = new int [capacity];



    public boolean isEmpty() {
        if(size==0)

        return true;
        else
            return false;




        }

    public void add(int element) {
        array[size]=element;
        size++;




        }




    public void remove(int element){
        for (int i = 0 ; i < size ; i++){

            if ( array[i] == element){
                for (int j = 0 ; j < (size-i-1);j++){
                    array[i+j]=array[i+j+1];

                }
                array[size-1] =0;
                size--;
            }

        }


    }
    public int getSize(){

        return size;
    }
}


