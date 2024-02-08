/**
 * The Calculator class performs basic arithmetic operations such as addition,
 * subtraction,
 * multiplication, and division on two operands.
 */
class Calculator {
    float addition(float opreand_1, float operand_2) {
        return opreand_1 + operand_2;
    }
    
    float substraction(float opreand_1, float operand_2) {
        return opreand_1 - operand_2;
    }

    float multipliacation(float opreand_1, float operand_2) {
        return opreand_1 * operand_2;
    }

    float division(float opreand_1, float operand_2) {
        return opreand_1 / operand_2;
    }

    public static void main(String[] args) {
        float opreand_1 = 10;
        float operand_2 = 5;
        Calculator calc = new Calculator();

        float add_result = calc.addition(opreand_1, operand_2);
        System.out.println("Addition result: " + add_result);

        float sub_result = calc.substraction(opreand_1, operand_2);
        System.out.println("Subtraction result: " + sub_result);

        float mul_result = calc.multipliacation(opreand_1, operand_2);
        System.out.println("Multiplication result: " + mul_result);

        float div_result = calc.division(opreand_1, operand_2);
        System.out.println("Division result: " + div_result);
    }
}
