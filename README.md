# Tetranacci-calculators

a) In this programming assignment, you will design in pseudo code and implement in Java two
recursive versions of Tetranacci calculators and experimentally compare their runtime
performances. Tetranacci numbers are a more general version of Fibonacci numbers and start
with four predetermined terms, each term afterwards being the sum of the preceding four terms.
The first few Tetranacci numbers are:
0, 0, 0, 1, 1, 2, 4, 8, 15, 29, 56, 108, 208, 401, 773, 1490, …
For that, with each implemented version you will calculate Tetranacci(5), Tetranacci(10), etc. in
increments of 5 up to Tetranacci (100) (or higher value if required for your timing measurement) and
measure the corresponding run times (for instance, Tetranacci(10) returns 56). You can use Java’s
built-in time function for this purpose. You should redirect the output of each program to an out.txt
file. You should write about your observations on timing measurements in a separate text file. You
are required to submit the two fully commented Java source files, the compiled executables, and the
text files.
b) Briefly explain why the first algorithm is of exponential complexity and the second one is linear
(more specifically, how the second algorithm resolves some specific bottleneck(s) of the first
algorithm). You can write your answer in a separate file and submit it together with the other
submissions.
c) Do any of the previous two algorithms use tail recursion? Why or why not? Explain your answer.
If your answer is “No” then:
Can a tail-recursive version of Tetranacci calculator be designed?
i. If yes; write the corresponding pseudo code for that tail recursion algorithm and
implement it in Java and repeat the same experiments as in part (a) above.
ii. If no, explain clearly why such tail-recursive algorithm is infeasible.
