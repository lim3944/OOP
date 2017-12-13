
public class test {
	public static void main(String[] args){
		Matrix testMat = new Matrix(4,2);
		Matrix testMat2 = new Matrix(2,3);
		Matrix testMat3 = new Matrix(2,3);
		SquareMatrix sqMat = new SquareMatrix(3);
		Vector vec = new Vector(4);
		Vector vec2 = new Vector(4);
		
		testMat.randomize();
		testMat2.randomize();
		testMat3.randomize();
		sqMat.randomize();
		vec.randomize();
		vec2.randomize();
		
		System.out.println("Test Matirx 1: \n"+testMat);
		System.out.println("Test Matirx 2: \n"+testMat2);
		System.out.println("Test Matirx 3: \n"+testMat3);
		
		System.out.println("Square Matrix: \n"+sqMat);;
		System.out.println("Test Matrix1 * Test Matrix 2: \n"+testMat.multiply(testMat2));
		System.out.println("Test Matrix2 * Square Matrix : \n"+testMat2.multiply(sqMat));
		System.out.println("Test Matrix2 + Test Matrix 3 : \n"+testMat2.add(testMat3));
		
		sqMat.transpose();
		System.out.println("Transposed Square Matrix : \n"+sqMat);
		
		System.out.println("Vectors: \n"+vec+"\n"+vec2);
		System.out.println("vector1 * vector2: "+vec.multiply(vec2));
		System.out.println("Square Matrix identity: \n"+sqMat.identity());
		System.out.println("Is Square Matrix diagonal?: "+sqMat.isDiagonal());
		System.out.println("Square Matrix identity diagonal?: "+sqMat.identity().isDiagonal());
		
	}
}
