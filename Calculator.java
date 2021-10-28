import java.util.Scanner;

class Calculator {
        public static void main (String[] args) {
            double a;
            double b;
            double result;

       Scanner scannerObject = new Scanner(System.in);
do {

System.out.print("Votre premier chiffre:\n");
a = scannerObject.nextDouble();
System.out.print("Votre second chiffre:\n");
b = scannerObject.nextDouble();

System.out.print("Choisissez votre opérateur dans cette liste (+, -, *, /, %, ^) :\n ");
char operator = scannerObject.next().charAt(0);
switch (operator) {
case '+':
result = a + b;
break;
case '-':
result = a - b;
break;
case '*':
result = a * b;
break;
case '/':
result = a / b;
break;
case '%':
result = a % b;
break;
case '^':
result = Math.pow(a, b);
break;
case 'Q':
System.exit(0);
default:
System.out.printf("Merci de spécifier un opérateur dans la liste");
return;
}            

System.out.println("Votre résultat est celui ci " + result);
} while (result != 'Q');
scannerObject.close();
}
        }