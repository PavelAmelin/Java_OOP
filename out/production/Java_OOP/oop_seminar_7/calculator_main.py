import logging
from calculator_operations import complex
from calculator_operations import add
from calculator_operations import multiply
from calculator_operations import division

class complex_calculator:
    def __init__(self):
        self.operation = None
        logging.basicConfig(filename="complex_calc.log", level=logging.INFO)

    def get_operation(self, operation):
        self.operation = operation

    def perform_operation(self, z1, z2):
        result = self.operation.perform(z1, z2)
        logging.info(f'operation: {type(self.operation).__name__}, {z1}, {z2}, result: {result}')
        return result

def main():
    calculator = complex_calculator()
    a = complex(24, 6)
    b = complex(8, 3)

    calculator.get_operation(add())
    res = calculator.perform_operation(a, b)
    print(res)

    calculator.get_operation(multiply())
    res = calculator.perform_operation(a, b)
    print(res)

    calculator.get_operation(division())
    res = calculator.perform_operation(a, b)
    print(res)

if __name__ == "__main__":
    main()
