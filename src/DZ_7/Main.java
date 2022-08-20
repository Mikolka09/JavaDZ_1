package DZ_7;

public class Main {
    public static void main(String[] args){
        //MyArray arr = new MyArray(5);

        //arr.fillArray();
        //arr.fillRandom(10);
        //arr.print();
        //arr.max();
        //arr.min();
        //arr.avg();
        //arr.sortAsc();
        //arr.print();
        //arr.sortDesc();
        //arr.print();
        //arr.binarySearch(3);
        //arr.changeNumber(3, 10);
        //arr.print();

        MyMatrix mat1 = new MyMatrix(4,4);
        MyMatrix mat2 = new MyMatrix(4,4);
        //mat.fillMatrix();
        mat1.fillMatrixRandom(10);
        mat1.print();
        mat2.fillMatrixRandom(10);
        mat2.print();
        //MyMatrix newMat = MyMatrix.subtractMatrix(mat1, mat2);
        MyMatrix newMat = MyMatrix.multiplyMatrix(mat1, mat2);
        newMat.print();
        //mat.max();
        //mat.min();
        //mat.avg();
    }
}
