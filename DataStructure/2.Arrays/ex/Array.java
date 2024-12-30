package ex;

public class Array {

    private int[] items;

    public Array(int length) {
        items = new int[length];
    }

    public void print(){
        for(int i = 0; i <= items.length; i++){
            System.out.print(items[i ]);
    
    }
}

    // public void insert(int i) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'insert'");
    // }

    // public char[] indexOf(int i) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    // }

    // public void remove(int i) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'remove'");
    // }
}
