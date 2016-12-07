# Exercise: Matching brackets 

We are going to verify that within a given expression, pairs of (round) brackets are matching. E.g. “()()” is correct, but “)(()” isn’t. We need a data structure called “stack” to help us with this task.

A stack has two methods, `push()` and `pop()`. Calling `push(element)` will add the given element to the stack. When calling `pop()` immediately after that, the element will be returned and removed from the stack. If you try to pop an element from an empty stack, it should throw a `NoSuchElementException`.

For this particular situation we need a stack of strings to keep track of the history.

1.  Start with the implementation of the Stack class, with the `push()` and `pop()` methods. You could verify the correctness of your implementation in your application’s main method (of course, if you know how to do it, you should write a test class for JUnit).
2.  Continue with the implementation of the ExpressionValidator class. It has a method `hasMatchingBrackets()` which returns a boolean answer, indicating whether the given expression contains only matching brackets.
3.  Bonus assignment: also verify matching square brackets.
4.  Bonus assignment: make the Stack class a generic class.
