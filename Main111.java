import java.util.*;

public class Main111 {
    public static void main(String[] args) {
        
        testRationalFraction();
        testRationalVector2D();
        testComplexNumber();
        testComplexVector2D();
        testRationalMatrix2x2();
        testComplexMatrix2x2();
        testRationalComplexNumber();
        testRationalComplexVector2D();
        testRationalComplexMatrix2x2();
	}
	
	private static void testRationalFraction() {

        RationalFraction f1 = new RationalFraction(1, 2);
        RationalFraction f2 = new RationalFraction(2, 3);
        RationalFraction f3 = new RationalFraction(3, 4);
        RationalFraction f4 = new RationalFraction(4, 6);
        
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);
        System.out.println("f3 = " + f3);
        System.out.println("f4 = " + f4 + " (автоматическое упрощение)");
        
        System.out.println(" Операции: ");
        System.out.println("f1 + f2 = " + f1.add(f2));
        System.out.println("f1 - f2 = " + f1.sub(f2));
        System.out.println("f1 * f2 = " + f1.mult(f2));
        System.out.println("f2 == f4? " + f2.equals(f4));
        
        System.out.println();
    }
    
    private static void testRationalVector2D() {
        RationalVector2D v1 = new RationalVector2D(new RationalFraction(1, 2), new RationalFraction(2, 3));  
        RationalVector2D v2 = new RationalVector2D(new RationalFraction(3, 4), new RationalFraction(1, 5));
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        
        RationalVector2D sum = v1.add(v2);
        System.out.println("v1 + v2 = " + sum);
        
        System.out.println("Длина v1 = " + v1.length());
        System.out.println("Скалярное произведение v1·v2 = " + v1.scalarProduct(v2));
        
        System.out.println();
    }
    
    private static void testComplexNumber() {
        ComplexNumber c1 = new ComplexNumber(1, 2);
        ComplexNumber c2 = new ComplexNumber(3, -1);
        ComplexNumber c3 = new ComplexNumber(0, 4);
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        
        System.out.println(" Операции: ");
        System.out.println("c1 + c2 = " + c1.add(c2));
        System.out.println("c1 - c2 = " + c1.sub(c2));
        System.out.println("c1 * c2 = " + c1.mult(c2));
        System.out.println("c1 * c3 = " + c1.mult(c3));
        
        System.out.println();
    }
    
    private static void testComplexVector2D() {
        ComplexVector2D cv1 = new ComplexVector2D(new ComplexNumber(1, 2), new ComplexNumber(3, -1));
        ComplexVector2D cv2 = new ComplexVector2D(new ComplexNumber(2, 1), new ComplexNumber(0, 3));
        System.out.println("cv1 = " + cv1);
        System.out.println("cv2 = " + cv2);
        
        ComplexVector2D sum = cv1.add(cv2);
        System.out.println("cv1 + cv2 = " + sum);
        
        ComplexNumber scalarProd = cv1.scalarProduct(cv2);
        System.out.println("Скалярное произведение cv1·cv2 = " + scalarProd);
        
        System.out.println();
    }
    
    private static void testRationalMatrix2x2() {
        RationalMatrix2x2 m1 = new RationalMatrix2x2(
            new RationalFraction(1, 2),
            new RationalFraction(1, 3),
            new RationalFraction(2, 3),
            new RationalFraction(3, 4)
        );
        
        RationalMatrix2x2 m2 = new RationalMatrix2x2(
            new RationalFraction(1, 4),
            new RationalFraction(1, 5),
            new RationalFraction(1, 6),
            new RationalFraction(1, 7)
        );
        
        System.out.println(" Матрица M1: ");
        System.out.println(m1);
        System.out.println(" Матрица M2: ");
        System.out.println(m2);
        
        System.out.println(" Операции: ");
        System.out.println("M1 + M2:");
        System.out.println(m1.add(m2));
        
        System.out.println(" M1 * M2:");
        System.out.println(m1.mult(m2));
        
        System.out.println(" Определитель M1 = " + m1.det());
        System.out.println("Определитель M2 = " + m2.det());
        
        RationalVector2D vec = new RationalVector2D(
            new RationalFraction(1, 2),
            new RationalFraction(2, 3)
        );
        System.out.println(" Вектор v = " + vec);
        System.out.println("M1 * v = " + m1.multVector(vec));
        
        System.out.println();
    }
    
    private static void testComplexMatrix2x2() {
        ComplexMatrix2x2 cm1 = new ComplexMatrix2x2(
            new ComplexNumber(1, 2),
            new ComplexNumber(3, -1),
            new ComplexNumber(0, 4),
            new ComplexNumber(2, 0)
        );
        
        ComplexMatrix2x2 cm2 = new ComplexMatrix2x2(
            new ComplexNumber(2, 1),
            new ComplexNumber(-1, 3),
            new ComplexNumber(4, -2),
            new ComplexNumber(0, 1)
        );
        
        System.out.println(" Комплексная матрица CM1: ");
        System.out.println(cm1);
        System.out.println(" Комплексная матрица CM2: ");
        System.out.println(cm2);
        
        System.out.println(" Операции: ");
        System.out.println("CM1 + CM2:");
        System.out.println(cm1.add(cm2));
        
        System.out.println(" CM1 * CM2: ");
        System.out.println(cm1.mult(cm2));
        
        System.out.println(" Определитель CM1 = " + cm1.det());
        
        ComplexVector2D cvec = new ComplexVector2D(
            new ComplexNumber(1, 1),
            new ComplexNumber(2, -1)
        );
        System.out.println(" Комплексный вектор cv = " + cvec);
        System.out.println("CM1 * cv = " + cm1.multVector(cvec));
        
        System.out.println();
    }
    
    private static void testRationalComplexNumber() {
        RationalComplexNumber rc1 = new RationalComplexNumber(
            new RationalFraction(1, 2),
            new RationalFraction(1, 3)
        );
        
        RationalComplexNumber rc2 = new RationalComplexNumber(
            new RationalFraction(2, 3),
            new RationalFraction(-1, 4)
        );
        
        RationalComplexNumber rc3 = new RationalComplexNumber(
            new RationalFraction(0, 1),
            new RationalFraction(2, 3)
        );
        
        System.out.println("rc1 = " + rc1);
        System.out.println("rc2 = " + rc2);
        System.out.println("rc3 = " + rc3);
        
        System.out.println(" Операции: ");
        System.out.println("rc1 + rc2 = " + rc1.add(rc2));
        System.out.println("rc1 - rc2 = " + rc1.sub(rc2));
        System.out.println("rc1 * rc2 = " + rc1.mult(rc2));
        System.out.println("rc3 * rc3 = " + rc3.mult(rc3));
        
        System.out.println();
    }

    private static void testRationalComplexVector2D() {
        RationalComplexVector2D rcv1 = new RationalComplexVector2D(
            new RationalComplexNumber(
                new RationalFraction(1, 2),
                new RationalFraction(1, 3)
            ),
            new RationalComplexNumber(
                new RationalFraction(2, 3),
                new RationalFraction(-1, 4)
            )
        );
        
        RationalComplexVector2D rcv2 = new RationalComplexVector2D(
            new RationalComplexNumber(
                new RationalFraction(3, 4),
                new RationalFraction(0, 1)
            ),
            new RationalComplexNumber(
                new RationalFraction(0, 1),
                new RationalFraction(2, 5)
            )
        );
        
        System.out.println("rcv1 = " + rcv1);
        System.out.println("rcv2 = " + rcv2);
        
        RationalComplexVector2D sum = rcv1.add(rcv2);
        System.out.println("\nrcv1 + rcv2 = " + sum);
        
        RationalComplexNumber scalarProd = rcv1.scalarProduct(rcv2);
        System.out.println("Скалярное произведение rcv1·rcv2 = " + scalarProd);

        System.out.println();
    }
    
    private static void testRationalComplexMatrix2x2() {
        RationalComplexMatrix2x2 rcm1 = new RationalComplexMatrix2x2(
            new RationalComplexNumber(
                new RationalFraction(1, 2),
                new RationalFraction(1, 3)
            ),
            new RationalComplexNumber(
                new RationalFraction(2, 3),
                new RationalFraction(-1, 4)
            ),
            new RationalComplexNumber(
                new RationalFraction(3, 4),
                new RationalFraction(0, 1)
            ),
            new RationalComplexNumber(
                new RationalFraction(1, 5),
                new RationalFraction(2, 5)
            )
        );
        
        RationalComplexMatrix2x2 rcm2 = new RationalComplexMatrix2x2(
            new RationalComplexNumber(
                new RationalFraction(1, 3),
                new RationalFraction(1, 4)
            ),
            new RationalComplexNumber(
                new RationalFraction(2, 5),
                new RationalFraction(-1, 6)
            ),
            new RationalComplexNumber(
                new RationalFraction(3, 7),
                new RationalFraction(0, 1)
            ),
            new RationalComplexNumber(
                new RationalFraction(4, 9),
                new RationalFraction(1, 2)
            )
        );
        
        System.out.println("Матрица RCM1:");
        System.out.println(rcm1);
        System.out.println("\nМатрица RCM2:");
        System.out.println(rcm2);
        
        System.out.println("\nОперации:");
        System.out.println("RCM1 + RCM2:");
        System.out.println(rcm1.add(rcm2));
        
        System.out.println("\nRCM1 * RCM2:");
        System.out.println(rcm1.mult(rcm2));
        
        System.out.println("\nОпределитель RCM1 = " + rcm1.det());
        
        RationalComplexVector2D rcv = new RationalComplexVector2D(
            new RationalComplexNumber(
                new RationalFraction(1, 2),
                new RationalFraction(1, 3)
            ),
            new RationalComplexNumber(
                new RationalFraction(2, 3),
                new RationalFraction(-1, 4)
            )
        );
        
        System.out.println("\nВектор rcv = " + rcv);
        System.out.println("RCM1 * rcv = " + rcm1.multVector(rcv));
        
        System.out.println();
    }
}