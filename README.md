# Scala Bug: Unexpected IllegalArgumentException

This repository demonstrates a subtle bug in a Scala class that uses an auxiliary constructor. The bug results in an unexpected `IllegalArgumentException` when the default constructor is used.  The root cause is the conditional check within a method that doesn't account for default values established through the auxiliary constructor.

## Bug Description
The `MyClass` class has an auxiliary constructor that initializes `x` to 0 if no argument is provided.  However, the `myMethod` function throws an `IllegalArgumentException` if `x` is not greater than 5.  This leads to an exception when creating an instance of `MyClass` using the default constructor.

## Solution
The solution involves either modifying the condition in `myMethod` to handle the case where `x` could be less than or equal to 5 or providing a more appropriate way to handle this edge case (e.g., providing a default return value or a different exception handling strategy).