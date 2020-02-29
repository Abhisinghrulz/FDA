<h1>Dynamic Programming</h1>

Dynamic programming is a technique for solving certain type of complex problems efficiently by breaking them down into simpler subproblems and 
solving each subproblem exactly once. Dynamic programming stores the results of subproblems in a table and reuse them when needed to avoid solving the same subproblems again and again. 

<b>Dynamic Programming Approaches</b>
1) Top Down Approach (Memoization)
2) Bottom Up Approach (Tabulation)


<b>Top Down Approach </b>->

1) Implemented using recursion and caching.
2) Whenever the recursive function 

<b>Bottom up approach / Tabulation</b> ->
 
 1. We solve all the smaller sub problems first which will be needed to solve the larger problems then move on to solving larger problems using the results of smaller subproblems. 
 2. We use for-loop to iterate over all the subproblems and solve them. 
 3. Also called tabulation method or table filling method.

Using Dynamic Programming we avoid solving overlapping subproblems and we solve each subproblem only once and save the result in a cache. When its needed again we will get the result from the cache instead of solving then again.

Time and space tradeoff Dynamic programming is essentially a tradeoff of space for time. Dyanmic programming = recursion + caching