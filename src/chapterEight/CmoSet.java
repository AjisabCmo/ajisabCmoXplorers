package chapterEight;

public class CmoSet {

private final CmoArrayList cmoArray = new CmoArrayList();


    public boolean isEmpty() {

        return cmoArray.isEmpty();
    }

    public void add(int i) {
        cmoArray.add(i);
    }
    public void remove(int i){
        cmoArray.remove(i);


    }

    public int getSize() {
       return cmoArray.getSize();
    }
}
