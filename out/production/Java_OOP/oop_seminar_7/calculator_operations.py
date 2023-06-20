from abc import abstractmethod

class all_operations():
    @abstractmethod
    def oper(self, z1, z2):
        pass

class complex:
    def __init__(self, real, imag):
        self.real = real
        self.imag = imag

    def __str__(self):
        return f"{self.real} + {self.imag}i"

    def __repr__(self):
        return f"ComplexNumber({self.real}, {self.imag})"

class add(all_operations):
    def perform(self, z1, z2):
        return complex(z1.real + z2.real, z1.imag + z2.imag)

class multiply(all_operations):
    def perform(self, z1, z2):
        return complex(z1.real * z2.real - z1.imag * z2.imag, z1.real * z2.imag + z1.imag * z2.real)

class division(all_operations):
    def perform(self, z1, z2):
        d = z2.real ** 2 + z2.imag ** 2
        try:
            return complex((z1.real * z2.real + z1.imag * z2.imag) / d, (z1.imag * z2.real - z1.real * z2.imag) / d)
        except ZeroDivisionError:
            print('Division by zero')